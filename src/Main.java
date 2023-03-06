import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

        public static void task1() {
            System.out.println(" задача 1 ");
            int[] key = new int[]{1, 2, 3};
            for (int i = 0; i < key.length; i++) {
                System.out.print(key[i] + " ");
            }
            System.out.println();

            double[] arr = new double[]{1.57, 7.654, 9.986};
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            int[] myArray = new int[5]; // создание массива из 5 элементов
            myArray[0] = 1; // первый элемент
            myArray[1] = 5; // второй элемент
            myArray[2] = 7; // третий элемент
            myArray[3] = 10; // четвертый элемент
            myArray[4] = 15; // пятый элемент
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
        }

        public static void task2() {
            System.out.println(" Задача 2 ");
            int[] myArray = {1, 5, 7, 10, 15};
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + " ");
            }
            System.out.println();
            double[] myArrayTwo = {1.57, 7.654, 9.986};
            for (int i = 0; i < myArrayTwo.length; i++) {
                System.out.print(myArrayTwo[i] + " ");

            }
            System.out.println();

        }

        public static void task3() {
            System.out.println(" Задача 3 ");
            int[] myArray = {1, 5, 7, 10, 15};
            double[] myArrayTwo = {1.57, 7.654, 9.986};

// вывод элементов первого массива в обратном порядке
            for (int i = myArray.length - 1; i >= 0; i--) {
                System.out.print(myArray[i]);
                if (i > 0) { // если не первый элемент, добавляем запятую и пробел
                    System.out.print(", ");
                }
            }

            System.out.println(); // перенос на новую строку

// вывод элементов второго массива в обратном порядке
            for (int i = myArrayTwo.length - 1; i >= 0; i--) {
                System.out.print(myArrayTwo[i]);
                if (i > 0) { // если не первый элемент, добавляем запятую и пробел
                    System.out.print(", ");
                }
            }

            System.out.println(); // перенос на новую строку

        }

        public static void task4() {
            System.out.println(" Задача 4 ");
            int[] myArray = {1, 5, 7, 10, 15};
            double[] myArrayTwo = {1.57, 7.654, 9.986};

// преобразование нечетных чисел в четные (целочисленные)
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] % 2 != 0) { // если элемент нечетный
                    myArray[i]++; // увеличиваем на 1
                }
            }

            System.out.println(); // перенос на новую строку
// преобразование нечетных чисел в четные (дробные)
            for (int i = 0; i < myArrayTwo.length; i++) {
                if (myArrayTwo[i] % 2 != 0) { // если элемент нечетный
                    myArrayTwo[i]++; // увеличиваем на 1
                }
            }

            System.out.println(); // перенос на новую строку

            System.out.println(Arrays.toString(myArrayTwo)); // выводим измененный массив в консоль
            System.out.println(Arrays.toString(myArray)); // выводим измененный массив в консоль


        }
    }