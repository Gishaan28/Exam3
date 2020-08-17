import java.util.*;

import javax.lang.model.util.Elements;
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		question8();
//		question9();
//		question10();
		
//		Question11: 
//		String: Strings are immutable. Objects of this class are of fixed length.
//		
//		StringBuffer: StringBuffers are mutable. They are synchronized which means 2 threads cannot call methods of StringBuffer 
//		simultaneously. StringBuffer is less efficient than StringBuilder.
//		
//		StringBuilder: StringBuilders are mutable. They are non-synchronized which means 2 threads can call methods of StringBuilder 
//		simultaneously. StringBuilder is more efficient than StringBuffer.
		
//		Question12:
//		List is an ordered collection that can have multiple same elements.
//		Elements can be accessed based on their indexes.
//		
//		Set is an unordered collection that cannot have multiple same elements.
//		Elements cannot be accessed based on their indexes.

//		Question13
//		Array: It is of fixed size. It is a basic functionality provided by Java. ELements can be accessed using [].
//		
//		ArrayList: It has dynamic size. It is part of the Collection framework. Methods are needed to access elements.
		
//		Question14
//		Treeset: Elements are sorted in a TreeSet. Accessing elements is slower here than HashSet. Does not allow null object.
//		
//		HashSet: Elements are not sorted. Accessing elements is faster here than TreeSet.
//		Allows null object.
		
//		question15();
		
//		Question16:
//		Comparable: It allows comparing of objects with natural order. For example age, height, etc. The compareTo method of the class is used
//		to define the natural ordering. For example"
//		public class Person implements Comparable<Person>{
//			String name;
//			int age;
//			double height;
//			
//			public Person(String Name, int age, double d) {
//				this.name = Name;
//				this.age = age;
//				this.height = d;
//			}
//
//			@Override
//			public int compareTo(Person p) {
//				// TODO Auto-generated method stub
//				return this.age - p.age;
//			}
//		}
//		
//		Comparator: It allows comparing of objects with or without natural order. For example name, etc. The compare method of the class is used to 
//		define the ordering. Custom ordering can be done using this. For example:
//		public class HeightCompare implements Comparator<Person> 
//		{
//			@Override
//			public int compare(Person p1, Person p2) {
//				if (p1.getHeight() < p2.getHeight()) return -1;
//				if (p1.getHeight() > p2.getHeight()) return 1;
//				else return 0;
//			}
//		}
		
//		Quesiton17: Done in Employee.java.
//		question18();
//		question19();
//		question20();
		
		
		
		
	}
	
	public static void question1() {
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		a.put(2,"Two");
		a.put(1,"One");
		a.put(3,"Three");
		a.put(4,"Four");
	
		for (Integer i: a.keySet()) {
			System.out.println("Key is " + i + " and value is " + a.get(i));
		}
	}
	
	public static void question2() {
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		a.put(2,"Two");
		a.put(1,"One");
		a.put(3,"Three");
		a.put(4,"Four");
		ArrayList<Integer> sortedKeys = new ArrayList<Integer>(a.keySet());
		Collections.sort(sortedKeys);
		for (Integer i: a.keySet()) {
			System.out.println("Key is " + i + " and value is " + a.get(i));
		}
	}
	
	public static void question3() {
		List<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);
		int avg = 0, sum = 0;
		
		for (Integer i: a) {
			sum += i;
		}
		avg = sum/a.size();
		System.out.println(avg);
		
	}
	
	public static void question4() {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0,100);
		a.add(1,200);
		a.add(2,300);
		for (Integer i: a) {
			System.out.println(i);
		}
	}
	
	public static void question5() {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0,100);
		a.add(1,200);
		a.add(2,300);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
	}
	
	public static void question6() {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(0,100);
		a.add(1,200);
		a.add(2,300);
		ArrayList<Integer> a1 = new ArrayList<Integer>(a);
		System.out.println(a);
		System.out.println(a1);
	}
	
	public static void question7() {
		HashSet<Integer> a = new HashSet<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(300);
		Object[] a1 = a.toArray();
		System.out.println(a);
		System.out.println(a1);
	}
	
	public static void question8() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0,100);
		a.add(1,200);
		a.add(2,300);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}
	
	public static void question9() {
		ArrayList<Person> a = new ArrayList<Person>();
		a.add(new Person("James", 23, 1.76));
		a.add(new Person("Mark", 28, 1.73));
		a.add(new Person("Bill", 25, 1.90));
		System.out.println("Not Sorted:");
		for (Person p: a) {
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getHeight());
		}
		System.out.println("Sorted by Age:");
		Collections.sort(a);
		for (Person p: a) {
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getHeight());
		}
		
