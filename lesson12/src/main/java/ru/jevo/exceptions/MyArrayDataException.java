package ru.jevo.exceptions;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("Нет такого числа ), в ячейке [" + i + ", " + j + "]  находится не число");
    }
}
