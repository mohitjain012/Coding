package Coding.Java.ColectionsPractice;

public class Customer {
	public int age;
	public String name;
	public int customerId;
	
	public Customer(int age, String name, int id){
		this.age=age;this.name=name;customerId=id;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
