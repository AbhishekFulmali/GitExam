

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
    public static void main(String[] args) {
        int count =20;
        System.out.println(n1+" "+n2);
        fib(count-2);

        
    }
}