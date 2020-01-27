package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport 
{
  public String findGrade(Student studentobj)
  {
	  int marks[]=studentobj.getmarks();
	  int marksum=0;
	  for(int i=0;i<marks.length;i++)
	  {
		   if(marks[i]<35)
		  {
			 
			  return("F");
		  }
		  else
		  {
		    marksum+=marks[i];
		  }
	  }
		    if(marksum<=150)
		    {
		    return("D");
		    }
		  else if(marksum>150 && marksum<=200)
		  {
		  return("C");
		  }
		  else if(marksum>200 && marksum<=250)
		  {
			  return("B");
		  }
		  else 
		  {
			  return("A");
		  }
  }
		  
         public String validate(Student studentobj) throws NullStudentException,NullNameException,NullMarksArrayException
	     {
        	 if(studentobj==null)
        	 {
        		 throw new NullStudentException();
        	 }
        	 else {
     			if (studentobj.getname() == null) throw new NullNameException();
     			if (studentobj.getmarks() == null) throw new NullMarksArrayException();
     			
     			return findGrade(studentobj);
	     }
}
}

