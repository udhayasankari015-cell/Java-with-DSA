class Poly{
	public static void main(String[] args){
		Com a=new Com();
		System.out.println(a.add(3,6));
		System.out.println(a.add(28,32));
	}
}
class Com{
	int add(int a,int b){
		return a+b;
	}
	int add(int a,int b,int c){
		return a+b+c;
	}
}