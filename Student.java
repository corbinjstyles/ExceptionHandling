import java.util.Scanner;

public class Student {
	static int flag=0;
	public static void main(String args[]) {
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name:");
			String s = sc.nextLine();
			System.out.println("Enter id:");
			int id= sc.nextInt();
			sc.close();
			if(id > 100)
				throw new MyException();
			if(id < 0)
				throw new MyException();
		}
		catch(NumberFormatException e) {
			System.out.println("Exception : "+ e);
		}
		catch (MyException e) {
			System.out.println("Exception : "+ e);
		} finally {
			
			System.out.println("Done");
		}
		
	}
}
