package com.mile1.service;
import com.mile1.bean.Student;

public class StudentService 
{
	public int findNumberOfMarks(Student data[])
	{
		int nullMarksCount=0;
		for(int i=0;i<data.length;i++)
		{
			try {
			      data[i].getmarks();
			    }
		 catch (Exception e) {
			nullMarksCount++;
		}
	}
	
	return nullMarksCount;
}

public int findNumberOfNullNames (Student data[]) {
	int nullNamesCount = 0;
	
	for (int i = 0; i < data.length; i++) {
		try {
			    data[i].getname();
			} 
		catch (Exception e) 
		{
			nullNamesCount++;
		}
	}
	
	return nullNamesCount;
}

public int findNumberOfNullObjects (Student data[]) {
	int nullObjectsCount = 0;
	
	for (int i = 0; i < data.length; i++) {
		if (data[i] == null) nullObjectsCount++;;
	}
	
	return nullObjectsCount;
}
}
