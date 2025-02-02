     public class str1 {
            void H(int size){
            size+=1;
                 for(int row=1;row<2*size;row++){
                    for(int col=1;col<2*size;col++){
                        if(col==1||row==size||col==2*size-1){
                               System.out.print("*");
                        }
                          else{
                             System.out.print(" ");
                        }
                    }
                    System.out.println();
                } 
            } 
            //pattern for R
                     void R(int size){
                     size+=1;
                      for(int row=1;row<2*size;row++){
                          if(row==1){
                             for(int p=1;p<2*size;p++){  
                                 if(p==1||p==2*size-1){
                                       System.out.print(" ");
                                }
                                 else{
                                      System.out.print("*");
                                  }
                             }
                          }
                
                          else if( row>1&&row<size){
                              for(int p=1;p<2*size;p++){
                                  if(p==1||p==2*size-1){
                                      System.out.print("*");
                                } 
                                  else{
                                     System.out.print(" ");
                                  }
                                }
                              }
                               else if(row==size){
                                  for(int p=1;p<2*size;p++){
                                       if(p<2*size-1){
                                          System.out.print("*"); 
                                    }
                                      else{
                                          System.out.print(" ");
                                    }
                                }
                              }
                               else if(row>size){
                                   for(int p=1;p<2*size;p++){
                                       if(p==1||p==row-size){
                                           System.out.print("*");
                                        }
                                         else{
                                               System.out.print(" ");
                                        }
                                    }
                              }
               
                               System.out.println();
                        } 
                    }
     // pattern for S
            void S(int size){
            size+=1;
                for(int row=1;row<2*size;row++){
                  if(row==1||row==size||row==2*size-1){
                      for(int p=1;p<2*size;p++){
                           if(p==1||p==2*size-1){
                               System.out.print(" ");
                           }
                             else {
                                 System.out.print("*");
                            }
                         }
                      }
                     else{
                          if(row>1&&row<size){
                              System.out.print("*");
                           for(int p=2;p<2*size;p++){
                                System.out.print(" ");
                            }
                         }
                         else {
                               for(int p=1;p<2*size-1;p++){
                                    System.out.print(" ");
                              }
                                 System.out.print("*");
                          }
                      }
                                System.out.println();
               }  
          }
   
   // pattern for I
          void I(int size){
          size+=1;
                  for(int row=1;row<2*size;row++){
                       for(int col=1;col<2*size;col++){
                          if(row==1||col==size||row==2*size-1){
                               System.out.print("*");
                           }
                             else{
                                  System.out.print(" ");
                                }
                           }
                             System.out.println();
                       }
                     }
     // pattern for J
     void J(int size){
     size+=1;
        for(int row=1;row<2*size;row++){
              if(row==1){
                  for(int p=2*size-1;p>0;p--){
                       System.out.print("*");
                  }
              }
              else if(row>1&&row<=size){
                  for(int p=2*size-1;p>0;p--){
                       if(p>size||p<size){
                          System.out.print(" ");
                      }
                        else{
                            System.out.print("*");
                        }
                    }
                }
                   else if(row>size&&row<2*size-1){
                      for(int p=2*size-1;p>0;p--){
                        if(p==size||p==2*size-1){
                            System.out.print("*");
                    }
                     else{
                            System.out.print(" ");
                      }
                  }
          }
                else if(row==2*size-1){
                      for(int p=2*size-1;p>0;p--){
                          if(p==2*size-1||p<=size){
                              System.out.print(" ");
                          }
                          else {
                             System.out.print("*");
                      }
                  }
               } 
                  
                 System.out.println();
            }
        }  
        //pattern for A
        void A(int size){
            size+=1;
            for(int row=1;row<2*size;row++){
               for(int col=1;col<2*size;col++){
                  if( ((col==1||col==2*size-1)&&row>1)||((row==1)&&col>1)||row==size){
                       if(row==1 && col==2*size-1){
                              System.out.print(" ");
                      }else{
                            System.out.print("*");
                      }
                    }
                      else{
                          System.out.print(" ");
                        }
                  }
                     System.out.println();
            }   
          }
      
      public static void main(String args[]){
    
              str1 i1=new str1();
              i1.R(4);
              System.out.println();
               i1.A(4);
             System.out.println();
              i1.J(4);
            System.out.println();
              i1.A(4);
            System.out.println();
             i1.S(4);
          System.out.println();
              i1.H(4);
          System.out.println();
            i1.R(4);
          System.out.println();
            i1.I(4);
   
      }
}
