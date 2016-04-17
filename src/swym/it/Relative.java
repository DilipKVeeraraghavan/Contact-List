package swym.it;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
        

public class Relative extends Acquaintance {
    private Date lastMeet;
    private Date birthDay;
    
    public void setlastMeet(int d,int m,int y){
        lastMeet=new Date();
        lastMeet.setDate(d);
        lastMeet.setMonth(m);
        lastMeet.setYear(y);
    }
    
    
    public void setbirthDay(int d,int m,int y){
        birthDay=new Date();
        birthDay.setDate(d);
        birthDay.setMonth(m);
        birthDay.setYear(y);
    }
    
    public Date getLastMeet(){
        return lastMeet;
    }
    
    public Date getBirthDay(){
        return birthDay;
    }
    
    public String getlastMeet(){
        String total="";
        total+=String.format("%d\n",lastMeet.getDate());
        total+=String.format("%d\n",lastMeet.getMonth());
        total+=String.format("%d\n",lastMeet.getYear());
        return total;    
    }
    
    
    public String getbirthDay(){
        String total="";
        total+=String.format("%d\n",birthDay.getDate());
        total+=String.format("%d\n",birthDay.getMonth());
        total+=String.format("%d\n",birthDay.getYear());
        return total;
    }
    
    public void setDetails(int i) throws IOException{
        if(i==0)
            ContactList.openinstwriteFile();
        else ContactList.openwriteFile();
        ContactList.getFileWriter().write("1\n");
        ContactList.closewriteFile();
        System.out.println("Enter the following details :");
        Scanner input = new Scanner(System.in);
        setData();
        ContactList.openinstwriteFile();
        System.out.println("Enter the Last Met Date (in dd,mm,yyyy format) :");
        lastMeet=new Date();
        System.out.println("Date(dd) :");
        lastMeet.setDate(enterinteger());
        System.out.println("Month(mm) :");
        lastMeet.setMonth(enterinteger());
        System.out.println("Year(yyy) :");
        lastMeet.setYear(enterinteger());
        ContactList.getFileWriter().write(String.format("%s",getlastMeet()));
        System.out.print("Enter the BirthDay Date (in dd,mm,yyyy format) :");
        birthDay=new Date();
        System.out.println("Date(dd) :");
        birthDay.setDate(enterinteger());
        System.out.println("Month(mm) :");
        birthDay.setMonth(enterinteger());
        System.out.println("Year(yyy) :");
        birthDay.setYear(enterinteger());
        ContactList.getFileWriter().write(String.format("%s",getbirthDay()));
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
        total+=String.format("Date Last Met : %s\n",lastMeet);
        total+=String.format("BirthDay : %s\n",birthDay);
        
        return total;
    }
    public String getwriteDetails(){
        String total="1\n";
        
        total+=String.format("%s\n", getName());
        total+=String.format("%s\n", getMobileNo());
        total+=String.format("%s\n", getEmail());
        total+=String.format("%s",getlastMeet());
        total+=String.format("%s",getbirthDay());
        
        return total;
        
    }
    
    
    
}
