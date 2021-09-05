package org.itstep;

public class zad4 {
    public static void main(String[] args){
        /*Задание 4. Инвертировать 1-й бит числа N. Вывести результат на
        консоль в двоичном виде.*/
        //влево единицу
        //искалючающая ИЛИ XOR
       // byte a = 0b0001;
      //  byte result = (byte) (a << 1);
       // byte fin = (byte) (a ^ result);
      //  System.out.println(fin);
        // счетчик high  - кол-во значащих чисел в числе - способ 1
       // byte b = 0b1001;
     //   int high = 0;
     //   byte number = b;
     //   while (number != 0) {
      //      number = (byte) (number >> 1);
      //      high++;
      //  }
     //   System.out.println(high);
        // способ 2 - разряды числа
        int n = 2000;
        int num = (int) Math.log10(n);
        System.out.println(num + 1);
        int b = 0b1001;
        int num2 = (int) (Math.log(b) / Math.log(2)+1);
        System.out.println(num2);
    }
}
