import java.util.*;
class Main{
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		double radius = sc.nextInt();
		double height = sc.nextInt();
		double volume = 22/7 * radius* radius*height;
		System.out.print(volume);

		
	} 
}