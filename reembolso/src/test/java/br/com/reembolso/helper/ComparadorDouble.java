package br.com.reembolso.helper;

public class ComparadorDouble {

    public static boolean igual(double a, double b){
        return Math.abs(a - b) < 0.01;
    }

}