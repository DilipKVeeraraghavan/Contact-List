package swym.it;

import java.io.IOException;
import java.util.Scanner;

public class Acquaintance {
    private String Name;
    private String MobileNo;
    private String Email;

    public String getName(){
        return Name;
    }
    
    public String getMobileNo(){
        return MobileNo;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setemail(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                Email =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
    }
    
    public void setmobileNo(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                MobileNo =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
    }
    
    public void setname(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                System.out.println(String.format("Size : %d",x.length()));
                Name =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
    }
    
    public void setData() throws IOException{
        ContactList.openinstwriteFile();
        Scanner input =new Scanner(System.in);
        System.out.print("Name :");
        Name=input.nextLine();
        ContactList.getFileWriter().write(String.format("%s\n",Name));
        System.out.print("MobileNo :");
        MobileNo=String.format("%d",enterinteger()); 
        ContactList.getFileWriter().write(String.format("%s\n",MobileNo)); 
        System.out.print("Email :");
        do{
            Email=input.nextLine();
            if(isValidEmailAddress(Email)){
                ContactList.getFileWriter().write(String.format("%s\n",Email));
                ContactList.closewriteFile();
                return;
            }
            else{
                System.out.println("Please Enter a Valid Email ID !");
            }   
        }while(true);
    }
    
    public void SetName(){
        Scanner input =new Scanner(System.in);
        System.out.print("Name :");
        Name=input.nextLine(); 
    }
    public void setName(String x){
        Name=x;
    }
    
    public void setEmail(String x){
        Email=x;
    }
    public void setMobileNo(String x){
        MobileNo=x;
    }
    
    public void SetMobileNo(){
        System.out.print("MobileNo :");
        MobileNo=String.format("%d",enterinteger());  
    }
    public void SetEmail(){
        Scanner input =new Scanner(System.in);
        System.out.print("Email :");
        do{
            Email=input.nextLine();
            if(isValidEmailAddress(Email)){
                return;
            }
            else{
                System.out.println("Please Enter a Valid Email ID !");
            }   
        }while(true);
    }
    
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    
    private long enterinteger(){        
        long enter=-1;
        boolean check=false;
        do{
            try{
                Scanner integer =new Scanner(System.in);
                enter=integer.nextLong();
                check=false;
            }
            catch(Exception e){
                System.out.println("Please enter a valid number! ");
                check=true;
            }
        }while(check);
        return enter;
    }
    
    
}
