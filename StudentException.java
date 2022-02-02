public class  StudentException extends Exception  {
	public StudentException() {
		System.out.println("User defined Exception thrown");
	}
	public String toString() {
		return "MyException Object : Id must be between 0 and 100 " ;
	}
}