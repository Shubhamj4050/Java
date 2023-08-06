import java.util.*;
class Patterns {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int n = sc.nextInt();
        //int m = sc.nextInt();
        //for(int i=1;i<=n;i++){
        //  for(int j=1;j<=m;j++){
        //    System.out.print("*");
        //    }
        //System.out.println();


       // int n = sc.nextInt();
       // int m = sc.nextInt();
        //outer loop
       // for(int i=1;i<=n;i++){
            //inner loop
        //  for(int j=1;j<=m;j++){
            //cell->(i,j)
            //if(i ==1 || j==1 || i==n || j==m){
    //      System.out.print("*");
       //    }else{
       //          System.out.print(" ");
       //        }
       //      
       //        }
       //   System.out.println();
//
        // }

    //int n=4;
    //for(int i=1;i<=n;i++){
    //    for(int j=1;j<=i;j++){
    //        System.out.print("*");
    //    }
    //System.out.println();
    //}
//    int n=4;
//    for(int i=n;i>=1;i--){
//        for(int j=1;j<=i;j++){
//            System.out.print("*");
//        } 
//    System.out.println();
//    }
    int n=4;
    //outer loop
    for(int i=1;i<=n;i++){
        // inner loop-> for space
        for(int j= 1;j<=n-i;j++){
            System.out.print(" ");
        }
        // inner loop for star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
}