import java.util.*; 
public class CreateStudentEmail {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   String name = "John Doe"; 
   
   System.out.println("Welcome to the student email username generator.");
   System.out.println("Please enter the first and last name of the student:");
   name = input.nextLine();  
      int beg_last_name = name.indexOf(" "); 
      String last_name = name.substring(beg_last_name + 1);
   System.out.println("Please enter the student's ID:");
   int id = input.nextInt();   
   
   String email = last_name.toLowerCase() + "." + name.toLowerCase().charAt(0) + "." + Integer.toString(id) + "@student.uni.edu";    
   
   System.out.println("\nStudent Name: " + name);
   System.out.println("Student ID: " + id);
   System.out.println("Email Address: " + email );
   }
}