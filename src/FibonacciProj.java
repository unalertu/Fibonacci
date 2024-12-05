import java.util.*;
public class FibonacciProj {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter how many fibonacci terms you want: ");
        int input=scanner.nextInt();

        int first=0; int second=1; int sum=0;

        System.out.println("Fibonacci series:");
        for (int i=1;i<=input;i++){
            if (i==input) System.out.println(first);

            else          System.out.print(first+", ");
            
            sum+=first;
            int next=first+second;
            first=second;
            second=next;
        }
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        System.out.println("\nCalculation Time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Summation of terms: "+sum);

    }
}
