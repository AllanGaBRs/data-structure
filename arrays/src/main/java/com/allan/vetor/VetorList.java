package com.allan.vetor;

import java.lang.reflect.Array;

public class VetorList<T> {

    private T[] elements;
    private int size;

    public VetorList(int capacity){
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }
    public VetorList(int capacity, Class<T> classType){
        this.elements = (T[]) Array.newInstance(classType, capacity);
        this.size = 0;
    }

    public boolean adds(T element) {
        this.incrementCapacity();
        if(this.size < this.elements.length){
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public void adds(int index, T element) {
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
            T[] newElements = (T[]) new Object[this.elements.length * 2];
            for(int i = 0; i < this.elements.length; i++){
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public boolean contains(T element){
        /*for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(element)){
                return true;
            }
        }
        return false;*/

        return get(element) > -1;
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

    public T get(int index){
        if(!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("Invalid index");
        }
        return this.elements[index];
    }

    public int get(T element){
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
