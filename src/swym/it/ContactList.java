package swym.it;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private static int count=0;
    private static int rcount=0;
    private static int percount=0;
    private static int acqcount=0;
    private static int procount=0;
    private static ArrayList<Acquaintance> contacts=new ArrayList<Acquaintance>();
    private static ArrayList<Relative> relatives=new ArrayList<Relative>();
    private static ArrayList<PersonalFriend> perfriends=new ArrayList<PersonalFriend>();
    private static ArrayList<ProfessionalFriend> profriends=new ArrayList<ProfessionalFriend>();
    private static ArrayList<CasualAcquaintance> acqs=new ArrayList<CasualAcquaintance>();
    
    private static FileWriter x;
    private static Scanner xscan;
    
    /*public static void main(String[] args) throws IOException {
        
        int choice;
        do{
            System.out.println(String.format("Please enter the any of the following numbers based on you choice :\n"+
                       "1 : Create Acquaintance"
                    +"\n2 : Delete Acquaintance"
                    +"\n3 : Display Entire List of Acquaintance"
                    +"\n4 : Display the list of specific category of acquaintance"
                    +"\n5 : Store in a file(output.txt)"
                    +"\n6 : Read from file(input.txt)"
                    +"\n7 : Search a given Name"
                    +"\n0 : Exit"));
            Scanner choices = new Scanner(System.in);
            choice = choices.nextInt();
            switch(choice){
                case 0 : choice =0;
                         break;
                case 1 : createAcq();
                         break;
                case 2 : deleteAcq();
                         break;
                case 3 : displayAcq();
                         break;
                case 4 : displaySpecAcq();
                         break;
                case 5 : writeAcq();
                         break;
                case 6 : readAcq();
                         break;
                case 7 : searchName();
                         break;
                default: System.out.println("Enter a valid choice !");
                         break;
            }
        
        }while(choice!=0);
    }*/
    
    public static void openwriteFile(){
        try{
            x=new FileWriter("output.txt",false);
        }
        catch(Exception e){
            System.out.println("Unable to Open File !!!!");
        }
    }
    
    public static FileWriter getFileWriter(){
        return x;
    }
    
    public static void openinstwriteFile(){
        try{
            x=new FileWriter("output.txt",true);
        }
        catch(Exception e){
            System.out.println("Unable to Open File !!!!");
        }
    }
    
    
    public static void openreadFile(){
        try{
            xscan=new Scanner(new File("output.txt"));
        }
        catch(Exception e){
            System.out.println("Unable to open File !!!!!");
        }
    }
    
    public static int getrcount(){
        return rcount;
    }
    
    public static int getpercount(){
        return percount;
    }
    
    public static int getprocount(){
        return procount;
    }
    
    public static int getacqcount(){
        return acqcount;
    }
    private static void writeAcq() throws IOException{
        openwriteFile();
        parsewriteAcq();
        closewriteFile();
        System.out.println("Successfully written to output.txt ");
    }
    
    public static void readAcq(){
        openreadFile();
        parsereadAcq();
        closereadFile();
    }
    
    
    public static void closewriteFile() throws IOException{
        x.close();
    }
    
    private static void closereadFile(){
        xscan.close();
    }
   
    
    public static String displayAcq(){
        int rcount=0;
        int procount=0;
        int percount=0;
        int acqcount=0;
        
        int dcount =0;
        
        String total = "Displaying details of all the acquaintances :\n\n";
        
        while(dcount<count){
            if(contacts.get(dcount) instanceof Relative){
                total += String.format("\nRelative %d : \n",rcount+1);
                total += String.format("%s",relatives.get(rcount).getDetails());
                rcount++;
                dcount++;
            }
            else if(contacts.get(dcount) instanceof ProfessionalFriend){
                total += String.format("\nProfessional Friend %d : \n",procount+1);
                total += String.format("%s",profriends.get(procount).getDetails());
                procount++;
                dcount++;
            }
            else if(contacts.get(dcount) instanceof PersonalFriend){
                total += String.format("\nPersonal Friend %d : \n",percount+1);
                total += String.format("%s",perfriends.get(percount).getDetails());
                percount++;
                dcount++;
                
            }
            else if(contacts.get(dcount) instanceof CasualAcquaintance){
                total += String.format("\nCasual Acquaintance %d : \n",acqcount+1);
                total += String.format("%s",acqs.get(acqcount).getDetails());
                acqcount++;
                dcount++;
            }
            else total += "Warning !!!!!!!!!!!!Undefined type Found";
        }
        
        return total;
    }
    
    public static String searchName(String name){
        int found=0;
        String x="";
        for(int j=0;j<rcount;j++){
                if(relatives.get(j).getName().equals(name)){
                    x +=(String.format("\nRelative :\n\n"+relatives.get(j).getDetails()));
                }
        }
        for(int j=0;j<percount;j++){
            if(perfriends.get(j).getName().equals(name)){
                x +=(String.format("\nPersonal Friend :\n\n"+perfriends.get(j).getDetails()));
            }
        }

        for(int j=0;j<procount;j++){
            if(profriends.get(j).getName().equals(name)){
                x +=(String.format("\nProfessional Friend :\n\n"+profriends.get(j).getDetails())); 
            }
        }

        for(int j=0;j<acqcount;j++){
            if(acqs.get(j).getName().equals(name)){
                x += (String.format("\nCasual Acquaintance :\n\n"+acqs.get(j).getDetails()));
            }
        }
        return x;
    }
    
    
    private static void SearchName(){
        int found=0;
        Scanner input =new Scanner(System.in);
        String name = input.nextLine();
        int i;
        for(i=0;i<count;i++){
            if(contacts.get(i).getName().equals(name))
            {
                if(contacts.get(i) instanceof Relative){
                    for(int j=0;j<rcount;j++){
                        if(relatives.get(j).getName().equals(name)){
                            System.out.println(relatives.get(j).getDetails());
                        }
                    }
                }
                else if(contacts.get(i) instanceof PersonalFriend){
                    for(int j=0;j<percount;j++){
                        if(perfriends.get(j).getName().equals(name)){
                            System.out.println(perfriends.get(j).getDetails());
                        }
                    }
                }
                
                else if(contacts.get(i) instanceof ProfessionalFriend){
                    for(int j=0;j<procount;j++){
                        if(profriends.get(j).getName().equals(name)){
                            System.out.println(profriends.get(j).getDetails()); 
                        }
                    }
                }
                
                else if(contacts.get(i) instanceof CasualAcquaintance){
                    
                    for(int j=0;j<acqcount;j++){
                        if(acqs.get(j).getName().equals(name)){
                            System.out.println(acqs.get(j).getDetails());
                        }
                    }
                }
            }
        }
        if(i==count){
            System.out.println("No Such Name Found !!!");
        }
    }
    private static void parsereadAcq(){
        int type;
        
        while(xscan.hasNextLine()){
            type=Integer.parseInt(xscan.nextLine());
            if(type==1){
                
                Relative dummy=new Relative();
                dummy.setName(xscan.nextLine());
                dummy.setMobileNo(xscan.nextLine());
                dummy.setEmail(xscan.nextLine());
                dummy.setlastMeet(Integer.parseInt(xscan.nextLine()),Integer.parseInt(xscan.nextLine()),Integer.parseInt(xscan.nextLine()));
                dummy.setbirthDay(Integer.parseInt(xscan.nextLine()),Integer.parseInt(xscan.nextLine()),Integer.parseInt(xscan.nextLine()));
                contacts.add(dummy);
                relatives.add(dummy);
                rcount++;
                count++;
                
            }
            else if(type==2){
                PersonalFriend dummy=new PersonalFriend();
                dummy.setName(xscan.nextLine());
                dummy.setMobileNo(xscan.nextLine());
                dummy.setEmail(xscan.nextLine());
                dummy.setcontext(xscan.nextLine());
                dummy.setacq(Integer.parseInt(xscan.nextLine()),Integer.parseInt(xscan.nextLine()),Integer.parseInt(xscan.nextLine()));
                dummy.setspecEvents(xscan.nextLine());
                contacts.add(dummy);
                perfriends.add(dummy);
                count++;
                percount++;
                
            }
            else if(type==3){                
                ProfessionalFriend dummy=new ProfessionalFriend();
                dummy.setName(xscan.nextLine());
                dummy.setMobileNo(xscan.nextLine());
                dummy.setEmail(xscan.nextLine());
                dummy.setprofInterest(xscan.nextLine());
                contacts.add(dummy);
                profriends.add(dummy);
                count++;
                procount++;
            }
            else if(type==4){                
                CasualAcquaintance dummy=new CasualAcquaintance();
                dummy.setName(xscan.nextLine());
                dummy.setMobileNo(xscan.nextLine());
                dummy.setEmail(xscan.nextLine());
                dummy.setwhenwhere(xscan.nextLine());
                dummy.setwhat(xscan.nextLine());
                dummy.setuseInfo(xscan.nextLine());
                contacts.add(dummy);
                acqs.add(dummy);
                count++;
                acqcount++;
            }
    
        }    
    }
    private static void parsewriteAcq() throws IOException{
        int rcount=0;
        int procount=0;
        int percount=0;
        int acqcount=0;
        
        int dcount =0;
        
        while(dcount<count){
            if(contacts.get(dcount) instanceof Relative){
                x.write(String.format("%s",relatives.get(rcount).getwriteDetails()));
                rcount++;
                dcount++;
            }
            else if(contacts.get(dcount) instanceof ProfessionalFriend){
                x.write(String.format("%s",profriends.get(procount).getwriteDetails()));
                procount++;
                dcount++;
            }
            else if(contacts.get(dcount) instanceof PersonalFriend){
                x.write(String.format("%s",perfriends.get(percount).getwriteDetails()));
                percount++;
                dcount++;
                
            }
            else if(contacts.get(dcount) instanceof CasualAcquaintance){
                x.write(String.format("%s",acqs.get(acqcount).getwriteDetails()));
                acqcount++;
                dcount++;
            }
            else{ 
                System.out.println("Warning !!!!!!!!!!!!Undefined type Found");
                break;
            }
        }
    }
    
    
    
    
    public static void displaySpecAcq(){
         int choice;
        do{
            System.out.println(String.format("Please enter the any of the following numbers based on you choice :\n"+
                       "1 : Display Relatives"
                    +"\n2 : Display Personal Friends"
                    +"\n3 : Display Professional Friends"
                    +"\n4 : Display Casual Acquaintances"
                    +"\n0 : Go Back"
            ));
            Scanner choices = new Scanner(System.in);
            choice = choices.nextInt();
            switch(choice){
                case 0 : choice =0;
                         break;
                case 1 : displayRelative();
                         break;
                case 2 : displayPersonal();
                         break;
                case 3 : displayProfessional();
                         break;
                case 4 : displayCasual();
                         break;
                default: System.out.println("Enter a valid choice !");
                         break;            
            }
        
        }while(choice!=0);
    }
    
    public static String displayRelative(){
        String total ="";
        if(rcount==0){
            total += "No Relatives found !";
            return total;
        }
        for(int i=0;i<rcount;i++){
            total += String.format("\nRelative %d : \n\n",i+1);
            total += relatives.get(i).getDetails();
            total += "\n";
        }
        return total;
    }
    
    
    public static String displayPersonal(){
        String total ="";
        if(percount==0){
            total += "No Personal Friends found !";
            return total;
        }
        for(int i=0;i<percount;i++){
            total += String.format("\nPersonal Friend %d : \n\n",i+1);
            total += perfriends.get(i).getDetails();
            total += "\n";
        }
        return total;
    }
    
    
    public static ArrayList<Relative> getRelative(){
        return relatives;
    }
    
    public static ArrayList<PersonalFriend> getPersonal(){
        return perfriends;
    }
    
    public static ArrayList<ProfessionalFriend> getProfessional(){
        return profriends;
    }
    
    public static ArrayList<CasualAcquaintance> getCasual(){
        return acqs;
    }
    public static ArrayList<Acquaintance> getContact(){
        return contacts;
    }
    
    public static void  rcountplus(){
        rcount++;
    }
    
    public static void percountplus(){
        percount++;
    }
    
    public static void  procountplus(){
        procount++;
    }
    
    public static void  acqcountplus(){
        acqcount++;
    }
    
    public static void  countplus(){
        count++;
    }
    
    public static String displayProfessional(){
        String total ="";
        if(procount==0){
            total += "No Professional Friends found !";
            return total;
        }
        for(int i=0;i<procount;i++){
            total += String.format("\nProfessional Friend %d : \n\n",i+1);
            total += profriends.get(i).getDetails();
            total += "\n";
        }
        return total;
    }
    
    
    public static String displayCasual(){
        String total ="";
        if(acqcount==0){
            total += "No Casual Acquaintances found !";
            return total;
        }
        for(int i=0;i<acqcount;i++){
            total += String.format("\nCasual Acquaintance %d : \n\n",i+1);
            total += acqs.get(i).getDetails();
            total += "\n";
            
        }
        return total;
    }
    
    
    
    private static void createAcq() throws IOException{
        int choice;
        do{
            System.out.println(String.format("Please enter the any of the following numbers based on you choice :\n"+
                       "1 : Create Relative Instance"
                    +"\n2 : Create Personal Friend Instance "
                    +"\n3 : Create Professional Friend Instance"
                    +"\n4 : Create Casual Acquaintance Instance"
                    +"\n0 : Go Back"
                        
            ));
            Scanner choices = new Scanner(System.in);
            choice = choices.nextInt();
            switch(choice){
                case 0 : choice =0;
                         break;
                case 1 : createRelative();
                         writeAcq();   
                         break;
                case 2 : createPersonal();
                         writeAcq();
                         break;
                case 3 : createProfessional();
                         writeAcq();
                         break;
                case 4 : createCasual();
                         writeAcq();
                         break;
                default: System.out.println("Enter a valid choice !");
                         break;         
            }
        
        }while(choice!=0);
    }
 
    public static void createRelative() throws IOException{
        int check=0;
        if(contacts.isEmpty()){
            check=1;
        }
        Relative dummy=new Relative();
        dummy.setDetails(check);
        relatives.add(dummy);
        contacts.add(dummy);
        rcount++;
        count++;
    }
    
    public static void deleteRelative(int index){
        int indexc =searchInContacts(relatives.get(index).getName());
        relatives.remove(index);
        contacts.remove(indexc);
        count--;
        rcount--;
    }
    
    
    public static void deleteProfessional(int index){
        int indexc =searchInContacts(profriends.get(index).getName());
        profriends.remove(index);
        contacts.remove(indexc);
        count--;
        procount--;
    }
    
    public static void deletePersonal(int index){
        int indexc =searchInContacts(perfriends.get(index).getName());
        perfriends.remove(index);
        contacts.remove(indexc);
        count--;
        percount--;
    }
    
    public static void deleteCasual(int index){
        int indexc =searchInContacts(acqs.get(index).getName());
        acqs.remove(index);
        contacts.remove(indexc);
        count--;
        acqcount--;
    }
    
    public static void createPersonal() throws IOException{
        int check=0;
        if(contacts.isEmpty()){
            check=1;
        }
        PersonalFriend dummy=new PersonalFriend();
        dummy.setDetails(check);
        contacts.add(dummy);
        perfriends.add(dummy);
        percount++;
        count++;
    }
    
    public static void createCasual() throws IOException{
        int check=0;
        if(contacts.isEmpty()){
            check=1;
        }
        CasualAcquaintance dummy=new CasualAcquaintance();
        dummy.setDetails(check);
        acqs.add(dummy);
        contacts.add(dummy);
        acqcount++;
        count++;
    }
    
    public static void createProfessional() throws IOException{
        int check=0;
        if(contacts.isEmpty()){
            check=1;
        }
        ProfessionalFriend dummy=new ProfessionalFriend();
        dummy.setDetails(check);
        profriends.add(dummy);
        contacts.add(dummy);
        procount++;
        count++;
    }
    
    public static int printRelativeNames(){
        if(rcount==0)
        {
            System.out.println("No Relative found !!");
            return 0;
        }
        for(int i=0;i<rcount;i++){
            System.out.println(String.format("Index %d : %s",i,relatives.get(i).getName()));
            
        }
        return 1;
    }
    
    public static int printProfessionalNames(){
        if(procount==0)
        {
            System.out.println("No professional friend found !!");
            return 0;
        }
        for(int i=0;i<procount;i++){
            System.out.println(String.format("Index %d : %s",i,profriends.get(i).getName()));
        }
        return 1;
    }
    public static int printPersonalNames(){
        if(percount==0)
        {
            System.out.println("No personal friend found !!");
            return 0;
        }
            
        for(int i=0;i<percount;i++){
            System.out.println(String.format("Index %d : %s",i,perfriends.get(i).getName()));
        }
        return 1;
    }
    public static int printCasualNames(){
        if(acqcount==0)
        {
            System.out.println("No Casual Acquaitance found !!");
            return 0;
        }
        for(int i=0;i<acqcount;i++){
            System.out.println(String.format("Index %d : %s",i,acqs.get(i).getName()));
        }
        return 1;
    }
    
    public static int searchInContacts(String x){
        for(int i=0;i<count;i++){
            if(contacts.get(i).getName().equals(x)){
                return i;
            }
        }
        return -1;
    }
}
