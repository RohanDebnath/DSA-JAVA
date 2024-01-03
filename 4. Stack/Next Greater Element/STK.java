/*
 Given an array of integers. For each element in the array find the next greater element
 Example:-
    input   {4,7,3,4,8,1}
    output  {7,8,4,8,-1,-1} -1 declears that there is not element 
*/

import java.util.Stack;

class STK{
   static int []nextGreaterElement(int arr[])
    {
        int resultArr[]=new int[arr.length];
        Stack<Integer> stack=new Stack();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!stack.isEmpty())
            {
                while (!stack.isEmpty() && stack.peek()<=arr[i]) {
                    stack.pop();
                }
            }
                if(stack.isEmpty())
                {
                    resultArr[i]=-1;
                }else{
                    resultArr[i]=stack.peek();
                }
            stack.push(arr[i]);
        }
        return resultArr;
    }
    public static void main(String[] args) {
        int arr[]={4,7,3,4,8,1};
        arr= nextGreaterElement(arr);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}