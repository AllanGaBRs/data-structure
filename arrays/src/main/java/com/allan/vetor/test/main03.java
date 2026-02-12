package com.allan.vetor.test;

import com.allan.vetor.Vetor;

public class main03 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(20);
        vetor.adds("Elemento 1");
        vetor.adds("Elemento 2");
        vetor.adds("Elemento 3");
        System.out.println(vetor.size());

        System.out.println(vetor.toString());

    }
}
