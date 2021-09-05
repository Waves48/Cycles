package org.itstep;

public class primitive_types {
public static void main(String[] args){
    // each prim type has a corresponding "wrapper class"
    // while transforming from one class
    //форматирование из одной системы в другую - numerical
    System.out.printf("boolean: min=%b, max=%b, range=%d \n", Boolean.FALSE, Boolean.TRUE, 1);
    System.out.printf("byte: min=%d, max=%d, range=%d \n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.BYTES);
    System.out.printf("short: min=%d, max=%d, range=%d \n", Short.MIN_VALUE, Short.MAX_VALUE, Short.BYTES);
    System.out.printf("integer: min=%d, max=%d, range=%d \n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.BYTES);
    System.out.printf("long: min=%d, max=%d, range=%d \n", Long.MIN_VALUE, Long.MAX_VALUE, Long.BYTES);
   // вещественные
    System.out.printf("float: min=%f, max=%f, range=%d \n", Float.MIN_VALUE, Float.MAX_VALUE, Float.BYTES);
    System.out.printf("double: min=%f, max=%f, range=%d \n", Double.MIN_VALUE, Double.MAX_VALUE, Double.BYTES);
   // char - separate thing, doesn't have that shit
    System.out.println("Positive infinity = " + Double.POSITIVE_INFINITY);
    System.out.println("Negative infinity = " + Double.NEGATIVE_INFINITY);
    System.out.println("Not a number = " + Double.NaN);
    System.out.println("Minimal value = " + Double.MIN_VALUE);
    System.out.println("Normal value = " + Double.MIN_NORMAL);










}
}
