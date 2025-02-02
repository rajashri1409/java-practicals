public class str1 {
    String getStringH(int size,int row){
      String Pattern="";
      String blankString=" ";
       for(int col=1;col<2*size;col++){
             if(col==1||row==size||col==2*size-1){
                    Pattern+="*";
               }
               else{
                      Pattern+=blankString;
           }
           }
           return Pattern;
    } 
    //pattern for R
    String getStringR(int size,int row){
          String Pattern="";
          String blankString=" ";
            if(row==1){
              for(int p=1;p<2*size;p++){  
                  if(p==1||p==2*size-1){
                      Pattern+=blankString;
                   }
                      else{
                      Pattern+="*";
                     }
                }
            }
             else if( row>1&&row<size){
                 for(int p=1;p<2*size;p++){
                    if(p==1||p==2*size-1){
                       Pattern+="*";
                    } 
                     else{
                       Pattern+=blankString;
                 }
              }
            }
               else if(row==size){
                 for(int p=1;p<2*size;p++){
                    if(p<2*size-1){
                      Pattern+="*";
                  }
                   else{
                      Pattern+=blankString;
                 }
              }
           }
              else if(row>size){
                for(int p=1;p<2*size;p++){
                  if(p==1||p==row-1){
                      Pattern+="*";
                 }
                  else{
                      Pattern+=blankString;
                  }
              }
         }
                return Pattern;
     }
     
     String getStringS(int size,int row){
      String Pattern="";
      String blankString=" ";
    
        if(row==1||row==size||row==2*size-1){
           for(int p=1;p<2*size;p++){
              if(p==1||p==2*size-1){
                   Pattern+=blankString;
                 }
                  else {
                 Pattern+="*";
                 }
           }
          }
         else
          {
          if(row>1&&row<size){
             Pattern+="*";
          for(int p=2;p<2*size;p++){
               Pattern+=blankString;
        }
      }
  else {
     for(int p=1;p<2*size-1;p++){
         Pattern+=blankString;
     }
        Pattern+="*";
    }
}
    return Pattern;
   }
   
   // pattern for I
   String getStringI(int size,int row){
   
      String Pattern="";
      String blankString=" ";
     for(int col=1;col<2*size;col++){
        if(row==1||col==size||row==2*size-1){
             Pattern+="*";
           }
           else{
             Pattern+=blankString;
           }
         }
             return Pattern;
     }
     // pattern for J
     String  getStringJ(int size,int row){
      String Pattern="";
      String blankString=" ";
       
        if(row==1){
        for(int p=2*size-1;p>0;p--){
           Pattern+="*";
      }
  }
           else if(row>1&&row<=size){
             for(int p=2*size-1;p>0;p--){
                if(p>size||p<size){
                   Pattern+=blankString;
                 }
                   else{
                      Pattern+="*";
                  }
               }
          }
                  else if(row>size&&row<2*size-1){
                  for(int p=2*size-1;p>0;p--){
                    if(p==size||p==2*size-1){
                        Pattern+="*";
                    }
                     else{
                        Pattern+=blankString;
                      }
                  }
          }
              else if(row==2*size-1){
                      for(int p=2*size-1;p>0;p--){
                        if(p==2*size-1||p<=size){
                           Pattern+=blankString;
                      }
                      else {
                          Pattern+="*";
                      }
                      }
                  } 
                   return Pattern;
        }  
        
        //pattern for A
        String getStringA(int size,int row){
           String Pattern="";
      String blankString=" ";
             for(int col=1;col<2*size;col++){
                 if( ((col==1||col==2*size-1)&&row>1)||((row==1)&&col>1)||row==size){
                      if(row==1 && col==2*size-1){
                         Pattern+=blankString;
                      }else{
                         Pattern+="*";
                      }
                    }
                       else{
                           Pattern+=blankString;
                        }
                       
                  }
                     return Pattern;
        }
      
  public static void main(String args[]){
      int size=5;
      size+=1;
    str1 i1=new str1();
    for(int row=1;row<2*size;row++){
    
    System.out.print(i1.getStringR(size,row)+"   "+i1.getStringA(size,row)+"   "+i1.getStringJ(size,row)+"   "+i1.getStringA(size,row)+"   "+i1.getStringS(size,row)+"   "+i1.getStringH(size,row)+"   "+i1.getStringR(size,row)+"   "+i1.getStringI(size,row)+"\n");
    
    }
      
    }
  }
