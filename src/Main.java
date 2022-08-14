public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //Задание 1:посчитать сумму всех выплат за месяц. + «Сумма трат за месяц составила … рублей».
        int[] arr = generateRandomArray();
        int summa = 0;
        for (int perDay = 0; perDay < arr.length; perDay++) {
            summa = summa + arr[perDay];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей.");


        //Задание 2: найти минимальную и максимальную трату за день. + «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей", min, max);

        //Задание 3:  среднее значение трат за месяц + «Средняя сумма трат за месяц составила … рублей».
        System.out.println(" ");


        double middle = (double) summa / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей. \n", middle);

        //Задание 4: перевернуть
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println(" ");

        //Задание 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Задание 6: хз что за arrays to string, поэтому вывод - импровизация

        int [] arr6 = new int[]{5,4,3,2,1};
        int [] copyArr6 = new int[5];
        for(int i =0; i < arr6.length; i++){
            System.out.print(arr6[i] + " ");
        }
        System.out.println("- изначальный массив ");
        for (int i = 0; i < copyArr6.length; i++) {
            copyArr6[i] = arr6[arr6.length-i-1];
            System.out.print(copyArr6[i] + " ");
        }
        System.out.println("- перевёртыш");





    }


}


