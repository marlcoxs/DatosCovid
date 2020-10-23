/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcc
 */
public class ClasePrincipal {
    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<Incidencia>> casos_covid=new HashMap<>();
        try {
            FileReader fr=new FileReader("C:\\Marcos\\datos_ccaas.csv");
            BufferedReader br=new BufferedReader(fr);
            String linea= br.readLine();
            while(linea!=null){
                String[] datos=linea.split(",");
                String codigo=datos[0];
                String fecha=datos[1];
                String num_casos=datos[2];
                String num_casos_pcr=datos[3];
                Incidencia incidencia=new Incidencia(codigo,fecha,Integer.parseInt(num_casos),Integer.parseInt(num_casos_pcr));
                
                if(casos_covid.containsKey(codigo)){
                casos_covid.get(codigo).add(incidencia);
                }else{
                    ArrayList<Incidencia> incidencias=new ArrayList<>();
                    casos_covid.put(fecha, incidencias);
                    System.out.println(incidencia);
                }
            }
            fr.read();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
