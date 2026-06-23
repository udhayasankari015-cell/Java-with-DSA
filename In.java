class In{
	public static void main(String[] args){
		Father a=new Father();
		Son b=new Son();
		a.display();
		b.display();
		System.out.println(a.gender);
		System.out.println(b.gender);
	}
}
class Father{
	char gender='m';
	void display(){
		System.out.println("I have a house");
	}
}
class Son extends Father{
	char gender='f';
	void display(){
		System.out.println("I have a house and car");
	}
}
                                                              