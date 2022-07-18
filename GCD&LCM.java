 public static void GCD(){
        int a = scan.nextInt();
        int b= scan.nextInt();
        int temp1 = a;
        int temp2 = b;

        while(a%b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        int gcd = b;
        int lcm = (temp1 * temp2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
