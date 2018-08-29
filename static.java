class staticclass{
	static int i; 
	static {
		i =101;
		System.out.println("static block called ");
	} 
}
class Main {
public static void main(String args[]) {
	System.out.println(staticclass.i); 
}
}
