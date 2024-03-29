/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.anhembi.a3;

import com.anhembi.a3.Threads.Servidor;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingWorker;
import java.lang.*;

/**
 *
 * @author TheBl
 */
public class ChatServidor extends javax.swing.JFrame {

    String nomeUsuario;
    int porta;
    List<Socket> clientes;

    /**
     * Creates new form ChatServidor
     */
    public ChatServidor(String idEvento, String nomeEvento, String nomeUsuario) {
        this.clientes = new ArrayList<>();
        initComponents();

        txtFieldID.setText(idEvento);
        txtFieldNome.setText(nomeEvento);
        this.nomeUsuario = nomeUsuario;

        this.setTitle("Servidor");
        this.setResizable(false);
        this.setSize(700, 800);

        this.porta = 9000 + Integer.parseInt(idEvento);
        initSelfListeners();

    }

    private void initSelfListeners() {
        WindowListener taskStarterWindowListener = new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Aguardando conexão...");

                SwingWorker<Void, String> realizarConexaoWorker = new SwingWorker<Void, String>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        ServerSocket serverSocket = new ServerSocket();
                        serverSocket = new ServerSocket(porta);

                        try {
                            boolean flagAddClient = false;

                            while (!serverSocket.isClosed()) {
                                Socket clientSocket = new Socket();

                                try {
                                    System.out.println("Servidor: Aguardando o cliente...");
                                    clientSocket = serverSocket.accept();

                                    if (flagAddClient) {
                                        clientes.add(clientSocket);

                                    }
                                    flagAddClient = !flagAddClient;

                                } catch (Exception e) {
                                    System.out.println("Servidor: Erro na conexão");
                                }

                            }
                        } catch (Exception e) {
                            System.out.println("Porta em uso");
                        }
                        return null;
                    }
                };

                SwingWorker<Void, String> recebeMensagemWorker = new SwingWorker<Void, String>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        while (true) {
                            try {

                                for (Socket cliente : clientes) {
                                    System.out.println("Servidor: Cliente");

                                    DataInputStream din = new DataInputStream(cliente.getInputStream());

                                    String message = din.readUTF();

                                    for (Socket clienteEnvio : clientes) {
                                        DataOutputStream dout = new DataOutputStream(clienteEnvio.getOutputStream());
                                        dout.writeUTF(message);

                                    }

                                    chatBox.append(message);

                                }
                            } catch (Exception e) {
                                System.out.println("Servidor: Sem novas mensagens");
                            }
                        }

                    }
                };
                realizarConexaoWorker.execute();
                recebeMensagemWorker.execute();
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        };

        //Here is where the magic happens! We make (a listener within) the frame start listening to the frame's own events!
        this.addWindowListener(taskStarterWindowListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldNome = new javax.swing.JTextField();
        txtFieldID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFieldNome.setEnabled(false);
        txtFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNomeActionPerformed(evt);
            }
        });

        txtFieldID.setEnabled(false);

        jLabel1.setText("ID");

        jLabel2.setText("Nome do Evento");

        chatBox.setEditable(false);
        chatBox.setColumns(20);
        chatBox.setRows(5);
        jScrollPane1.setViewportView(chatBox);

        jLabel3.setText("Mensagem");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean sucesso = false;
        for (Socket cliente : clientes) {
            try {
                DataOutputStream dout = new DataOutputStream(cliente.getOutputStream());

                dout.writeUTF("\n" + nomeUsuario + ": " + jTextArea1.getText());
                sucesso = true;

            } catch (Exception e) {
                System.out.println("Falha ao enviar mensagem");
            }
        }
        if (sucesso) {
            chatBox.append("\n" + nomeUsuario + ": " + jTextArea1.getText());
        }
        jTextArea1.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtFieldID;
    private javax.swing.JTextField txtFieldNome;
    // End of variables declaration//GEN-END:variables
}
