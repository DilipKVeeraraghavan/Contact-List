package swym.it;

import java.io.IOException;
import java.util.Scanner;

public class ProfessionalFriend extends Acquaintance{
    private String profInterest;
    
    
    public void setprofInterest(String x){
        profInterest=x;
    }
    
    public void setprofInterest(){
        Scanner in =new Scanner(System.in);
        do{
            String x=in.nextLine();
            if(x.length()<=100){
                profInterest =x;
                break;
            }
            else System.out.println("Please limit the sentence within 100 chars !");
        }while(true);
    }
    
    public String getprofInterest(){
        return profInterest;
    }
    
    public void setDetails(int i) throws IOException{
        if(i==0)
            ContactList.openinstwriteFile();
        else ContactList.openwriteFile();
        ContactList.getFileWriter().write("3\n");
        ContactList.closewriteFile();
        System.out.println("Enter tthe following details :");
        Scanner input = new Scanner(System.in);
        setData();
        ContactList.openinstwriteFile();
        System.out.print("Enter common Professional Interests:");
        setprofInterest();
        ContactList.getFileWriter().write(String.format("%s\n",profInterest));
        ContactList.closewriteFile();
    }
    
    public String getDetails(){
        String total="";
        
        total+=String.format("Name : %s\n", getName());
        total+=String.format("Mobile No : %s\n", getMobileNo());
        total+=String.format("Email : %s\n", getEmail());
        total+=String.format("Common Professional Interests : %s\n",profInterest);
        
        return total;
    }
    
    public String getwriteDetails(){
        String total="3\n";
        
        total+=String.format("%s\n", getName());
        total+=String.format("%s\n", getMobileNo());
        total+=String.format("%s\n", getEmail());
        total+=String.format("%s\n",profInterest);
        
        return total;
    }
}
