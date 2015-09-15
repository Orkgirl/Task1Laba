import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Olha_Krasko on 9/14/2015.
 * Processing lines
 */
public class ChangingStrings {

    public void maxMinString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter count of string"); /////// Вывести в отдельную функцию
        int n = Integer.parseInt(reader.readLine());
        String[] array = new String[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        String min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < min.length()) {
                min = array[i];

            }
        }

        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max.length()) {
                max = array[i];

            }
        }

        System.out.println("max: " + max + " length: " + max.length());
        System.out.println("min: " + min + " length: " + min.length());

    }

    public void biggerAverageString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter count of string");
        int n = Integer.parseInt(reader.readLine());
        String[] array = new String[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].length();

        }
        int avr = sum / n;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > avr) {
                System.out.println(array[i] + ": " + array[i].length());
            }
        }
    }

    public void lessAverageString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter count of string");
        int n = Integer.parseInt(reader.readLine());
        String[] array = new String[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].length();

        }
        int avr = sum / n;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < avr) {
                System.out.println(array[i] + ": " + array[i].length());
            }
        }
    }
    public void wordOfNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter count of string");
        int n = Integer.parseInt(reader.readLine());
        String[] array = new String[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        ArrayList<String> arrayNum = new ArrayList<String>();
        Pattern pattern = Pattern.compile(("\\d{0,}"));
        for (int i = 0; i < array.length; i++) {
            Matcher match = pattern.matcher(array[i]);
            if (match.matches()) {
                arrayNum.add(array[i]);
            }
        }
        if (arrayNum.size() > 1){
            System.out.println(arrayNum.get(1));
        }else System.out.println(arrayNum.get(0));
    }




}





