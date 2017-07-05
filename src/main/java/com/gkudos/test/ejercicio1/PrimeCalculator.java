package com.gkudos.test.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeCalculator {

    public boolean esPrimo(int number){
        boolean primo=true;
        for(int i=2; i<number; i++){
            if(number%i==0){
                primo = false;
            }
        }
        return primo;
    }
    
    public int[] getPrimes(int number) {
    	
    	ArrayList<Integer> primes = new ArrayList();
        
        if(number>=0){
            for (int i=2; i<=number; i++){
                if(esPrimo(i)){
                    primes.add(i);
                }
            }
        }
        int[] resultado=new int[primes.size()];
        for(int i=0; i<primes.size();i++){
            resultado[i]=primes.get(i);
        }
    	return resultado;
    }

    public static void main(String[] args) {
        String num = "";
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("Número a analizar");
        num = entradaEscaner.nextLine ();
        PrimeCalculator calcPrimos = new PrimeCalculator();
        int[] primos=calcPrimos.getPrimes(Integer.parseInt(num));
        System.out.println("Los numeros primos hasta en número "+num+" son:");
        for (int i=0;i<primos.length; i++){
            System.out.println(primos[i]);
        }
        
    }
    
}