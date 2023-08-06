class Patterns2{
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            // it is not necessary to write as thier is no need to print space after printing star so its your choice to write this code just for your satisfaction 
            //you can comment out this part and the code will work same
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
            
        }

    }
}
   