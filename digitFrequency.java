		 Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int digit=scan.nextInt();
         int count=0;
         int temp=n;
         while(temp!=0){
             int dig=temp%10;
             if(dig==digit){
                 count++;
             }
             temp=temp/10;
         }
      System.out.println(count);
