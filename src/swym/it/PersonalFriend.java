package swym.it;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class PersonalFriend extends Acquaintance{
    private  String context;
    private Date acq;
    private String specEvents;

    public void setcontext(String x){
        context=x;
    }
    
    
    public void setspecEvents(String x){
        specEvents=x;
    }
    
    public void setcontext(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                context =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
    }
    
    public void setspecEvents(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                specEvents =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
    }
    
    
    public Date getAcq(){
        return acq;
    }
    
    public void setacq(int d,int m,int y){
        acq=new Date();
        acq.setDate(d);
        acq.setMonth(m);
        acq.setYear(y);
    }
    
    public String getacq(){
        String total="";
        total+=String.format("%d\n",acq.getDate());
        total+=String.format("%d\n",acq.getMonth());
        total+=String.format("%d\n",acq.getYear());
        return total;    
    }
    
    
    public void setDetails(int i) throws IOException{
        if(i==0)
            ContactList.openinstwriteFile();
        else ContactList.openwriteFile();
        ContactList.getFileWriter().write("2\n");
        ContactList.closewriteFile();
        System.out.println("Enter tthe following details :");
        Scanner input = new Scanner(System.in);
        setData();
        ContactList.openinstwriteFile();
        System.out.print("Enter the context :");
        setcontext();
        ContactList.getFileWriter().write(String.format("%s\n",context));
        System.out.print("Enter the Date on which acquainted (in dd,mm,yyyy format) :");
        acq=new Date();
        System.out.println("Date(dd) :");
        acq.setDate(enterinteger());
        System.out.println("Month(mm) :");
        acq.setMonth(enterinteger());
        System.out.println("Year(yyy) :");
        acq.setYear(enterinteger());
        ContactList.getFileWriter().write(String.format("%s",getacq()));
        System.out.print("Enter specific Events that need to be noted:");
        setspecEvents();
        ContactList.getFileWriter().write(String.format("%s\n",specEvents));
        ContactList.closewriteFile();
    }
    
    
    
    private int enterinteger(){
        int enter=-1;
        boolean check=false;
        do{
            try{
                Scanner integer =new Scanner(System.in);
                enter=integer.nextInt();
                if(enter<0){
                    System.out.println("Please enter a non-negative integer !");
                    check=true;
                }
                else check=false;
            }
            catch(Exception e){
                System.out.println("Please enter an integer! ");
                check=true;
            }
        }while(check);
        return enter;
    }
    
    public String getDetails(){
        String total="";
        
        total+=String.format("Name : %s\n", getName());
        total+=String.format("Mobile No : %s\n", getMobileNo());
        total+=String.format("Email : %s\n", getEmail());
        total+=String.format("Context : %s\n",context);
        total+=String.format("Date of Acquaintance : %s\n",acq);
        total+=String.format("Special Events : %s\n",specEvents);
        
        return total;
        
    }
    
    public String getwriteDetails(){
        String total="2\n";
        
        total+=String.format("%s\n", getName());
        total+=String.format("%s\n", getMobileNo());
        total+=String.format("%s\n", getEmail());
        total+=String.format("%s\n",context);
        total+=String.format("%s",getacq());
        total+=String.format("%s\n",specEvents);
        
        return total;
    }
    
    public String getcontext(){
        return context;
    }
    
    public String getspecEvents(){
        return specEvents;
    }
    
}
