/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummyData;

import com.anhembi.a3.models.Evento;
import java.util.ArrayList;

/**
 *
 * @author TheBl
 */
public class DummyEvento {
    public static ArrayList<Evento> getData(){
        ArrayList<Evento> eventos = new ArrayList<>();
        
        eventos.add(new Evento("Campeonato de Ciclismo - 100km", "01/09/2023", "Ciclismo", DummyAtleta.getData()));
        
        return eventos;
    }
}
