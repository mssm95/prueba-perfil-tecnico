package com.gkudos.test.ejercicio2;

public class Prime {
    
    public boolean isPrime(int number){
        boolean primo;
        if(number>1){
            primo=true;
        }else{
            primo=false;
        }
        for(int i=2; i<number; i++){
            if(number%i==0){
                primo = false;
            }
        }
        return primo;
    }
    public void checkPrime(int ...numbers) {
        for(int i=0;i<numbers.length;i++){
            if(isPrime(numbers[i])){
                System.out.print(numbers[i]+ " ");
            }
        }
        System.out.print("\n");
    }
}
