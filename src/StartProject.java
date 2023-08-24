import examples.ArrayEdgeValues;
import examples.OddSeparator;

public class StartProject {
    public static void main(String[] args) throws java.io.IOException {

        char choice;
        do {
            System.out.println("Какой пример вы хотите запустить?:");
            System.out.println("      0. Выход");
            System.out.println("      1. Получить крайние значение из случайного массива");
            System.out.println("      2. Получить четное и нечетное 2значение из случайного массива");
            choice = (char) System.in.read();
        } while (choice < 0);

        switch (choice) {

            case '1':
                ArrayEdgeValues edgeValues = new ArrayEdgeValues();
                edgeValues.show();
                break;

            case '2':
                OddSeparator oddSeparator = new OddSeparator();
                oddSeparator.show();
                break;

            default:
            case '0':
                System.out.println("Неккоректный ввод");
                break;
        }
    }
}



