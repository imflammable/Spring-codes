package day4;

public class Singletontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj=Singleton.getobj();
		System.out.println(obj.hashCode());
		Singleton obj1=Singleton.getobj();
		System.out.println(obj1.hashCode());
	}

}
class Singleton{
	static Singleton obj=null;
	private Singleton() {
		
	}
	public static Singleton getobj() {
		
		if(obj==null)
			obj=new Singleton();
		return obj;
	}
}
