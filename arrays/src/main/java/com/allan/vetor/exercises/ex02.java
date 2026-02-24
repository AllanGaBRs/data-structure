package com.allan.vetor.exercises;

import com.allan.vetor.VetorList;

public class ex02 {
    public static void main(String[] args) {
        VetorList<String> vetor = new VetorList<String>(100);

        vetor.adds("A");
        vetor.adds("B");
        vetor.adds("C");
        vetor.adds("A");
        vetor.adds("B");
        vetor.adds("C");
        vetor.adds("A");
        vetor.adds("B");
        vetor.adds("C");

        System.out.println(vetor.lastIndexOf("A"));
        System.out.println(vetor.lastIndexOf("D"));

        System.out.println(vetor.lastIndexOf("C"));
    }
}