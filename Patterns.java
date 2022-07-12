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
        
        
    }
}

