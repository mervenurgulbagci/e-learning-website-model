
public class StudentManager {
	public void editToProfile(Student student) {
		System.out.println(student.getId()+"numarali ögrenci " + student.getFirstName()+student.getLastName()+"  profilini düzenledi.");
	}

	public void disconnect(Student student) {
		System.out.println(student.getId()+"numarali ögrenci " +student.getFirstName()+student.getLastName()+ " baglantisini kopardi.");
	}

	public void addToComment(Student student) {
		System.out.println(student.getId()+" numarali ögrenci"+" "+ student.getFirstName()+" "+student.getLastName()+" yorum yapti: "+student.getCommentText());
	}

	public void removeToComment(Student student) {
		System.out.println(student.getId()+" numarali ögrenci "+ student.getFirstName()+student.getLastName()+student.getCommentText()+" yorumunu sildi");
	}

	public void updateToComment(Student student) {
		System.out.println(student.getId()+" numarali ögrenci "+ student.getFirstName()+student.getLastName()+"yorumunu guncelledi: "+student.getCommentText());
		
	}
	public int completedToCourse(Student student) {
		return student.getCompleted();
	}
}
