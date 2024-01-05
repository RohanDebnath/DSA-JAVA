public class Matrix {

    static void solution(int arr[][], int key)
    {
        int i=0;
        int j=arr.length-1;
        while (i<arr.length && j>=0) {
            if(arr[i][j]==key)
            {
                System.out.println("Key is found at index: "+i+" "+j);
                break;
            }else if(arr[i][j]>key){
                j--;;
            }else{
                i++;
            }
        }
        System.out.println("Not found");
    }
    static void print(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int Matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,51}};
        
        print(Matrix);
        solution(Matrix, 32);
    }
}
