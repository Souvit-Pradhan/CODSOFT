import java.util.Scanner;
public class Student_grade_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Subjects: ");
        int n=sc.nextInt();
        int[] marks=new int[n];
        int totalMarks=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter marks obtained in each subjects "+(i+1)+": ");
            marks[i]=sc.nextInt();
            totalMarks+=marks[i];
        }
        double averagePercentage=(double)totalMarks/(n*100)*100;
        System.out.println("Your Result is Here:");
        System.out.println("Your Total Marks: "+totalMarks);
        System.out.println("Average Percentage: "+averagePercentage+"%");
        String grade=calculateGrade(averagePercentage);
        System.out.println("Grade: "+grade);
    }
    public static String calculateGrade(double percentage){
        if (percentage>=90)
        {
            return "O";
        }
        else if (percentage>=80)
        {
            return "A";
        }
        else if (percentage>=70)
        {
            return "B";
        }
        else if (percentage>=60)
        {
            return "C";
        }
        else if (percentage>=50) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
