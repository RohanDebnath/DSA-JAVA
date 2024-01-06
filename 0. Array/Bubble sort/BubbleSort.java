import java.util.Scanner;

public class BubbleSort {

    private static int arr[];
    static Scanner sc = new Scanner(System.in);

    public BubbleSort(int capacity) {
        arr = new int[capacity];
        enterElement();
    }

    static void enterElement() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    void Bubble_sort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    isSwapped = true;
                }
            }
            if (isSwapped == false)
                break;
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(5);
        display();
        bubbleSort.Bubble_sort();
        System.out.println();
        display();
    }
}
