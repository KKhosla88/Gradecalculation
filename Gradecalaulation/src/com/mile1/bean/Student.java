package com.mile1.bean;

public class Student 
{ 
	String name;
	int marks[];
 public Student(){}
 public Student(String name,int marks[])
 {
	 this.name=name;
	 this.marks=marks;
 }
 public String getname()
 {
	 return name;
 }
 public void setname(String name)
 {
	 this.name=name;
 }
 public void setmarks(int marks[])
 {
	 this.marks=marks;
 }
 public int[] getmarks()
 {
	 //this.marks=marks;
	 return marks;
 }

}
