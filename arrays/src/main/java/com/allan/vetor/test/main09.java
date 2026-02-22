package com.allan.vetor.test;

import com.allan.vetor.VetorObject;

public class main09 {
    public static void main(String[] args) {

        VetorObject vetor = new VetorObject(3);

        Contact c1 = new Contact
                ("Contato 1", "1234-5678", "contato1@gmail.com");
        Contact c2 = new Contact
                ("Contato 2", "5678-7894", "contato2@gmail.com");
        Contact c3 = new Contact
                ("Contato 3", "4546-5615", "contato3@gmail.com");

        Contact c4 = new Contact
                ("Contato 3", "4546-5615", "contato3@gmail.com");

        vetor.adds(c1);
        vetor.adds(c2);
        vetor.adds(c3);
        vetor.adds("1");

        System.out.println("Tamanho = " + vetor.size());

        int pos = vetor.get(c4);
        if(pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}
