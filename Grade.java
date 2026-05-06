package Day3;

public class Grade {
	public static void main(String[] args) {
		char grade='B';
		switch(grade)
		{
		case 'A':System.out.println("Excellent");
		break;
		case 'B':System.out.println("Good");
		break;
		case 'C':System.out.println("Bad");
		break;
		default:System.out.println("Invalid Grade");
		}
	}
}
