public class Patterns {

    public static void main(String[] args) {
      
  // Solid rectangle
  
        for(int i=1;i<=4;i++){
           for(int j=1;j<=5;j++) {
               System.out.print('*');
           }
           System.out.println();
       }

 // Hollow Rectangle
 
       int n=4;
       int m=5;
         for(int i=1;i<=n;i++){
             for(int j=1;j<=m;j++){
                 if(i==1 || i==n || j==1 || j==m){
                     System.out.print('*');
                 }
                 else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }

//  Half Pyramid

       int n1=4;
       for(int i=1;i<=n1;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }

// Reverse Half pyramid

       int n2=4;
       for(int i=n2;i>=1;i--){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }

// Inverted half pyramid(180 degree)
       int n=4;
       for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println();
       }

// Half Pyramid numbers

       int n1=4;
       for(int i=1;i<=n1;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           System.out.println();
       }

 // Inverted Half pyramid numbers
       int n1=4;
       for(int i=4;i>=1;i--){
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           System.out.println();
       }

 //  Floyd's Triangle
       int n1=4;
       int count = 1;
       for(int i=1;i<=n1;i++){

           for(int j=1;j<=i;j++){

               System.out.print(count);
               count++;

           }
           System.out.println();

       }

  // 0-1 Triangle
       
        int n1=5;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=i;j++){
                if(( i+j)%2==0)
                {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            
            System.out.println();
        }
        
   // Inverted pyramid     
         int n=4;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=(n-i)+1;j++){
               System.out.print(i);
           }
           System.out.println();
       }
        
        
        
        //Butterfly pattern
         int n = 4;
 
       //upper part
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
 
           int spaces = 2 * (n-i);
           for(int j=1; j<=spaces; j++) {
               System.out.print(" ");
           }
 
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
 
 for(int i=n; i>=1; i--) {
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
 
           int spaces = 2 * (n-i);
           for(int j=1; j<=spaces; j++) {
               System.out.print(" ");
           }
 
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
     
        
        // Rombous pattern
        int n=5
            for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
 
           //stars
           for(int j=1; j<=n; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
        
        
        
        
        //Palindromic pyramid
          int n = 5;
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
 
           //first part
           for(int j=i; j>=1; j--) {
               System.out.print(j);
           }
 
           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }

        
        //Dimond pattern
        int n = 5;
 
       //upper part
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
 
       //lower part
       for(int i=n; i>=1; i--) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

//Number pyramid
          int n = 5;
 
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
 
           //numbers
           for(int j=1; j<=i; j++) {
               System.out.print(i+" ");
           }
           System.out.println();
       }

        
    }
}

