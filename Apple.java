class Apple{
	public static void main(String[] args){
		dog d=new dog();
		cat c=new cat();
		d.display();
		c.display();
	}
}
abstract class A{
	abstract void display();
}
class cat extends A{
	void display(){
		System.out.println("This is the Cat");
	}
}
class dog extends A{
	void display(){
		System.out.println("this is the dog");
	}
}