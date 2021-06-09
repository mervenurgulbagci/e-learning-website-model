
public class InstructorManager extends UserManager {
	public void addToHomework(Instructor instructor) {
		System.out.println("Egitmen "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafindan "+instructor.getHomeworkText()+" ödevi eklendi");
	}
}
