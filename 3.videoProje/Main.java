
public class Main {

	public static void main(String[] args) {

		Instructor ınstructor = new Instructor();
		
		ınstructor.id=1;
		ınstructor.name="engin";
		ınstructor.courseName="java/react";
		ınstructor.email="sghdh@gmail.com";
		
		
		Student student=new Student("51654", 2, "mami", "sfjghsd@gmail.com", "fghsdg9462", 20);
		
		
		
		UserManager userManager=new UserManager();
		
		StudentManager studentManager=new StudentManager();
		InstructorManager ınstructorManager= new InstructorManager();
		
		
		
		ınstructorManager.add(ınstructor);
		ınstructorManager.login(ınstructor);
System.out.println();
		
		studentManager.add(student);
		studentManager.login(student);
		studentManager.joinCourse(ınstructor);
		studentManager.logout();
		
		
	}

}
