public class Practical9_2 {

     public static long getFactorial( int num)
   {
       long fact=1;
        int i;
       for(i=num;i>0;i--)
     {
         fact*= i;
     }
       return fact; 
  }
    
   public static long getFactorial2( int num )
    {
      long fact ;
      if (num==0||num==1)
    {
       return 1;
     }
     else 
     {
        fact =num*getFactorial2(num-1);
        
    }
    return fact;
    }
    
    public static void main(String []args){
      int size =0;
      if(args.length>0){
        size=Integer.parseInt(args[0]);
      }
        int[] number= new int[size];
        
        long endTime,initialTime;
        long totalTimeOfForloop=0;
        long totalTimeOfRecursion =0;
        
        for( int index=0;index< size;index++){
            number[index]=(int)(System.nanoTime()% 31);
             // time of  loop  
            initialTime=System.nanoTime();
              long value=getFactorial(number[index]);
              endTime=System.nanoTime();
              totalTimeOfForloop +=(endTime- initialTime);
              
              // time of recursion method 
              initialTime=System.nanoTime();
              long value1 =getFactorial2(number[index]); 
              endTime= System.nanoTime();
              totalTimeOfRecursion +=(endTime- initialTime);
              
           }
           float AverageForTime= totalTimeOfForloop/(float)size;
           float AveragerecursiveTime= totalTimeOfRecursion/(float)size;
           
           System.out.print(" diaplay any values  ");
            for(int index=0 ;index<size;index++){
               System.out.print(number[index]+" ");
               }
               
               System.out.println();
               
               System.out.println("Average time of iterative method:-" +  AverageForTime +"ns");
               System.out.println("Average time of recursive method :-"+ AveragerecursiveTime +"ns");
               
               if(AveragerecursiveTime<AverageForTime){
                   System.out.println("recusive method is better");
                   }
                   else {
                      System.out.println("iterative method is better ");
                    }
                }
           }      
              
             
