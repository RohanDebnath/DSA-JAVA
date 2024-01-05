public class Matrix {
    static void print(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void solution(int arr[][], int r, int c)
    {
        int k=0,l=0;
        while (k<r &&  l<c) {
            for (int i = l; i<c; i++) {
                System.out.print(arr[k][i]+" ");
            }
            k++;
            for (int i = k; i < r; i++) {
                System.out.print(arr[i][c-1]+" ");
            }
            c--;
            for (int i = c-1; i >=l; i--) {
                System.out.print(arr[r-1][i]+" ");
            }
            r--;
            for (int i = r-1; i>=k; i--) {
                System.out.print(arr[i][l]+" ");
            }
            l++;
        }
    }
    public static void main(String[] args) {
        int Matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,51}};
        
        // print(Matrix);
         solution(Matrix,4,4);
    }
}


