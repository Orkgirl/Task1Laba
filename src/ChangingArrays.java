/**
 * Created by Olha_Krasko on 9/14/2015.
 */
public class ChangingArrays {


    //	В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
    public static int sumEven(int[] array) {
        int sum = 0;
        // for (int i = 0; i < array.length; i++) {
        // if (i%2 == 0 ) {
        // sum += array[i];
        // }
        // }
        for (int i = 0; i < array.length; i = i + 2) {
            sum += array[i];
        }
        return sum;
    }


    //	В массиве целых чисел заменить нулями отрицательные элементы.
    public static void replaceByZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
    }

    //	В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента.
    public static int averageMinusMin(int[] array) {
        int sum = 0;
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length - min;
    }

    //  В массиве целых чисел поменять местами максимальный отрицательный элемент  и минимальный положительный.
    public static void swap(int[] array) {
        int maxNegative = array[0];
        int minPositive = array[0];
        int coutMaxP = 0;
        int coutMinN = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i] > maxNegative) {
                    maxNegative = array[i];
                    coutMaxP = i;
                }

            } else if (array[i] > 0) {
                if (array[i] < minPositive) {
                    minPositive = array[i];
                    coutMinN = i;
                }

            }
        }

        int tmp = array[coutMaxP];
        array[coutMaxP] = array[coutMinN];
        array[coutMinN] = tmp;

    }

    //	В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
    public void repeatedAndOdd(int[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    flag = true;
                }
                if (array[i] != array[j] && i % 2 != 0) {
                    System.out.print(array[i] + " ");
                    break;
                }
                if (flag == false) {
                    break;
                }
            }
        }
    }

    //  В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
    public void tripleElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i + 1] < 0) {

            }

        }
    }


}