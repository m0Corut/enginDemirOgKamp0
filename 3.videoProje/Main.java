
public class Main {

	public static void main(String[] args) {

		Instructor żnstructor = new Instructor();
		
		żnstructor.id=1;
		żnstructor.name="engin";
		żnstructor.courseName="java/react";
		żnstructor.email="sghdh@gmail.com";
		
		
		Student student=new Student("51654", 2, "mami", "sfjghsd@gmail.com", "fghsdg9462", 20);
		
		
		
		UserManager userManager=new UserManager();
		
		StudentManager studentManager=new StudentManager();
		InstructorManager żnstructorManager= new InstructorManager();
		
		
		
		żnstructorManager.add(żnstructor);
		żnstructorManager.login(żnstructor);
System.out.println();
		
		studentManager.add(student);
		studentManager.login(student);
		studentManager.joinCourse(żnstructor);
		studentManager.logout();
		
		
	}

}
