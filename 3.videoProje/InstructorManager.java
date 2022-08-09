
public class InstructorManager extends UserManager{

	
		public void joinCourse(User user) {
			
			System.out.println(user.name+" join your course");
			
			
		}
	
		@Override
		public void login(User user) {
			
			System.out.println(user.name+" 'öðretmen hesabýna giriþi yapýldý'");
			
		}
	
		public void addPoint(Student student) {
			
			System.out.println(student.name+ " adlý hesaba puan eklediniz");
		
		}
	
	
	
	
	
}
