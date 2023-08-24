import examples.ArrayEdgeValues;

public class StartProject {
    public static void main(String[] args) throws java.io.IOException {

        char choice;
        do {
            System.out.println("Какой пример вы хотите запустить?:");
            System.out.println("      0. Выход");
            System.out.println("      1. Получить крайние значения из случайного массива");
            choice = (char) System.in.read();
        } while (choice < 0);

//        System.out.println("\n");

        switch(choice){

                case '1':
                    ArrayEdgeValues edgeValues = new ArrayEdgeValues();
                    edgeValues.show();
                    break;

                default:
                case '0':
                    System.out.println("Неккоректный ввод");
                    break;

                }
        }
    }



