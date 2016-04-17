package swym.it;

import java.io.IOException;
import java.util.Scanner;

public class CasualAcquaintance extends Acquaintance {
    private String whenwhere;
    private String what;
    private String useInfo;
    
    
    public void setwhenwhere(String x){
        whenwhere=x;
    }
    public void setwhat(String x){
        what=x;
    }
    public void setuseInfo(String x){
        useInfo=x;
    }
    
    public void setwhenwhere(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                whenwhere =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
    }
    
    public void setwhat(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                what =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
        
    }
    
    public void setuseInfo(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                useInfo =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
    }
    
    
    public void setDetails(int i) throws IOException{
        if(i==0)
            ContactList.openinstwriteFile();
        else ContactList.openwriteFile();
        ContactList.getFileWriter().write("41\n");
        ContactList.closewriteFile();
        System.out.println("Enter the following details :");
        Scanner input = new Scanner(System.in);
        setData();
        ContactList.openinstwriteFile();
        System.out.print("Enter when and where met :");
        setwhenwhere();
        ContactList.getFileWriter().write(String.format("%s\n",whenwhere));
        System.out.print("Enter under what circumstances :");
        setwhat(); 
        ContactList.getFileWriter().write(String.format("%s\n",what));
        System.out.print("Enter any other useful Info :");
        setuseInfo();
        ContactList.getFileWriter().write(String.format("%s\n",useInfo)); 
        ContactList.closewriteFile();
    }
    
    public String getDetails(){
        String total="";
        
        total+=String.format("Name : %s\n", getName());
        total+=String.format("Mobile No : %s\n", getMobileNo());
        total+=String.format("Email : %s\n", getEmail());
        total+=String.format("When and Where Met : %s\n",whenwhere);
        total+=String.format("Under what circumstances : %s\n",what);
        total+=String.format("Useful Information : %s\n",useInfo);
        
        return total;
        
    }
    public String getwriteDetails(){
        String total="4\n";
        
        total+=String.format("%s\n", getName());
        total+=String.format("%s\n", getMobileNo());
        total+=String.format("%s\n", getEmail());
        total+=String.format("%s\n",whenwhere);
        total+=String.format("%s\n",what);
        total+=String.format("%s\n",useInfo);
        
        return total;
        
    }
    
    
    public String getwhenwhere(){
        return whenwhere;
    }
    
    public String getuseInfo(){
        return useInfo;
    }
    
    public String getwhat(){
        return what;
    }
    
}

