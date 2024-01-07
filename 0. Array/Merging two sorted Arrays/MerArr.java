public class MerArr {
    static void solution(int[] arr1, int[] arr2) {
        int newArr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }
        for (int l : newArr) {
            System.out.print(l + " ");
        }
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 3, 6, 7 };
        int arr2[] = { 2, 4, 5, 8, 9, 10 };
        solution(arr1, arr2);
    }
}