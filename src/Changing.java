import java.io.IOException;

/**
 * Created by Îëÿ on 15.09.2015.
 */
public class Changing {

        public static void main(String[] args) throws IOException {

            Changing changing = new Changing();
         //changing.changingArrays();
            changing.changingStrings();
        // changing.calculator();

        }

        public void changingArrays() {
        //int [] array = {-3, 10, 6, 8, -1, 1, 4, -6, 3, 5, 7, 8, -9, 10, 3, 7, 1, 2, -7, 4};
            int [] array = {1, 1, 1, 4, -6, 4, 8};
            ChangingArrays changArr = new ChangingArrays();
//            changArr.swap(array); // task 1
//            changArr.sumOdd(array); // task 2
//            changArr.replaceByZero(array); // task 3
         //   changArr.tripleElement(array);
//            changArr.averageMinusMin(array); // task 5
//            changArr.repeatedAndOdd(array); // task 6

        }

        public void changingStrings() throws IOException {
            ChangingStrings changStrings = new ChangingStrings();
        //changStrings.maxMinString(); // task1
        //changStrings.biggerAverageString(); // task 2
            //changStrings.lessAverageString(); // task 3
            changStrings.wordOfNumber(); // task 6
        }

        public void calculator() throws IOException {
            Calculator calc = new Calculator();
            calc.calculator();
        }

    }
