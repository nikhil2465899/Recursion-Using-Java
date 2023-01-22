import java.util.Scanner;
import java.util.*;

public class TowerOFHanoi {
    static void TOH(int disk,String A,String B,String C){
        if(disk==1) {
            System.out.println("Transfering the disk: 1 from " + A + " to " + C);
        }

        else{
                TOH(disk - 1, A, C, B);
                System.out.println("Transfering the disk: " + disk + " " + "from" + " " + A + " to " + C);
                TOH(disk - 1, B, A, C);
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your disk No.: ");
        int disk= sc.nextInt();
        TOH(disk,"A","B","C");
    }
}
