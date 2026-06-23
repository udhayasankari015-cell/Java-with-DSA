import java.util.*;
class encap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		add o=new add();
		o.setnumber(a,b);
		System.out.println(o.getnumber());
	}
}
class add{
	private int num1;
	private int num2;
	private int result;
	public void setnumber(int n1,int n2){
		num1=n1;
		num2=n2;
		result=num1+num2;
	}
	int getnumber(){
		return result;
	}
}
