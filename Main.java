package HomeWork14;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int m = 4;
        final int n = 5;
        int[][] mas = new int[m][n];

        fillMatrix(mas,0,10);
        printMatrix(mas);

        //Matrix20.
        // Дана матрица размера M × N. Для каждого столбца матрицы найти
        //произведение его элементов.

//        for (int j = 0; j < mas[0].length; j++) {
//            System.out.println("Произведение " + j + "-го столбца " + prOfRow(mas,j));
//        }

        //Matrix21.
        // Дана матрица размера M × N. Для каждой строки матрицы с
        // нечетным номером (1, 3, . . .) найти среднее арифметическое ее элементов.
        //Условный оператор не использовать
        //printAndArifmOddRows(mas);
    }

    // Функция под Matrix21.
    static void printAndArifmOddRows (int[][] arrayName){  //Row это  строка
        for (int i = 1; i < arrayName.length; i+=2) {    //arr.lenght перебирает количество строк в матрице
            int sum=0;
            System.out.print("Элементы расположенные в " + i + "-й строке: ");
            for (int j = 0; j < arrayName[i].length; j++) {   //arr[i].lenght кол-во столбцов в строке
                System.out.print(arrayName [i][j] + " ");
                sum=sum+arrayName[i][j];
            }
            double arifm = (sum/(double)arrayName[i].length);
            System.out.println();
            System.out.println("Среднее арифметическое её элементов: " + arifm);
            System.out.println();
        }
    }

    // Функция под Matrix20.
    static int prOfRow(int[][] arrayName, int k) {
        int pr=1;
        for (int i = 0; i < arrayName.length; i++) {
            pr=pr* arrayName[i][k];
        }
        return pr;
    }

    // ФУНКЦИЯ КОТОРАЯ ПЕЧАТАЕТ ДВУМЕРНЫЙ МАССИВ (МАТРИЦУ)
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ФУНКЦИЯ КОТОРАЯ ЗАПОЛНЯЕТ ДВУМЕРНЫЙ МАССИВ!!! (меняет матрицу (ничего не возвращает)
    static void fillMatrix (int[][]arr, int left, int right){
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {      //arr.length перебирает количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {        //arr[i].length кол-во столбцов в матриц
                arr[i][j] = gen.nextInt(right-left+1)+left;
            }
        }
    }

}
