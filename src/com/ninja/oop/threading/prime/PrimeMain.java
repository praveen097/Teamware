package com.ninja.oop.threading.

        prime;

public class PrimeMain {
    public static void main(String[] args) {
        SetPrime sp = new SetPrime();
        PrintPrime pp = new PrintPrime(sp);
        SetNumber sn = new SetNumber(sp);
        pp.start();
        sn.start();
    }
}
