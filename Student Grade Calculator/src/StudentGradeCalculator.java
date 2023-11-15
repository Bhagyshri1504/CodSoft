import java.util.Scanner;

public class StudentGradeCalculator 
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		Float totalMarks=0.0F,avgPercentage=0.0f;
		System.out.println("Enter subject marks out of 100");
		System.out.println("Enter The Marks of Data Structure and Algorithm :");
		Float dsaMarks=scanner.nextFloat();
		System.out.println("Enter The Marks of Object Oriented Programming :");
		Float oopMarks=scanner.nextFloat();
		System.out.println("Enter The Marks of Database Management System :");
		Float dbmsMarks=scanner.nextFloat();
		System.out.println("Enter The Marks of Operating System :");
		Float osMarks=scanner.nextFloat();
		System.out.println("Enter The Marks of Software Engineering :");
		Float senMarks=scanner.nextFloat();
		
		totalMarks=dsaMarks+oopMarks+dbmsMarks+osMarks+senMarks;
		System.out.println("Your total Marks is: "+totalMarks+"/ 100");
		avgPercentage=totalMarks/5;
		System.out.println("Your Percentage is: "+avgPercentage);
		if(avgPercentage>80)
		{
			System.out.println("Your Grade is: "+"A");
		}
		else if(avgPercentage>60)
		{
			System.out.println("Your Grade is: "+"B");
		}
		else if(avgPercentage>50)
		{
			System.out.println("Your Grade is: "+"C");
		}
		else if(avgPercentage>40)
		{
			System.out.println("Your Grade is: "+"D");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
