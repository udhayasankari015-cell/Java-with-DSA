class A{
	public static void main(String[] args){
		two a=new two();
		a.display();
	}
}
abstract class one{
	abstract void display();
}
class two extends one{
	void display(){
		System.out.println("numbers are infinity");
	}
}