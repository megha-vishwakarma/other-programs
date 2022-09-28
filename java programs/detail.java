//package doctor;

import java.io.*;
abstract class Hospital {
             protected int m_id;
             protected String m_name=" ";
             Hospital(int id,String name)
             {    this.m_name=name;                         //construtor
                  this.m_id=id;
             }
                 }    

class Doctor extends Hospital
{         String dept=" ";
           
        Doctor(int m_id,String m_name,String dept)              //constructor
 
      {       super(m_id,m_name);
                this.dept=dept;    }  
      
        public void getdata() throws IOException
        {    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));  
            System.out.println("\nEnter member ID -");
                           m_id=Integer.parseInt(br.readLine());
             System.out.println("\nEnter member name -");
                            m_name=br.readLine();
             System.out.println("\nEnter department name  -");
                            dept=br.readLine();
        }   
       
         public void putdata()
         {   BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Member ID :=> "+m_id);
            System.out.println("Member Name :=> "+m_name);
            System.out.println("Department :=> "+dept);

         }
  }    


class detail{

    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        int n,i;
                  BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                     System.out.println("\nEnter number of doctor -"); 
                     
                     n=Integer.parseInt(br.readLine());
                    Doctor d[]=new Doctor[n];
                  //   BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                     
            for(i=0;i<n;i++)
            {d[i].getdata();}
            
            System.out.println("\n************  Details of doctors ************* -"); 
             for(i=0;i<n;i++)
            {d[i].putdata();}
            
            
    }
    
}
