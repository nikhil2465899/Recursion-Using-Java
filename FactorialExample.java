import java.util.Scanner;

public class FactorialExample {
    static int PrintFactorial(int num){
        if(num==1||num==0){
            return num;
        }
        int fact= PrintFactorial(num-1);
        int Facto= fact*num;
        return  Facto;
    }
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int m= sc.nextInt();
       int result=  PrintFactorial(m);
            System.out.println("factorial is: "+ result);
    }
}
