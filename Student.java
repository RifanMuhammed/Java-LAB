
class Student{
	String name;
	int rollnumber;
	static int StudentCount;
	
	Student(String name,int rollnumber){
		this.name=name;
		this.rollnumber=rollnumber;
		StudentCount++;
		
	}
	public static void displayStudentCount() {
		System.out.println("student count: "+ StudentCount);	
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1= new Student("Samuel",34);
		Student.displayStudentCount();
		
		Student s2= new Student("Samdauel",314);
		
		Student.displayStudentCount();
		
		Student s3= new Student("Samufvel",334);
		
		Student.displayStudentCount();
	}
	
	
}
	
	
	
