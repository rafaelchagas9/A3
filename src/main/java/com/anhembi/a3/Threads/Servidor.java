/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhembi.a3.Threads;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author TheBl
 */
public class Servidor extends Thread{

    int eventoPorta;

    public Servidor(int porta) {

        this.eventoPorta = 9000 + porta;

    }

    @Override
    public void run() {

    }
}
