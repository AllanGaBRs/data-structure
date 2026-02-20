package com.allan.vetor.test;

import com.allan.vetor.Vetor;

public class main08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adds("B");
        vetor.adds("C");
        vetor.adds("E");
        vetor.adds("F");

        System.out.println(vetor);

        vetor.remove(4);

        System.out.println(vetor);
    }
}
