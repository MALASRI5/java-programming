
public class Operator {
    public static void main(String[] args) {
        int a=10,b=20;
        //Arithmetic operator
        System.out.println(a+b);//addition
        System.out.println(a-b);//subtraction
        System.out.println(a*b);//Product
        System.out.println(a/b);//returns Quotient
        System.out.println(a%b);//returns Remainder

        //Assignment Operator
        System.out.println(a==b); // returns boolean if equal TRUE else FALSE
        System.out.println(a!=b); //not equal ==> TRUE

        //Relational Operator(< , > , <= ,>=)
        System.out.println(a>b); //a greater than b
        System.out.println(a<b); //a lesser than b

        //Logical Operator( &&-AND ||-> OR !-> NOT)

        // Ternary Operator
        //Syntax :: (condt)?"True": "False";
        boolean res=(a>=b)?true :false;
        System.out.println(res);

        // Bitwise Operator
        // AND-> & , OR -> | , NOT -> ~ , XOR -> ^ , 
        // left-shift << , right-shift >>

        System.out.println(a&b);  //AND Both true then true
        System.out.println(a|b);  //OR Anyone true then true
        System.out.println(a^b);  //XOR Both same -> 0 , different ->1
        System.out.println(~a); //NOT 0->1 ,1->0
        System.out.println(a<<2); //shift 2 position left to a
        System.out.println(a>>1); //shift 1 position right to a


        





    }
}
