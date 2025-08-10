import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        // n: number of persons , h: height of the fence , ai: height of each person, min_w : the minimum possible valid width of the road.

        Scanner N=new Scanner(System.in);
        int min_w= 0;
        int n=N.nextInt();
        int h=N.nextInt();

        for(int i=0;i < n;i++)
        {
            int ai=N.nextInt();

            if (ai > h )
            {
                min_w +=2;
            }
            else
            {
                min_w+=1;
            }
        }
        System.out.println(min_w);
    }
}