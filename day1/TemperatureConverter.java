package kusuma;

public class TemperatureConverter 
{
	double Celsius= 20.0;
	double fahrenheit = (Celsius *9.0/5.0)+32;
	public void converter()
	{
	System.out.print("enter temperature  in Celsius: "+Celsius);
	System.out.println("Temperature in Fahrenheit:"+fahrenheit);
	}
	public static void main(String[] args)
	{
		TemperatureConverter temperatureconverter=new TemperatureConverter();
		temperatureconverter.converter();
	}
}
