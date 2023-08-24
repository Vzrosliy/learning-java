package examples;

import helper.RandomArrayGenerator;
import java.util.ArrayList;

public class OddSeparator {
    public void show() {

        ArrayList oddNumbers = new ArrayList();
        ArrayList evenNumbers = new ArrayList();

        RandomArrayGenerator arrayGenerator = new RandomArrayGenerator();
        int randomArray[] = arrayGenerator.GenerateRandomArray(30, 20, 10);

        for (int x = 0; x < randomArray.length; x++) {
            if ((randomArray[x] % 2) == 0) {
                oddNumbers.add(randomArray[x]);
            }
            else {
                evenNumbers.add(randomArray[x]);
            }
        }

        System.out.println("Четное значение равно " + oddNumbers);
        System.out.println("Нечетное значение равно " + evenNumbers);
    }
}

