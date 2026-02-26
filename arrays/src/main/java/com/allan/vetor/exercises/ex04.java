package com.allan.vetor.exercises;

import com.allan.vetor.VetorList;

public class ex04 {
    public static void main(String[] args) {
        VetorList<String> vetor = new VetorList<String>(100);

        vetor.adds("a");
        vetor.adds("a");
        vetor.adds("a");
        vetor.adds("a");
        vetor.adds("a");

        System.out.println(vetor);

        vetor.clear();

        System.out.println(vetor);

        vetor.adds("a");
        vetor.adds("a");
        vetor.adds("a");
        vetor.adds("a");
        vetor.adds("a");

        System.out.println(vetor);
    }
}
