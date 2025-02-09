public class Practical8 {

    //pattern 1
    static void pattern(int size) {
        if (size==0) {
            return;
        }
           pattern(size-1);
             for(int star =size;star>0;star--){
                   System.out.print("*");
              }
              System.out.println();
           }   
             static void pattern1(int size) {
        if (size==0) {
            return;
        }
          for(int star =size-1;star>0;star--){
                   System.out.print("*");
              }
              System.out.println();
               pattern1(size-1);
           } 
           
          
      //pattern 2
    static void Pattern2(int n, int row) {
        if (row == 2 * n) return; 

        if (row < n-1) { 
            for (int star = 0; star < n; star++) {
                if (star < (n - row - 1))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        } 
        else  if( row==n){
            for(int star=n;star>0;star--){
          System.out.print("+ ");
          }
          System.out.println();
          }
             
          else  if( row>n){
               for(int space=row-n;space>0;space--){
                  System.out.print("  ");
             }
               for(int star=2*n-row;star>0;star--){
                    System.out.print("/ ");
               }
               System.out.println();
            } 
            
              Pattern2(n, row + 1); 
    }

          //pattern 3
     void pattern3(int n, int row) {
        if (row == 2 * n + 5)  
            return;

        if (row < n-1) {
           
            for (int space = n - row - 1; space > 0; space--) {
                System.out.print("  ");
            }
            for (int star = 2 * row + 1; star > 0; star--) {
                System.out.print("* ");
            }
        } else if (row < 2 * n - 1) {
           
            for (int space = row - n + 1; space > 0; space--) {
                System.out.print("  ");
            }
            for (int star = 2 * (2 * n - row - 2) + 1; star > 0; star--) {
                System.out.print("* ");
            }
        } else {
            
            for (int star = 0; star < n+1; star++) {
                if (star == n-1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
        }

        System.out.println();
        pattern3(n, row + 1);
     }   
        public static void main(String[] args) {
       int size =6; int n=5; 
       n+=1;
      size+=1;
       Practical8 obj=new Practical8();
          obj.pattern(size);
          obj.pattern1(size);
         obj.Pattern2(n,0);
         obj.pattern3(5,0);
           
   }
}
