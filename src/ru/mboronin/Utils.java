package ru.mboronin;

public class Utils {
    private int[] id;

    public static Number[] initArray(int size){
        Number[] array = new Number[size];
        for (int i = 0; i < size; i++){
            array[i] = Math.random();
        }
        return array;
    }
}
