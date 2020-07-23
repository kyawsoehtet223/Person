package OOPTest;
class Person{
	String name,address;
	public Person(String name,String address){
		this.name=name;
		this.address=address;
		}
		public String getname() {
			return name;
		}
		public String getaddress() {
			return address;
		}
		public String tostring() {
			String str="Name : "+name+" Address : "+address;
			return str;
		}
		
	}

public class Student extends Person {
        String program,year;
        double fee;
	public Student(String name,String address,String program,String year,double fee) {
		super(name ,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
public String Studentinfo() {
	return "Name : "+name+" Address : "+" Program : "+program+" Year : "+year+" Fee : "+fee;
}
public static void main(String[] arg) {
	Student s=new Student("Mg Mg","Monywa","CS","Final",2000);
	System.out.println(s.Studentinfo());
}
}
