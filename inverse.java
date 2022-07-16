import java.util.Scanner;

public class Functions {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
        int op=1;
        int inv=0;
        while(n!=0){
            int digit = n%10;
            int od= digit;
            int id = op;
            int ip = od;
            inv = inv +id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println(inv);
    }
}
