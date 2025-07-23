import java.util.*;
public class catlogcheck {
    public boolean checkNumberIsSorted(int number){
        while(number>0){
            int copy=number;
            int lastdigit=number%10;
            copy=copy/10;
            int seclastdigit=copy%10;
            if(lastdigit<seclastdigit){
                number=number/10;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        catlogcheck obj=new catlogcheck();
        
        boolean res=obj.checkNumberIsSorted(num);
        System.out.println(res);

        
    }
}
