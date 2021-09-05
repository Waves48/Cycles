package org.itstep;

import javax.swing.*;

public class zad2 {
    public static void main (String[] args){
        // Задание 2. Вывести на консоль 2 в степени n. Для вычислении пользовать только побитовые операции.
        byte one = 0b0001;
       byte n = 2;
        byte result = (byte) (one << n);
        System.out.println(result);

    }
}
