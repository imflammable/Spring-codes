package day4;

public class Persontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person("john","snow",29);
		System.out.println(p1.toString());
		person p2=p1;
		//person p2=new person("john","stark",30);
		System.out.println(p1.equals(p2));
	}

}
class person{
	String fname;
	String lname;
	int age;
	public person(String fname,String lname,int age) {
		this.age=age;
		this.fname=fname;
		this.lname=lname;
	}
	@Override
	public String toString() {
		return fname+" "+lname+" "+age;
		
	}
	public boolean equals(Object obj) {
		person that=(person)obj;
		if(this.fname.equals(that.fname))
			return true;
		return false;
	}
}

