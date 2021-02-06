package studentsHW;

public class main {

	public static void main(String[] args) {
	
		Student st1 = new Student();
		st1.firstName = "Olha";
		st1.lastName = "Glushko";
		st1.rating = 50;
		
		Student st2 = new Student();
		st2.firstName = "Oleg";
		st2.lastName = "Foros";
		st2.rating = 80;
		
		Student st3 = new Student();
		st3.firstName = "Anna";
		st3.lastName = "Goron";
		st3.rating = 80;
		
		  boolean testResult = st1.isbetterStudent(st1, st2);
  
		System.out.println("Is Olga Glushko better student?");
		System.out.println(testResult);
		System.out.println("-------");
		System.out.println("List of studets");
	
		st1.print();
		System.out.println("******");
		st2.print();
		System.out.println("******");
		st3.print();
		
		
		int aver = ((st1.rating+st2.rating+st3.rating)/3);
		System.out.println("Average rating of all students is " + aver);
		System.out.println("******");
		
		st3.print("New rating for Anna Goron", 90);
		
		st3.rating = 90;
		int aver2 = ((st1.rating+st2.rating+st3.rating)/3);
		System.out.println("New average rating of all students is " + aver2);
	}
}

	

     