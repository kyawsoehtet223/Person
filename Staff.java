package OOPTest;

public class Staff extends Person {
	String school; 
	double pay;
	public Staff(String name,String address,String school,double pay) {
		super(name,address);
		this.school=school;
		this.pay=pay;
		
		
	}
	public String Staffinfo() {
		return "Name : "+name+" Address : "+" Schoool : "+school+" pay : "+pay;
		

}
	public static void main(String[] arg) {
		Staff s=new Staff("John","Monywa,","S1",100000.0);
		System.out.println(s.Staffinfo());
		
	}
}