package Task;

import java.util.ArrayList;
import java.util.List;

public class ChangingArrays {

    private int minBoundary = -10;
    private int maxBoundary = 10;
    private int arraySize = 20;
    private int[] currentArray = new int [arraySize];

    // task 1
    public  int [] swap(int[] array) {
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int countMaxN = 0;
        int countMinP = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i] > maxNegative) {
                    maxNegative = array[i];
                    countMaxN = i;
                }

            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] < minPositive) {
                    minPositive = array[i];
                    countMinP = i;
                }

            }
        }

        int tmp = array[countMaxN];
        array[countMaxN] = array[countMinP];
        array[countMinP] = tmp;



        return array;
    }

    //task 2
    public int sumOdd(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            sum += array[i];
        }
        return sum;
    }

    // task 3
    public  int[] replaceByZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    // task 4
    public int [] tripleElement(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                break;
            }else if (array[i] > 0 && array[i + 1] < 0) {
                array[i] = array[i] * 3;
            }
        }
        return array;
    }


    // task 5
    public int averageMinusMin(int[] array) {
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

    // task 6
    public List<Integer> repeatedAndOdd(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && i % 2 != 0) {
                    arrayList.add(array[i]);
                    break;
                }

            }
        }
        return arrayList;
    }

    // print function
    public void printArray (int [] array) {
        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int[] randomArray (){
        for (int i = 0; i < arraySize; i++ ) {
            currentArray[i] = (minBoundary + (int)(Math.random() *((maxBoundary - minBoundary) + 1)));
        }
        return currentArray;
    }

    public static void main(String[] args) {
        ChangingArrays chArray = new ChangingArrays();

        System.out.println("Task1: ");
        int [] task1 = chArray.randomArray();
        chArray.printArray(task1);
        chArray.printArray(chArray.swap(task1));

        System.out.println("\nTask2: ");
        int [] task2 = chArray.randomArray();
        chArray.printArray(task2);
        System.out.println(chArray.sumOdd(task2));

        System.out.println("\nTask3: ");
        int [] task3 = chArray.randomArray();
        chArray.printArray(task3);
        chArray.printArray(chArray.replaceByZero(task3));

        System.out.println("\nTask4: ");
        int [] task4 = chArray.randomArray();
        chArray.printArray(task4);
        chArray.printArray(chArray.tripleElement(task4));

        System.out.println("\nTask5: ");
        int [] task5 = chArray.randomArray();
        chArray.printArray(task5);
        System.out.println(chArray.averageMinusMin(task5));

        System.out.println("\nTask6: ");
        int [] task6 = chArray.randomArray();
        chArray.printArray(task5);
        System.out.println(chArray.repeatedAndOdd(task6));

    }


}