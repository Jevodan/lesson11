package ru.jevo.exceptions;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super("Массив должен быть задан размером 4#4");
    }
}
