import java.util.Scanner;

public class Q18_COuntDigits {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("enter no.");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        r.close();
    }
    
}