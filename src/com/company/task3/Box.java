package com.company.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<E extends Fruit> {
    private List<E> boxFruits = new ArrayList<>();

    public Box(List<E> fruits) {
        this.boxFruits.addAll(fruits);
    }

    public Box(E... fruits) {
        this.boxFruits.addAll(Arrays.asList(fruits));
    }

    public void add(E fruit) {
        this.boxFruits.add(fruit);
    }

    public void transfer(Box<E> anotherBox) {
        for (E fruuit : boxFruits) {
            anotherBox.add(fruuit);
        }
        boxFruits.clear();
    }

    public double getWeight(){
        double sum = 0.0;
        for(E i : boxFruits){
            sum+=i.getWeight();
        }
        return  sum;
    }

    public boolean compareTo(Box<?> anotherBox){
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

}
