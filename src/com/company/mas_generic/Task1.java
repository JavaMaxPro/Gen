package com.company.mas_generic;

public class Task1 {
    public static <T> void castingElement(T[] mas, int index1, int index2) {
        if (mas == null) throw new IllegalArgumentException("Array is null");

        display(mas);

        checkIndexMas(mas, index1);
        checkIndexMas(mas, index2);

        casting(mas, index1, index2);

        display(mas);
        System.out.println("**************************");
    }

    private static <T> void display(T[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    private static <T> void casting(T[] mas, int index1, int index2) {
        T elements = mas[index1];
        mas[index1] = mas[index2];
        mas[index2] = elements;
    }

    private static <T> void checkIndexMas(T[] mas, int index) {
        if (index < 0 || index >= mas.length) throw new IllegalArgumentException(" Index %d wrong" + index);
    }

    public static void main(String[] args) {
        Integer[] mas1 = {1, 2, 3};
        String[] mas2 = {"a", "b", "c"};

        castingElement(mas1, 0, 1);
        castingElement(mas2, 0, 2);
    }
}
