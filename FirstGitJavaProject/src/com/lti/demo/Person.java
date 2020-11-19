package com.lti.demo;

public class Person {
private String pName;
private int pAge;
private double pSalary;
@Override
public String toString() {
	return "Person [pName=" + pName + ", pAge=" + pAge + ", pSalary=" + pSalary + "]";
}
public Person(String pName, int pAge, double pSalary) {
	super();
	this.pName = pName;
	this.pAge = pAge;
	this.pSalary = pSalary;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getpAge() {
	return pAge;
}
public void setpAge(int pAge) {
	this.pAge = pAge;
}
public double getpSalary() {
	return pSalary;
}
public void setpSalary(double pSalary) {
	this.pSalary = pSalary;
}

}
