class Test {
    public static String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder sb= new StringBuilder();
        StringBuilder rb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            rb.append(arr[i]);
            sb.append(rb.reverse()+" ");
            rb.delete(0,arr[i].length());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}