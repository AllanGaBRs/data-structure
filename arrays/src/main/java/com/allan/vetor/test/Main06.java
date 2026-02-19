package com.allan.vetor.test;

import com.allan.vetor.Vetor;

public class Main06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adds("B");
        vetor.adds("C");
        vetor.adds("E");

        System.out.println(vetor);

        vetor.adds(0, "A");

        System.out.println(vetor);

        vetor.adds(3, "D");

        System.out.println(vetor);
    }
}
