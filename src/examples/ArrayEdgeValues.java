package examples;

import helper.RandomArrayGenerator;

public class ArrayEdgeValues  {
    public void show() {
        int lengthsArray = 30; // длинна массива
        int maxPossible = 20; // максимально возможное число
        int minPossible = 10; // минимальное возможное число

        RandomArrayGenerator arrayGenerator = new RandomArrayGenerator();
        int RandomArray[] = arrayGenerator.GenerateRandomArray(30,20,10);

        int maxZ = maxPossible;
        int minZ = minPossible;

        for (int x = 0; x < lengthsArray; x++) {

            if (maxZ < RandomArray[x]) {
                maxZ = RandomArray[x];
            }

            if (minZ > RandomArray[x]) {
                minZ = RandomArray[x];
            }
        }
        System.out.println("Максимальное значение равно " + maxZ);
        System.out.println("Минимальное значение равно " + minZ);
    }
}

