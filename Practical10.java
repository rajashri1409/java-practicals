 class Practical10 {
    void  displaygrid(int size){
             int i=2*size+1,j=2*size+1;  
                String arr[][]=new String[i][j];
                    for(i=0;i<=2*size;i++){
                         for(j=0;j<=2*size;j++){
                                arr[i][j]=Integer.toString(j+i-1);
                             }     
                        }
           for(i=1;i<=2*size+1;i++){
                   if(i%2==0){
                       for(j=1;j<=2*size+1;j++){
                            if(j%2==0){
                                 if(Integer.parseInt(arr[i][j]) > 9){
                                        if(j%3==0|| i%3==0){
                                           System.out.print("   ");
                                    } else {
                                         System.out.print(" "+arr[i][j]+"");
                                      }
                                  }    
                                     else{    
                                           if(j%3==0|| i%3==0){  
                                                System.out.print(" "+arr[i][j]+" ");
                                         } else{
                                               System.out.print("   ");
                                        } 
                                  }
                              }  
                                else{
                                    System.out.print("| ");
                               }
                            }
                                 System.out.println();
                       }  
                          else{
                               for(j=1;j<=2*size+1;j++){
                                       if(j%2==0){
                              	           System.out.print(" ---");
                        	      }
                   	      else{ 
                   	           System.out.print("+");
                              }
                           }
                               System.out.println();
                       }
                }
            }           
                 public static void main(String []args){
                      Practical10 grid = new Practical10();
                          grid.displaygrid(3);
             }
       }                                 
