/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummyData;

import com.anhembi.a3.models.Atleta;
import com.anhembi.a3.models.Evento;
import java.util.ArrayList;

/**
 *
 * @author TheBl
 */
public class DummyAtleta {
    public static ArrayList<Atleta> getData(){
        ArrayList<Atleta> atletas = new ArrayList<>();
        
        char[] senha = {'1', '2', '3', '4', '5', '6', '7', '8'};
        
        atletas.add(new Atleta("Fabiana Martins", "01/01/1974", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Andreza Pereita", "23/02/2001", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("André Santana", "12/03/2005", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Carlos Patrício", "12/04/2000", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Juan Soarez", "31/04/1982", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Pablo Zalem", "11/05/1996", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Rafael Martins", "22/06/1997", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Luiz Gustavo", "21/07/1972", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Aby Fernandez", "24/08/1973", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Catalina Sandino", "17/09/1974", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("John Fritz", "13/11/1975", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Emily Grey", "09/12/1976", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Anastacia Karanikolaou", "07/01/1977", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Vanessa Silva", "21/02/1978", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Thais Andrade", "22/03/1979", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Julia Pirillo", "23/04/1980", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Kaue Anastácio", "24/05/1981", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Guilherma Silva", "25/06/1982", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("José Antônio", "26/07/1983", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("José Henrique", "27/08/1984", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("Geovanna Gomez", "28/09/1985", "", 60.0f, 1.75f, "", senha));
        atletas.add(new Atleta("William Ribeiro ", "29/02/1986", "", 60.0f, 1.75f, "", senha));
        
        return atletas;
    }
}
