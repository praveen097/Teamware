package com.ninja.oop.threading.prime;

public class SetPrime {
    int range = 5;
    int count = 0;
    public boolean isPrime(int n){
        if(n < 2)
            return false;
        for (int i = 2; i * i <= n ; i++)
            if(n % i == 0)
                return false;
        return true;

    }
     public synchronized void print(int n)  {
         this.range = n;
         notify();
     }
     public synchronized void set(int count) throws InterruptedException {
         this.count = count;
         int counter = 0;
         System.out.println("Range before was : " + this.range);
         for (int i =  2; i < this.range && counter < this.count; i++) {
             if(isPrime(i)) {
                 System.out.print(i + " ");
                 System.out.println();
                 counter++;
             }
         }
         if(counter < this.count){
             wait();
         }
         System.out.println("Range after is : " + this.range);
         counter = 0;
         for (int i =  2; i < this.range && counter < this.count; i++) {
             if(isPrime(i)) {
                 System.out.print(i + " ");
                 counter++;
             }
         }
     }
}
