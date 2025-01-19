 public  class Pract5 {
 
 int getFactorial1( int num)
{
  //using for loop
   int fact=1;
   int i;
    for(i=num;i>0;i--)
   {
      fact*= i;
    }
    return fact;
   
    }
    
    //by using while loop
    
    int getFactorial2( int num)
    {
       int fact=1;
       while (num>0)
      {
        fact*= num;
         num--;
         
       }
       return fact;
    }   
        
    // without any using loop
     int getFactorial3( int num )
    {
      int fact ;
      if (num==0||num==1)
    {
       return 1;
     }
     else 
     {
        fact =num*getFactorial3(num-1);
        
    }
    return fact;
    }
    
    // the sum of numbers 
     int getSum(int [] numbers)
    {
      
       int i=0;
        int sum=0;
        while (i< numbers.length)
        {
        sum+=numbers[i];
        i++;
        }
        return sum;
       
      }
      
      //the sum of numbers without using any loop 
     int getSum( int numbers[] ,int i)
      {
         
         int sum=0;
         
         if(i==numbers.length)
         {
         return sum=0;
         }
         
         sum=numbers[i]+getSum(numbers ,i++);
         return sum; 
      } 
    
    
    public static  void main (String args[])
    {
       Pract5 s1 =new Pract5();
       int []a={1,2,3,4,5};
      System.out.println(s1.getFactorial1(4));
      System.out.println(s1.getFactorial2(5));
      System.out.println(s1.getFactorial3(6));
      System.out.println(s1.getSum(a));
      System.out.println(s1.getSum(a,0));
      
      }
      }
      
      
