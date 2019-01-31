import java.util.*;
public class student
{
        String name;
    	int age;
    	int ml;
    	int m2;
    	int m3;
		int maximum;
		int average;
		public student(String Name,int Age,int M1,int M2,int M3)
		{
			name = Name;
			age = Age;
			ml = M1;
			m2 = M2;
			m3 = M3;
			maximum = 0;
			average = 0;
		}
		public void accept( )
		{
			name = "Avishek Mitra";
			age = 14;
			ml = 95;
			m2 = 80;
			m3= 78;
		}
		public void compute( )
		{
			average = ( ml + m2 + m3)/3;
			if (ml>m2 && ml>m3)
				maximum = ml;
			else if (m2>ml && m2 >m3)
				maximum = m2;
			else
				maximum = m3;
		}
		public void display()
		{
			System.out.println("Name of student is: " + name);
			System.out.println("Age is: " + age);
			System.out.println("Marks in 1st subject: " + ml);
			System.out.println("Marks in 2nd subject: " + m2);
			System.out.println("Marks 3rd subject: " + m3);
			System.out.println("Maximum marks: " + maximum);
			System.out.println("Average is: " + average);
		}
		public static void main(String args[ ])
		{
			student s = new student("Koneenika",7,82,66,91);
			System.out.println("Using Parameterised Constructor:-");
			s.compute( );
			s.display( );
			System.out.println("Using a method to accept:-");
			s.accept( );
			s.compute( );
			s.display( );
		}
}