package com.company.mas_generic;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
    String[] mas = {"a","b","c"};
    List<String> list = convert(mas);

    System.out.println(list);

    }
    public static <T> List<T> convert(T[] mas){
        List<T> list= new ArrayList<>();
        for (T ma : mas) {
            list.add(ma);
        }
        return list;
    }

}
