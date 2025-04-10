class student {
  private  String name;
  private  String branch;
  private  String year;
  private String  BloodGroup;
  private String regNo1; 
  private String regNo2;
  private String Email ;
             static  int count1 =0;
             static  int count2 =0;
             static  int count9 =500;
             static int count10 =500;
            
    public student(String name, String branch, String year,String BloodGroup) {
        this.name = name;
        this.branch = branch;
        this.year=year;
        this.BloodGroup =BloodGroup;
       // this.regNo = RegularStudentReg();
        }

        public String toString(){
                return "name of student :-"+ name +"\nBranch :-"+ branch+"\nYear:-"+ year +"\nBloodGroup:-"+BloodGroup;
             }


        public String RegularStudentReg(){ 
               
                    if( year.equals("regular") && branch.equals( "IT")){ 
                               count1=count1+1;
                            regNo1 = "2023BIT"+String.format("%03d",count1);
                         }
                            else if(year.equals("regular") && branch.equals( "CSE")){
                                 count2=count2+1;
                              regNo1 = "2023BCS"+String.format("%03d",count2);
                           }  
                                  return regNo1 ;
                       }  
                      public String DsyStudentsReg(){
                            if(year.equals("DSY")&& branch.equals("IT")){
                                 count9=count9+1;
                                regNo2 = "2024BIT"+String.format("%3d",count9);
                                }  else  if(year.equals("DSY")&& branch.equals("CSE")){
                                      count10=count10+1;
                                regNo2 = "2024BCS"+String.format("%3d",count10);
                                }
                                
                                return regNo2;
                          }  
                        public String StudentEmail(){
                            if(year.equals("regular")){
                             Email = regNo1+"@sggs.ac.in";
                             } else {
                                Email = regNo2+"@sggs.ac.in";
                                }
                                 return Email;
                            }    
                    }

        class RegularStudent  extends student {
             
                  RegularStudent (String name, String branch, String year,String BloodGroup){
                       super(name,branch,year,BloodGroup);
                       }
             public  String  toString() {
                    return super.toString() +"\nRegNo :-"+RegularStudentReg() +"\nEmail:-"+StudentEmail();
                  }
              }

        class DsyStudent extends student {
                    
                     DsyStudent (String name, String branch, String year,String BloodGroup ){
                       super(name,branch,year,BloodGroup);
                      
                       }
                    public  String  toString(){
                         return super.toString()+"\nregNo :-"+  DsyStudentsReg()+"\nEmail:-"+StudentEmail();
                  } 
        }
    class SMS{

    public static void main(String[] args) {
      int count =0; 
      
        for(int i=1; i<= args.length/4 ;i++){
                String name =args[count++];
                String branch = args[count++];
                String year = args[count++];
                String  BloodGroup= args[count++];
           System.out.println("--------------------------");
              
               if(year.equals("DSY")){
              DsyStudent  d1 = new DsyStudent(name,branch, year, BloodGroup);
              System.out.println(d1);
              } else{
             RegularStudent  s1= new RegularStudent( name,branch,year, BloodGroup);
               System.out.println(s1);
       }
    }
  }
}
