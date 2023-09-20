package day5;

public class Q02_AddStudentSubclass {

	public static void main(String[] args) {
		Person p = new Person("Jayendra","jay@gmail.com");
		p.print();
		p.setEmail("jay123@gmail.com");
		p.print();
		
		
		Teacher t = new Teacher("MuraliKrishna","mk@gmail.com","English, maths");
		t.print();
		t.setSubjects("All Subjects");
		t.setEmail("mk123@gmail.com");
		t.print();
		
		Student s = new Student("Satish","satti@gmail.com","java,python");
		s.print();
		s.changeCourse("core java");
		s.setEmail("Satti123@gmail.com");
		s.print();
	}

}
