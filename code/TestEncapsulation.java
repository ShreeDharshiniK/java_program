// Abstract class to provide abstraction
abstract class Person {
	public abstract void displayInfo();
}
 
// Student class implementing encapsulation
class Student extends Person {
	// Private data members - encapsulation
private int rollno;
private String name = "";
private int age;
int getAge() {
return age;
}
void setAge(int age) {
this.age = age;
}

void setName(String name) {
this.name = name;
}
String getName() {
return name;
}
int getRollno() {
return rollno;
}
void setRollno(int rollno) {
this.rollno = rollno;
}
// Implement abstract method - abstraction
	@Override
	public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Age: " + age);
	}
}
class TestEncapsulation{
public static void main(String args[]) {
Student s = new Student();
s.setName("Reena");
s.setRollno(1);
s.setAge(25);
//printing using display method
s.displayInfo();
 
Student s1 = new Student();
s.setName("Rathi");
s.setRollno(2);

s.setAge(24);
//printing using getter
System.out.println("Student info:");
System.out.println(s.getRollno() + " " + s.getName() + " " + s.getAge());
 
}
}
/*
Student Information:
Name: Reena
Roll Number: 1
Age: 25
Student info:
2 Rathi 24
*/