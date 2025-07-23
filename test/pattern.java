import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i,j;
        for(i=n;i>=1;i--){
            int c=n;
            int sub=i-1;
            int start=n-sub;
            for(j=i;j>=1;j--){
                System.out.print(start +" ");
                start=start+c;
                c--;
            }
            
            System.out.println();
        }
    }
}
