package less_2;

public class MainApp {

        public static void main(String[] args) {

        System.out.println("Task 1: ");
        System.out.println(doTask1(12, 9));
        System.out.println("Task 2: ");
        doTask2(-11);
        System.out.println("Task 3: ");
        System.out.println(doTask3(-25));
        System.out.println("Task 4: ");
        doTask4("Run", 8);
        System.out.println("Task 5: ");
        System.out.println(doTask5(2017)); // Task 5

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1,0,0}; // Array for task 6
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Array for task 8

        System.out.println("Task 6: ");
        doTask6(arr1); // Task 6 check
        System.out.println("\nTask 7: ");
        doTask7(100); // Task 7 check
        System.out.println("\nTask 8: ");
        doTask8(arr3); // Task 8 check
        System.out.println("\nTask 9: ");
        doTask9(); // Task 9 check
        System.out.println("\nTask 10: ");
        doTask10(5, 1); // Task 10 check
        System.out.println("\nTask 11:");
        modifyArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, -3);
    }

        public static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

        public static void doTask2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

        public static boolean doTask3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

        public static void doTask4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

        public static boolean doTask5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
        // Заменить 0 на 1, 1 на 0;
        public static void doTask6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
        // Заполнить массив значениями 1 2 3 4 5 6 7 8 … 100;
        public static void doTask7(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
        //Задать массив, пройти по нему циклом, и числа меньшие 6 умножить на 2
        public static void doTask8(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    /*Создать квадратный двумерный целочисленный массив, и с помощью цикла заполнить его диагональные
    элементы единицами (можно только одну из диагоналей).
    */
        public static void doTask9() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j) || (i == 3 - 1 - j)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
    равна initialValue;
    */
        public static void doTask10(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
        // task11
        static void modifyArray(int[] arr, int n) {
        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    }


