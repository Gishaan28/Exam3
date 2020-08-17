import java.util.*; 
 public class Employee implements Comparable<Employee>{
    String name;
    int age, salary;
    Date joiningDate;
    public Employee(String name, int age, int salary, Date joiningDate) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.joiningDate = joiningDate;
   
    }
//    public String toString() {
//           return this.EmpID + " " + this.name + " " + this.address;
//          }
//    }
    @Override
 	public int compareTo(Employee o) {
 		return this.age - o.age;
 	}
    
   class ageCompare implements Comparator<Employee> {
         public int compare(Employee a, Employee b){
              return a.age - b.age;
         }
   }
   class salaryCompare implements Comparator<Employee> {
       public int compare(Employee a, Employee b){
            return a.salary - b.salary;
       }
 }
   class nameCompare implements Comparator<Employee> {
       public int compare(Employee a, Employee b){
            return a.name.compareTo(b.name);
       }
 }
   class dateCompare implements Comparator<Employee> {
       public int compare(Employee a, Employee b){
            return a.joiningDate.compareTo(b.joiningDate);
       }
 }
 
 
   
   
}