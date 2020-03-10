package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain 
{
	static Student data[]=new Student[4];
	static
	{
		for(int i=0;i<data.length;i++)
		{
			data[i]=new Student();
		}
		data[0]=new Student("Sachin",new int[] {60,70,90});
		data[1]=new Student(null,new int[] {18,24,33});
		data[2]=null;
		data[3]=new Student("Madhav",null);
	}
	public static void main(String[] args)
	{
		StudentReport studentReport=new StudentReport();
		StudentService studentService=new StudentService();
		System.out.print("Grade calculations:");
		String x=null;

		for (int i = 0; i < data.length; i++)  {
			try {
				x = studentReport.validate(data[i]);
				System.out.println("GRADE = " + x);
			} catch (NullNameException e) {
				x = "NullNameException occured";
			} catch (NullMarksArrayException e) {
				x = "NullMarksArrayException occured";
			} catch (NullStudentException e) {
				x = "NullStudentException occured";
			}
			
			
		}
		
		System.out.println("Number of Objects with Marks array as null = " +
								studentService.findNumberOfMarks(data));
		System.out.println("Number of Objects with Name as null = " +
								studentService.findNumberOfNullNames(data));
		System.out.println("Number of Objects that are entierly null = " +
								studentService.findNumberOfNullObjects(data));
		
	}

}
