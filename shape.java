abstract class Shape
{
	protected double dim_one;
	protected double dim_two;
	protected double dim_three;
	protected int dim_sides;

	//zero parameters
	public Shape()
	{
		dim_one=dim_two=dim_three=0;
		dim_sides=0;
	}
	public Shape(double dim_one,double dim_two,double dim_three,int dim_sides)
	{
		this.dim_one=dim_one;
		this.dim_two=dim_two;
		this.dim_three=dim_three;
		this.dim_sides=dim_sides;
	}
	abstract public double calculate area(); //abstract methods
	abstract public double parameter(); //abstract methods

	public void getnumsides()
	{
		return num_sides; 
	}
	
