package restaurant1stSep2022Lab;

public class Restaurant2nd {
float price;
String f_name;
public Restaurant2nd(String f_name, float price) {
	super();
	this.price = price;
	this.f_name = f_name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
	
}
public void display()
{
	System.out.println(getF_name()+" "+getPrice());
}

}

	