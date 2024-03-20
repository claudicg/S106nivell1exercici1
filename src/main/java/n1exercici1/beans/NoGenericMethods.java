package n1exercici1.beans;

public class NoGenericMethods {

	private String name;
	private String surname;
	private String city;
	
	
	public NoGenericMethods(String name, String surname, String city) {
		super();
		this.name = name;
		this.surname = surname;
		this.city = city;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "NoGenericMethods [name=" + name + ", surname=" + surname + ", city=" + city + "]";
	}
	
	
	
	
}
