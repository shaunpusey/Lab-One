package DS_HW_tutorial1;//Shaun Pusey 1503329


public class House 
{
	protected int ID;
	protected float price;
	protected String location;
	protected String advertiser;
	protected Photo image;
	
	
	//Default
	public House()
	{
		super();
		ID = 0;
		price = 0;
		location = "";
		advertiser = "";
		image = new Photo();//calls the default constructor from photo
	}

	//primary
	public House(int ID, float price, String location, String advertiser, Photo image) {
		super();
		ID = this.ID;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;//calls the primary constructor from photo
	}
	

	//copy
	public House(House obj)
	{
		ID = obj.ID;
		price = obj.price;
		location = obj.location;
		advertiser = obj.advertiser;
		image = new Photo(obj.image);
	}
	
	//Getter and Setters

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Photo getImage() {
		return image;
	}

	public void setImage(Photo image) {
		this.image = image;
	}
	
	
	//to string
	@Override
	public String toString() {
		return "House [ID=" + ID + ", price=" + price + ", location=" + location + ", advertiser="
				+ advertiser + ", image=" + image + "]";
	}
	
	
	

	
	
	
	
}
