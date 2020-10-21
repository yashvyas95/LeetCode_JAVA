package com.Concepts.Threads;

import java.math.BigInteger;
import java.util.Comparator;

public class ComplexCalculation {
    public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) {
        BigInteger result;

        /*
            Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
            Where each calculation in (..) is calculated on a different thread
        */
        PowerCalculatingThread result1_Thread = new PowerCalculatingThread(base1,power1);
        PowerCalculatingThread result2_Thread = new PowerCalculatingThread(base2,power2);
        try{
            result1_Thread.join(2000);
            result2_Thread.join(2000);

        }
        catch(InterruptedException e){
            System.out.println("");
        }
        result = result1_Thread.getResult().add(result2_Thread.getResult());
        System.out.println("CALCULATION RESULT = " + result.toString());
        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
           /*
           Implement the calculation of result = base ^ power
           */
           result = base.pow(power.intValue());
        }

        public BigInteger getResult() { return result; }
    }

    public static void main(String[] args){
        ComplexCalculation c1 = new ComplexCalculation();
        BigInteger b1 = BigInteger.TEN;
        BigInteger b2 = BigInteger.TEN;
        BigInteger p1 = BigInteger.ZERO;
        BigInteger $p2 = BigInteger.ONE;


       // System.out.println("FINAL RESULT IN MAIN"+ c1.calculateResult(b1,p1,b2));
    }
}