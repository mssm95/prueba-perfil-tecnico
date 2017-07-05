package com.gkudos.test.ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Autocomplete {
    
    public String[] getSuggestions(String query){
        ArrayList<String> coincidencias=new ArrayList();
        try {
            File fichero = new File(System.getProperty("user.dir")+"\\src\\com\\gkudos\\test\\ejercicio4\\nouns.txt");
            Scanner s = null;
            s = new Scanner(fichero);
            while (s.hasNextLine()){
                String linea = s.nextLine();
                boolean coinciden=true;
                for(int i=0;i<query.length();i++){
                    if(linea.toCharArray()[i]!=query.toCharArray()[i]){
                        coinciden=false;
                    }
                }
                if(coinciden){
                    coincidencias.add(linea);
                }
            }
            String[] resultado=new String[coincidencias.size()];
            for(int i=0; i<coincidencias.size();i++){
                resultado[i]=coincidencias.get(i);
            }
            return resultado;
	} catch (Exception ex) {
        	System.out.println(ex.getMessage());
	}
        return null;
    }
    
    public static void main(String[] args) {
        Autocomplete autocomplete = new Autocomplete();
        String[] resultado = autocomplete.getSuggestions("abba");
        for(int i=0; i<resultado.length; i++){
            System.out.println(resultado[i]);
        }        
    }
}
