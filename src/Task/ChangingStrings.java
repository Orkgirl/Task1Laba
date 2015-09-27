package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChangingStrings {

    // task 1
    public List<String> maxMinString(List< String> list) {

        String min =  list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min.length()) {
                min = list.get(i);

            }
        }

        String max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max.length()) {
                max =  list.get(i);

            }
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(min);
        arrayList.add(max);

        return arrayList;
    }

    // task 2
    public List<String> biggerAverageString(List< String> list) {

        int avr = average(list);
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > avr) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    // task 3
    public List<String> lessAverageString(List< String> list) {

        int avr = average(list);
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < avr) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    // task 6
    public String wordOfNumber(List<String> list) {

        ArrayList<String> arrayNum = new ArrayList<>();
        String string = " ";
        int count = 0;
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (string.matches("\\d{0,}")) {
                count++;
                index = arrayNum.indexOf(i);
            }
        }
        if (count == 1) {
            return arrayNum.get(index);
        }
        if (count == 2) {
            return arrayNum.get(index);
        }
        if (count > 2) {
            return arrayNum.get(1);
        }
        return "There are no digits";
    }


    // print function
    public  void printString (List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " " + list.get(i).toString().length());
        }
    }

    // function for enter data
    public List<String> enterData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("Enter count of string");
        int n = Integer.parseInt(reader.readLine());
        String[] array = new String[n];

        for (int i = 0; i < array.length; i++) {
            arrayList.add(reader.readLine());
        }
        return arrayList;
    }

    public int average(List<String> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (list.get(i)).length();

        }
        int avr = sum / list.size();
        return avr;
    }

    public static void main(String[] args) throws IOException  {
        ChangingStrings chString = new ChangingStrings();
        System.out.println("Task1:");
        chString.printString(chString.maxMinString(chString.enterData()));
        System.out.println("\nTask2:");
        chString.printString(chString.biggerAverageString(chString.enterData()));
        System.out.println("\nTask3:");
        chString.printString(chString.lessAverageString(chString.enterData()));
        System.out.println("\nTask6:");
        System.out.println(chString.wordOfNumber(chString.enterData()));
    }
}



