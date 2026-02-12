package com.allan.vetor.test;

import com.allan.vetor.Vetor;

public class main04 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);
        vetor.adds("Elemento 1");
        vetor.adds("Elemento 2");
        vetor.adds("Elemento 3");
        System.out.println(vetor.get(3));

    }
}