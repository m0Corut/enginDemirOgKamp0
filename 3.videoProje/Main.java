
public class Main {

	public static void main(String[] args) {

		Instructor �nstructor = new Instructor();
		
		�nstructor.id=1;
		�nstructor.name="engin";
		�nstructor.courseName="java/react";
		�nstructor.email="sghdh@gmail.com";
		
		
		Student student=new Student("51654", 2, "mami", "sfjghsd@gmail.com", "fghsdg9462", 20);
		
		
		
		UserManager userManager=new UserManager();
		
		StudentManager studentManager=new StudentManager();
		InstructorManager �nstructorManager= new InstructorManager();
		
		
		
		�nstructorManager.add(�nstructor);
		�nstructorManager.login(�nstructor);
System.out.println();
		
		studentManager.add(student);
		studentManager.login(student);
		studentManager.joinCourse(�nstructor);
		studentManager.logout();
		
		
	}

}
