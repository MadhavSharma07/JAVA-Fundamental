import java.util.*;
class Main{
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		double SI = (principal*rate*time)/100;
		System.out.print(SI);
	} 
}