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
        this.incrementCapacity();
        if(this.size < this.elements.length){
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public void adds(int index, String element) {
        if(!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("Invalid index");
        }

        this.incrementCapacity();

        for(int i = this.size-1; i >= index; i--){
           this.elements[i+1] = this.elements[i];
        }

        this.elements[index] = element;
        size++;
    }

    private void incrementCapacity(){
        if(this.size == this.elements.length ){
            String[] newElements = new String[this.elements.length * 2];
            for(int i = 0; i < this.elements.length; i++){
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void remove(int index){
        if(!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("Invalid index");
        }
        for(int i=index; i <this.size-1; i++){
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
    }

    public String get(int index){
        if(!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("Invalid index");
        }
        return this.elements[index];
    }

    public int get(String element){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0; i < this.size-1; i++){
            sb.append(this.elements[i]);
            sb.append(", ");
        }

        if(this.size > 0){
            sb.append(this.elements[this.size-1]);
        }

        sb.append("]");

        return sb.toString();
    }
}