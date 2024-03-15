import java.util.Scanner;

public class StudentGradeCalculator
{
	public static void main(String[] args)
	{
		System.out.println("\n***** STUDENT GRADE CALCULATOR *****\n") ;

		Scanner scan = new Scanner(System.in) ;
		int total = 0 ;
		int avg ;
		String Grade ;

		System.out.println("Enter the number of subjects: ") ;
		int num_sub = scan.nextInt() ;
	
		for (int i = 1 ; i <= num_sub ; i++)
		{
			System.out.println("Enter the mark of subject " + i + " : ") ;
			int mark = scan.nextInt() ;
			total = total + mark ;
		}

		avg = total / num_sub ;

		if ((avg >= 91) && (avg <= 100))
		{
			Grade = "O" ;
		}
		else if ((avg >= 81) && (avg <= 90))
		{
			Grade = "A+" ;
		}
		else if ((avg >= 71) && (avg <= 80))
		{
			Grade = "A" ;
		}
		else if ((avg >= 61) && (avg <= 70))
		{
			Grade = "B+" ;
		}
		else if ((avg >= 51) && (avg <= 60))
		{
			Grade = "B" ;
		}
		else if ((avg >= 41) && (avg <= 50))
		{
			Grade = "C" ;
		}
		else
		{
			Grade = "RA" ;
		}
		
		System.out.println("\n***** RESULT *****") ;
		System.out.println("Total marks obtained: " + total) ;
		System.out.println("Average percentage obtained: " + avg + "%") ;
		System.out.println("Grade obtained: " + Grade) ;

	}
}