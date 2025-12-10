package kusuma;

public class MarksPercentage {
	public void mark()
	{
		int sub1=78, sub2=47, sub3=97, sub4=67, sub5=98;
		int total=sub1+sub2+sub3+sub4+sub5;
		System.out.println(total);
		float parcentage=total/500f*100;
		//double parcentage=total/500.0*100;
		System.out.println( parcentage);
	}
	public static void main(String[] args)
	{
		MarksPercentage markspercentage=new MarksPercentage();
		markspercentage.mark();
}
}