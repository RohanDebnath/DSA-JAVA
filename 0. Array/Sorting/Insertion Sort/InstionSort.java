import java.util.Scanner;
public class InstionSort {
    private static int arr[];
    static Scanner sc = new Scanner(System.in);

    public InstionSort(int capacity) {
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
    void insertionSort()
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
         }
    }
    public static void main(String[] args) {
        InstionSort obj=new InstionSort(5);
        display();
        obj.insertionSort();
        System.out.println();
        display();
    }
}
