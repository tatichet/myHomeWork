package studentsHW;

public class Student {
   String firstName;
   String lastName;
   int rating;
   
   public boolean isbetterStudent(Student st1, Student st2) {
	  if(st1.rating > st2.rating) {			 
	     return true;	   
		  }else {			 
		   return false;
		  }
	  }
   public void print() {
	   System.out.println("First name:" + firstName);
	   System.out.println("Last name:" + lastName);
	   System.out.println("Rating:" + rating);
	  
   }
   public void  print(String text, int number) {
	   System.out.println(text);
	   System.out.println(number);
   }
}





