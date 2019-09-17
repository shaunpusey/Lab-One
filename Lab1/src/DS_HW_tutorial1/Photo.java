package DS_HW_tutorial1;//Shaun Pusey 1503329

public class Photo 
{
	private int width;
	private int length;
	
	///Default
	public Photo() 
	{
		width = 0;
		length = 0;
	}
	
	//primary
	public Photo(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	
	//copy constructor
	public Photo(Photo obj)
	{
		super();
		width = obj.width;
		length = obj.length;
	}
	//getter and setters
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public String toString() 
	{
		return "Photo [Width=" + width + ", Legth=" + length+ "]";
	}
	
	
	
	
	
	

}
