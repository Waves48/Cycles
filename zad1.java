package org.itstep;

public class zad1 {
    public static void main(String[] args){
        /*Задание 1. Обнулить бит в первом разряде числа N. Остальные биты не должны изменить свое значение. Вывести на консоль в двоичном виде.*/
        byte b = 0b1011; // turn the rightest to null
        byte result = (byte) (~(1 << 1)&b); // смешаем на один влево - выходит 2: ~ - побитовое отрицание;
        String binary = Integer.toBinaryString(result);
        System.out.println(binary);



    }
}
