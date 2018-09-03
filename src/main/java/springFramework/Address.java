package springFramework;

public class Address {
String city;
String state;
int zipCode;

public Address() {
	
}

public Address(String city, String state, int zipCode) {
	super();
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public int getZipCode() {
	return zipCode;
}

public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}


}
