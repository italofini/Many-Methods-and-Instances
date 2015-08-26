import java.util.Scanner;

public class Lime {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Grape GrapeObject = new Grape();
		System.out.println("Enter name of first gf");
		String temp = input.nextLine();
		GrapeObject.setName(temp);
		GrapeObject.saying();
	}

}
