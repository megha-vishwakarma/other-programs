import java.io.*;
abstract class Hospital {
             protected int m_id;
             protected String m_name=" ";
             Hospital(int id,String name)
             {    this.m_name=name;                         //construtor
                  this.m_id=id;
             }
         public void getdata();
          public void putdata();
         }    

class Doctor extends Hospital
{         String dept;
           
        Doctor(String dept,int id,String name)              //constructor
        {       super(name);
                super(id);
                this.dept=dept;      
        @Override
        public void getdata()
        {       System.out.println("\nEnter member ID -");
                            id=Integer.parseInt(br.readLine());
             System.out.println("\nEnter member name -");
                            name=br.readLine();
             System.out.println("\nEnter department name  -");
                            dept=br.readLine();
        }   
          @Override
         public void putdata()
         {  
            System.out.println("Member ID :=> "+id);
            System.out.println("Member Name :=> "+name);
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
                     BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                     
            for(i=0;i<n;i++)
            {d[i]=getdata();}
            
            System.out.println("\n************  Details of doctor ************* -"); 
             for(int i=0;i<n;i++)
            {d[i]=putdata();}
            
            
    }
    
}
import java.io.*;
abstract class Hospital {
             protected int m_id;
             protected String m_name=" ";
             Hospital(int id,String name)
             {    this.m_name=name;                         //construtor
                  this.m_id=id;
             }
         public void getdata();
          public void putdata();
         }    

class Doctor extends Hospital
{         String dept;
           
        Doctor(String dept,int id,String name)              //constructor
        {       super(name);
                super(id);
                this.dept=dept;      
        @Override
        public void getdata()
        {       System.out.println("\nEnter member ID -");
                            id=Integer.parseInt(br.readLine());
             System.out.println("\nEnter member name -");
                            name=br.readLine();
             System.out.println("\nEnter department name  -");
                            dept=br.readLine();
        }   
          @Override
         public void putdata()
         {  
            System.out.println("Member ID :=> "+id);
            System.out.println("Member Name :=> "+name);
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
                     BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                     
            for(i=0;i<n;i++)
            {d[i]=getdata();}
            
            System.out.println("\n************  Details of doctor ************* -"); 
             for(int i=0;i<n;i++)
            {d[i]=putdata();}
            
            
    }
    
}
