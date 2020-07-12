package object;


class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student std = (Student)obj;
			return (this.studentNum == std.studentNum);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
	
	
}


public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "�̼���");
		
		Student Shin = new Student(100, "�̼���");
	}

}
