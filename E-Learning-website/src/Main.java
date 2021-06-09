
public class Main {

	
		public static void main(String[] args) {
			UserManager[] userManagers=new UserManager[] {};
			User user=new User();
			user.setId(1);
			Student student=new Student();
			student.setId(2);
			Instructor instructor=new Instructor();
			instructor.setId(3);
			
			
		for(UserManager userManager:userManagers) {
			
			userManager.login(user);
			userManager.logOut(instructor);
			userManager.login(student);
			
			}
			StudentManager studentManager=new StudentManager();
			
			student.setId(1);
			student.setFirstName("Ayse");
			student.setLastName("Kara");
			student.setEmail("aysekara@gmail.com");
			student.setPassword("parola123");
			student.setCommentText("Kurs çok verimli.");
			student.getCompleted();
			studentManager.addToComment(student);
			
			InstructorManager instructorManager=new InstructorManager();
			instructor.setId(2);
			instructor.setFirstName("Engin");
			instructor.setLastName("Demirog");
			instructor.setHomeworkText("Kodlama.io projesini yazdiginizi düsünelim. User, Instructor, Student nesnelerini modelleyiniz");
			instructorManager.addToHomework(instructor);
			

		}

	}


