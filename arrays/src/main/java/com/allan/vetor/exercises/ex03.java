package com.allan.vetor.exercises;

import com.allan.vetor.VetorList;

public class ex03 {
    public static void main(String[] args) {
        VetorList<String> vetor = new VetorList<String>(100);

        vetor.adds("A");
        vetor.adds("B");
        vetor.adds("C");

        System.out.println(vetor);

        vetor.remove("B");

        System.out.println(vetor);
    }
}
