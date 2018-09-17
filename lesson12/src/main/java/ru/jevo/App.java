package ru.jevo;

import ru.jevo.exceptions.MyArrayDataException;
import ru.jevo.exceptions.MyArraySizeException;
import static java.lang.Integer.parseInt;


public class App {
    static String[] arraySym = {"1", "2", "3", "блим", "4", "5", "6", "7", "8", "9", "10"};

    public static void checkArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 | arr[0].length != 4) throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arraySym[(int) ((Math.random() * arraySym.length))];
                try {
                    sum += parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма чисел массива: " + sum);
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        try {
            String[][] array = new String[parseInt(args[0])][parseInt(args[1])];
            App.checkArr(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Размерность массива не введена");
        } catch (NumberFormatException e) {
            System.out.println("Размерность массива должна быть задана в числах");
        }
    }
}
