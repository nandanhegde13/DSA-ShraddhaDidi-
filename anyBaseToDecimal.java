 public static void anybaseToDecimal(){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter number");
     int number  = scan.nextInt();
     System.out.println("Enter base");
     int base = scan.nextInt();
     int rv= 0;
     int pv =1;
     while(number>0){
         int dig = number%10;
         number = number/10;
         rv += dig*pv;
         pv = pv*base;
     }
     System.out.println(rv);
 }
