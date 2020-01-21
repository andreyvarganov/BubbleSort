import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Main {

    public static void main(String[] args) {

        int length = 0;
        int[] array;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Please, enter a length of array: ");
            length = Integer.parseInt(reader.readLine());

            array = new int[length];

            randomFilling(array);
            printArray(array);
            bubbleSort(array);
            printArray(array);

        } catch (IllegalArgumentException e) {
            System.out.println("Wrong argument!");
        } catch (IOException e) {
            System.out.println("Input error!");
        }

    }

    public static void printArray(int[] array) { // Вывод массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void randomFilling(int[] array) { // Рандомное заполнение массива
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int out = array.length - 1; out > 1; out--) {
            for (int in = 0; in < out ; in++) {
                if (array[in] > array[in + 1]) swap(array, in, in + 1);
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
