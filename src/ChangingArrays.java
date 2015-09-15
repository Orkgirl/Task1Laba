/**
 * Created by Olha_Krasko on 9/14/2015.
 */
public class ChangingArrays {


    //	� ������� ����� ����� ���������� ����� ���������, ��������� �� ������ ��������.
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


    //	� ������� ����� ����� �������� ������ ������������� ��������.
    public static void replaceByZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
    }

    //	� ������� ����� ����� ����� ������� ����� ������� �������������� � �������� ������������ ��������.
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

    //  � ������� ����� ����� �������� ������� ������������ ������������� �������  � ����������� �������������.
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

    //	� ������� ����� ����� ������� ��� ��������, ������� ����������� ������ ������ ���� � ������� ������� ��������.
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

    //  � ������� ����� ����� ������� ������ ������������� �������, ������� ����� ����� �������������.
    public void tripleElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i + 1] < 0) {

            }

        }
    }


}