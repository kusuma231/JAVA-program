package kusuma;

public class salary
{
double finalsalary;
public void increment()
{
	double salary=500000.0;
	double bonusPercentage=10.0;
	finalsalary= salary+(salary*bonusPercentage/100);
}
public static void main(String[] args)
{
	salary salary=new salary();
	salary.increment();
	System.out.println("salary increment amout: "+salary.finalsalary);
}
}
/*output
salary increment amout: 550000.0
*/
