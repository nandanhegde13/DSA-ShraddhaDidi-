 public static void decimalToAnyBase(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal value");
        int decimal = scan.nextInt();
        System.out.println("enter base value");
        int base = scan.nextInt();
        int rv=0;
        int p=1;
        while(decimal>0){
            int dig = decimal%base;
            decimal = decimal/base;
            rv += dig*p;
            p=p*10;
        }
        System.out.print(rv);
    }
