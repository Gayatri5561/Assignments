
class Test
{
	public static void main(String[] args)
	{
		Triangle t=new Triangle();
		t.base=3;
		t.height=11;
		System.out.println(t.area());
		
	}
}
class Triangle
{
	double base,height;
	public double area()
	{
		return 0.5*base*height;
	}
}		