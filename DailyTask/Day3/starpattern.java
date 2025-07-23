import java.util.*;

public class starpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // square pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();

        // Inverted triangle
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();

        // Equilateral triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
           System.out.println(); 
        }

System.out.println();

        //Inverted equilateral Triangle
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
             for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
            
        }
        sc.close();

    }

}
