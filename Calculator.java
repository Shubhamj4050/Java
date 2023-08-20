import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //first no.
        System.out.println("Input First no.:");
        int a =sc.nextInt();
        //operator
        System.out.println("Input operator /n Choose 1 for Addition /n Choose 2 for Multiplication /n Choose 3 for subtraction /n Choose 4 for Divide ");
        int operator = sc.nextInt();
        //second no.
        System.out.println("Input Second no.:");
        int b = sc.nextInt();
        switch(operator){
           //for add
            case 1:
            System.out.println(a+b);
            System.out.println("input total no. you want to add");
            int n = sc.nextInt();
            int sum=a+b;
            for(int i =0;i<=n;i++){
                
              
                sum=a+b;
                a=sum;
                b=sc.nextInt();
                

            }
              System.out.println(sum);
            break;
            //for multiply
            case 2:
             System.out.println(a*b);
            System.out.println("input total no. you want to multiply");
            int h = sc.nextInt();
            int multi=a*b;
            for(int i =0;i<=h;i++){
                multi=a*b;
                
                a=multi;
                b=sc.nextInt();
                

            }
            System.out.println(multi);
            break;
            //for sub
            case 3:
            System.out.println(a-b);
            System.out.println("input total no. you want to sub");
            int g = sc.nextInt();
            int sub=a-b;
            for(int i =0;i<=g;i++){
                sub=a-b;
               
                
                a=sub;
                b=sc.nextInt();
                

            }
            System.out.println(sub);
            break;
            //for division
            case 4:
            System.out.println(a/b);
            System.out.println("input total no. you want to sub");
            int f = sc.nextInt();
            int div=a/b;
            for(int i =0;i<=f;i++){
                div=a/b;
               
                
                a=div;
                b=sc.nextInt();
                

            }
            System.out.println(div);
            break;
            default:
            System.out.println("invalid choice");
            
             
        }


    }
}