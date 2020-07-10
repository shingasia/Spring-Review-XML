package ex;

public class StudentInfo {
	
	private Student student;
	//생성자
	public StudentInfo(Student student) {
		this.student=student;
	}
	
	public void getStudentInfo() {
		if(student!=null) {
			System.out.println("이름 : "+student.getName());
			System.out.println("나이 : "+student.getAge());
			System.out.println("학년 : "+student.getGradeNum());
			System.out.println("반   : "+student.getClassNum());
			System.out.println("======================\n");
		}
	}
	//설정자
	public void setStudent(Student student) {
		this.student=student;
	}
	
}
