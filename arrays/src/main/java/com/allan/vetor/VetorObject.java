package com.allan.vetor;

public class VetorObject {
    private Object[] elements;
    private int size;

    public VetorObject(int capacity){
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public boolean adds(Object element) {
        this.incrementCapacity();
        if(this.size < this.elements.length){
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public void adds(int index, Object element) {
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
            Object[] newElements = new Object[this.elements.length * 2];
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

    public Object get(int index){
        if(!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("Invalid index");
        }
        return this.elements[index];
    }

    public int get(Object element){
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
