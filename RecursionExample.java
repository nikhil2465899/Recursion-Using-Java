import java.util.Scanner;

public class RecursionExample {
    //Recursion means call function in function itself...
    static void Recursion( int n) {
        if (n == 0) {
            return ;
        }
        System.out.println(n);
        Recursion(n - 1);

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your no here: ");
        int n= sc.nextInt();
        Recursion(n);
    }
}
