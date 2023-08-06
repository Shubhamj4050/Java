class Advance{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n;i++) {
            //1st part star
            for(int j=1; j<=i;j++){
                if(j==i|| j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //spaces
            int space=2*(n-i);
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            //for 2nd star
            for(int j=1; j<=i;j++){
                if(j==i|| j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();


        }
        for(int i=n; i>=1;i--) {
            //1st part star
            for(int j=1; j<=i;j++){
                if(j==i|| j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //spaces
            int space=2*(n-i);
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            //for 2nd star
            for(int j=1; j<=i;j++){
                if(j==i|| j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }  
        
            
        
        
    }
    
}