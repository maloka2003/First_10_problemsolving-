import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
        int L_weight,b_weight, count=0;
        L_weight=S.nextInt();
        b_weight=S.nextInt();
        S.nextLine();
       while(L_weight<=b_weight)
        {
            L_weight*=3;
            b_weight*=2;
            count++;
        }
        System.out.print(count);
       }




    }
    }
