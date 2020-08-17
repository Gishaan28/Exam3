
import java.io.*; 
import java.util.*; 
public class Person implements Comparable<Person>{
	String name;
	int age;
	double height;
	
	public Person(String Name, int age, double d) {
		this.name = Name;
		this.age = age;
		this.height = d;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.age - p.age;
	}
}