//		Comparing by height using Comparator
		HeightCompare h = new HeightCompare();		
		System.out.println("Sorted by Height:");
		Collections.sort(a, h);
		for (Person p: a) {
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getHeight());
		}
	}
	
	public static void question10() {
		StringBuilder str = new StringBuilder();
		str.append("Anothony Davis");
		System.out.println(str);
		StringBuffer str1 = new StringBuffer();
		str1.append("Anothony Davis1");
		System.out.println(str1);
	}
	
	public static void question15() {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(0,100);
		a.add(1,200);
		a.add(2,300);
		System.out.println(a);
		a.addFirst(1);
		a.addLast(9);
		System.out.println(a);
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
	}
	
	public static String question18() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		
		String str = s.nextLine();
		StringBuilder newStr = new StringBuilder();
		HashMap<Character, Integer> a = new HashMap<Character, Integer>();
		
		for (int i=0; i < str.length(); i++) {
			if (a.containsKey(str.charAt(i))) {
				a.replace(str.charAt(i), a.get(str.charAt(i)), a.get(str.charAt(i)) + 1);
			}
			else {
				a.put(str.charAt(i), 1);
			}
		}
	
		Set<Character> keys = a.keySet();
		
		List<Character> sortedList = new ArrayList<>(keys);
		Collections.sort(sortedList);
		
		System.out.println(sortedList);
		
		for (Character c: sortedList) {
			newStr.append(Character.toString(c) + Integer.toString(a.get(c)));
		}
		System.out.println(newStr);
		
		if (newStr.length() > str.length()) 
			return newStr.toString();
		return str;
	}
	
	public static void question19() {
		Scanner s = new Scanner(System.in);
		System.out.println("Java: ");
		int str1 = Integer.parseInt(s.nextLine());
		System.out.println("cpp: ");
		int str2 = Integer.parseInt(s.nextLine());
		System.out.println("python: ");
		int str3 = Integer.parseInt(s.nextLine());
		String r1 = String.format("%03d", str1);
		String r2 = String.format("%03d", str2);
		String r3 = String.format("%03d", str3);
		System.out.println("Java" + "       " + r1);
		System.out.println("cpp" + "        " + r2);
		System.out.println("python" + "     " + r3);
		
		
	}
	
	public static void question20() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Roman Integer");
		String str = s.nextLine();
		HashMap<Character, Integer> a = new HashMap<Character, Integer>();
		a.put('I', 1);
		a.put('V', 5);
		a.put('X', 10);
		a.put('L', 50);
		a.put('C', 100);
		a.put('D', 500);
		a.put('M', 1000);
		int i = 0;
		int reqNum = 0;
		while (i < str.length()) {
			if ( (i<str.length() -1) && a.get(str.charAt(i)) < a.get(str.charAt(i + 1)) ) {
				reqNum = reqNum - a.get(str.charAt(i)) + a.get(str.charAt(i+1));
				i = i + 2;
			}
			else {
				reqNum = reqNum + a.get(str.charAt(i));
				i += 1;
			}
		}
		System.out.println(reqNum);
		
	}

}
