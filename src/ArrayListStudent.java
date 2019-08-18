import java.io.*;
import java.util.*;
public class ArrayListStudent {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"laks",33);
		Student s2=new Student(2,"aksh",1);
		Student s3=new Student(3,"aditya",5);
		Student s4=new Student(4,"thiru",35);
		
		ArrayList<Student> al=new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		//Using Iterator to print elements from the arraylist
		
		//Iterator itr=al.iterator();
		
		/*while(itr.hasNext()) {
			Student s=(Student)itr.next();
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}*/
		
		//Using ForEach to print elements from the arraylist
		
		for(Student s:al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		
		
	}

}
