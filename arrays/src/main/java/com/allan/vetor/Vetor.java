package com.allan.vetor;

public class Vetor {
    private String[] elements;
    private int size;

    public Vetor(int capacity){
        this.elements = new String[capacity];
        this.size = 0;
    }

    /*public void adds(String element){
        for(int i = 0; i < this.elements.length; i++){
            if(this.elements[i] == null){
                this.elements[i] = element;
                break;
            }
        }
    }*/

    /*public void adds(String element) throws Exception{
        if(this.size < this.elements.length){
            this.elements[this.size] = element;
            this.size++;
        } else {
            throw new Exception("The array is already full, it's not possible to add more items.");
        }
    }*/

    public boolean adds(String element) {
        if(this.size < this.elements.length){
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }
}