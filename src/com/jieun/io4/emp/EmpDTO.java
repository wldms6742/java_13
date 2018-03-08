package com.jieun.io4.emp;

import java.util.Calendar;
import java.util.Date;

public class EmpDTO {
private String empNum;
private String id;
private int age;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
private String dept;
private String lev;
private int salary;
private int insen;
public String getEmpNum() {
	return empNum;
}
public void setEmpNum(String empNum) {
	this.empNum = empNum;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getLev() {
	return lev;
}
public void setLev(String lev) {
	this.lev = lev;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getInsen() {
	return insen;
}
public void setInsen(int insen) {
	this.insen = insen;
}


}
