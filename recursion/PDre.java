public class PDre{
	public static void main(String []args){
		PD(4);	//Bigger problem
	}
	public static void PD(int n){
		if(n == 0)
			return;
		System.out.println(n);	//self work
		PD(n - 1);	//Smaller problem
	}
}