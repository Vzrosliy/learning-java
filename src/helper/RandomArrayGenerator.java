package helper;
public class RandomArrayGenerator {
    public int[] GenerateRandomArray(int lengthsArray, int maxPossible, int minPossible) {
        //int lengthsArray = 30; // длинна массива
       // int maxPossible = 20; // максимально возможное число
       // int minPossible = 10; // минимальное возможное число

        int RandomArray[] = new int[lengthsArray];

        for (int x = 0; x < lengthsArray; x++) {
            int random = (int) (Math.random() * (maxPossible - minPossible));
            random = random + minPossible;
            RandomArray[x] = random;
            System.out.println("Ячейка №" + x + " равно " + RandomArray[x]);
        }

        return RandomArray;
    }
}