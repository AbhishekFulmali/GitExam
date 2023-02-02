import java.util.Scanner;

class Finbo{
    static int n1=0 , n2=1, n3=0;
    public static void fib(int count){
          if(count>0){
              n3=n1+n2;
              n1=n2;
              n2=n3;
              System.out.println(" "+n3);
              fib(count-1);
          }
    }

    public static void prime(){
        int ct = 0, n = 0, i = 1, j = 1;
        while (n < 20) {
            j = 1;
            ct = 0;
            while (j <= i) {
                if (i % j == 0) {
                    ct++;
                    j++;
                }
                if (ct == 2) {
                    System.out.println(" " + i);
                    n++;
                }
                i++;
            }
        }
    }
public static boolean findArmStrong(int n){
    int temp, digit=0,last=0,sum=0;
      temp=n;
 
    
      while(temp>0){
          temp=temp/10;
          digit++;

      }
      temp=n;
      while(temp>0){
          last=temp%10;
          sum+=(Math.pow(last, digit));
          temp=temp/10;
      }
      if(n==sum){
          return true;

      }
      else{
          return false;
      }

      
}
    public static void main(String[] args) {
    //     int count =20;
    //     System.out.println(n1+" "+n2);
    //    fib(count-2);

       // prime();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println("Number"+num);
        for(int i=0;i<=num;i++){
            if(findArmStrong(i))
              System.out.println(i+"");
        }
        
    }
}