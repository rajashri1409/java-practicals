   public class pract61 {
   
      void displayPattern(int size)
        {
            System.out.println("first Pattern");
            
         for(int ln=1;ln<=size;ln++)
         {
             for(int s= size-ln;s>0;s--)
              {
                System.out.print(" ");
               }
          
                 for(int plus=2*ln-1;plus>0;plus--)
                 {
                   System.out.print("+");
                 }
               
                   System.out.print("\n");
        }
          
          //reverse loop 
          for(int ln=size-1;ln>0;ln--)
            {
             for(int s= size-ln;s>0;s--)
               {
                 System.out.print(" ");
                }
          
                  for(int plus=2*ln-1;plus>0;plus--)
                   {
                     System.out.print("+");
                    }
               
                    System.out.print("\n");
            }
            System.out.println("second pattern");
            
            for(int  ln=1; ln<=size;ln++)
        {
          for(int s=size-ln;s>0;s--)
            {
              System.out.print(" ");
            }
             if(ln%2==0)
              {
        
               for(int pattern=2*ln-1;pattern>0;pattern--)
              {   
            
               if(pattern%2==0)
                {
                  System.out.print("*");
                 }
                    else
                  {
                    System.out.print("+");
                  }
              }
            }
              else
              {
                for(int pattern=2*ln-1;pattern>0;pattern--)
                {
                  if(pattern%2==0)
                 {
                   System.out.print("+");

                 }
                  else   {
                    System.out.print("*");
                   }
                }
             }
                System.out.print("\n" );
          }
          
          for(int ln=size;ln>0;ln--)
            {
             for(int s=size-ln;s>0;s--)
            {
              System.out.print(" ");
            }
             if(ln%2==0)
              {
        
               for(int pattern=2*ln-1;pattern>0;pattern--)
              {   
            
               if(pattern%2==0)
                {
                  System.out.print("+");
                 }
                    else
                  {
                    System.out.print("*");
                  }
              }
            }
              else
              {
                for(int pattern=2*ln-1;pattern>0;pattern--)
                {
                  if(pattern%2==0)
                     {
                   System.out.print("*");
                 }
                 else 
                   {
                    System.out.print("+");
                   }
                }
              }
              System.out.print("\n");
           }   
           
           System.out.println("third pattern ");
           for( int ln=1;ln<= size;ln++)
        {
          for(int s=size-ln;s>0;s--)
            {
              System.out.print(" ");
            }
             if(ln%2==0)
                    {
                for(int pattern =2*ln-1;pattern>0;pattern--)
                 {
                   
                     if( pattern%2==0)
                      {
                         System.out.print(" ");
                      }
                      else 
                      {
                        System.out.print("+");
                      }
                   }  
                   }
                      
                      else
                       {
                        for(int pattern =2*ln-1;pattern>0;pattern--)
                 {
                         if(pattern%2==0)
                          {
                             System.out.print(" ");
                           }
                            else {
                                   System.out.print("+");
                                  }   }
                    }   
                    System.out.print("\n");
                 }
                 
                 for(int ln=size-1;ln>0;ln--)
                 {
                  
          for(int s=size-ln;s>0;s--)
            {
              System.out.print(" ");
            }
             if(ln%2==0)
              {
                for(int pattern =2*ln-1;pattern>0;pattern--)
                 {
                   
                     if( pattern%2==0)
                      {
                         System.out.print(" ");
                      }
                      else 
                      {
                        System.out.print("*");
                      }
                   }  
              }
                      
                      else
                       {
                        for(int pattern =2*ln-1;pattern>0;pattern--)
                       {
                         if(pattern%2==0)
                          {
                             System.out.print(" ");
                           }
                            else {
                                   System.out.print("*");
                                  }
                      }
                    }   
                    System.out.print("\n");
                 
                 
           }
            }
          
          
          public static void main (String args[])
          {
           
           pract61 pattern = new pract61();
           
           pattern.displayPattern(3);
           
           }
           }
