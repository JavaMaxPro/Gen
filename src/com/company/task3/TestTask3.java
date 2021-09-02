package com.company.task3;

public class TestTask3 {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox2.add(new Apple());

        Box<Orange> orangeBox1 = new Box<>(new Orange(),new Orange());

        System.out.println("appelBox1 = "+ appleBox1.getWeight());
        System.out.println("appelBox2 = "+ appleBox2.getWeight());
        System.out.println("orangeBox1 = "+ orangeBox1.getWeight());
        System.out.println("Compare orange - apple1 - "+ appleBox1.compareTo(orangeBox1));
        System.out.println("-----------------------------------");
        appleBox1.transfer(appleBox2);

        System.out.println("appelBox1 = "+ appleBox1.getWeight());
        System.out.println("appelBox2 = "+ appleBox2.getWeight());
        System.out.println("-----------------------------------");
        System.out.println("orangeBox1 = "+ orangeBox1.getWeight());
        System.out.println("Compare orange - apple1 - "+ appleBox1.compareTo(orangeBox1));
        System.out.println("Compare orange - apple2 - "+ appleBox2.compareTo(orangeBox1));

    }
}
