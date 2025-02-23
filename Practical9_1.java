public class Practical9_1 {
     
     public static  void main (String args[]){
             
             int size =0;
             if(args.length>0){
                 size=Integer.parseInt(args[0]);
                 }
                 
             String [] str=new String[size];
             
               long totalStringTime=0;
                 long totalStringBufferTime=0;
                 long totalStringBuilderTime=0;
             for(Integer index=0;index< size ;index++){
                 Integer num= (int )(System.nanoTime()%51); 
                  str[index]=num.toString();
                 long initialTime;
                 long endtime;
                
                
                 // for string 
               initialTime=System.nanoTime();
               String s1="134";
               String temp= s1+str[index];
               endtime=System.nanoTime();
                totalStringTime +=( endtime - initialTime);
               
               //for StringBuffer
                 initialTime=System.nanoTime();
                 StringBuffer s2 = new StringBuffer("234");
                 s2.append(str[index]);
                  endtime=System.nanoTime();
                   totalStringBufferTime +=( endtime- initialTime);
                  
                // for StringBuilder
                initialTime =System.nanoTime();
                StringBuilder s3 =new StringBuilder("345");
                s3.append(str[index]);
                endtime=System.nanoTime();
                   totalStringBuilderTime +=(endtime -initialTime );
              }   
                 //calculate the average time of each method 
                float AverageTimeOfString =totalStringTime/(float)size ;
                float AverageTimeOfStringBuffer=totalStringBufferTime/(float)size;
                float AverageTimeOfStringBuilder=totalStringBuilderTime/(float)size;
                System.out.println(" array elements :");
                
                for( Integer index=0; index<size ;index++){
                   System.out.print(str[index]+" ");
                   }
                   System.out.print("\n");
                
                // display the Average time of each method 
                System.out.println("the average time of String is:" + AverageTimeOfString+"ns");
                System.out.println(" the average time of StringBuffer is:"+ AverageTimeOfStringBuffer+"ns");
                System.out.println("the average time of StringBuilder is :"+ AverageTimeOfStringBuilder+"ns");
                
                
                // comparing  method i.e which one is better 
                
                if(AverageTimeOfString>AverageTimeOfStringBuffer && AverageTimeOfString>AverageTimeOfStringBuilder){
                      System.out.println("String method is better than other two's");
                  }
                   else if(  AverageTimeOfStringBuffer>AverageTimeOfString && AverageTimeOfStringBuffer>AverageTimeOfStringBuilder){
                        
                        System.out.println("StringBuffer method is better than other two's");
                     }
                    else if( AverageTimeOfStringBuilder> AverageTimeOfString &&  AverageTimeOfStringBuilder> AverageTimeOfStringBuffer){
                         
                          System.out.println("StringBuilder method is better than other two's ");
                      }
                          
            }         
                      
                
      }          
                
                 
                
                
                  
                  
