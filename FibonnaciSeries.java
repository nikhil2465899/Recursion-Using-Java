import java.util.*;
public class FibonnaciSeries {
    static int n1=0,n2=1;
    // here we just take already two number for sum first two element.
    // n3 variable took for storing the sum of first two element.
   static int n3;
    static void PrintFibonnaci(int count){

        if(count>0){
            n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            // here we take recursive call for PrintFibonnaci for decreasing count.
            PrintFibonnaci(count-1);
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Value here : ");
        int count= sc.nextInt();
        System.out.print(n1+" "+n2);
        PrintFibonnaci(count-2);

    }
}


