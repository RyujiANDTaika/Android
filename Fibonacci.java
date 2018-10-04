public class Fibonacci {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int k=1;
        int[] fibonacci = new int[20];
        for (i=1;i<=20;i++){
            fibonacci[i-1] = j;
            int l = j+k;
            j = k;
            k = l;
        }
        for (i=1;i<=20;i++){
            System.out.print(fibonacci[20-i]+" ");
        }
    }
}