package com.jieun.io4.emp;

import java.util.Calendar;
import java.util.Date;

public class EmpDTO {
private int empNumber;
private String id;
private String depart;
private String position;
private int salary;
private int insentive;
private Date date;

public int getEmpNumber() {
	return empNumber;
}
public void setEmpNumber(int empNumber) {
	this.empNumber = empNumber;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDepart() {
	return depart;
}
public void setDepart(String depart) {
	this.depart = depart;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getInsentive() {
	return insentive;
}
public void setInsentive(int insentive) {
	this.insentive = insentive;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}


}
