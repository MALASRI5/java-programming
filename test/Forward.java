import java.util.Scanner;
public class Forward {
    public int evenForwarding(int start1, int end1, int start2, int end2){
        if((start1)%2==0 && (start2)%2==0 || (start1)%2!=0 && (start2)%2!=0){
            int sum1=0,sum2=0;
            for(int i=start1;i<=end1;i++){
                if(i%2==0){
                    sum1+=i;
                }
            }
            for(int i=start2;i<=end2;i++){
                if(i%2==0){
                    sum2+=i;
                }
            }
            return sum1+sum2;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1=sc.nextInt();
        int e1=sc.nextInt();
        int s2=sc.nextInt();
        int e2=sc.nextInt();
        sc.close();
        Forward obj=new Forward(); 
        int res= obj.evenForwarding(s1,e1,s2,e2);
        System.out.println(res);
    }
}
