package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.excepation.EmployeeNotFoundException;
import com.nt.modle.Student;
@Service
public class StudentSerive  implements IStudentService{

	@Override
	public Student getStrudentDetaL(int sid) {
		 if(false) {
			 System.out.println("StudentSerive.getStrudentDetaL()");
		 return new Student();
		 }
		 else 
		 throw new EmployeeNotFoundException("proble in getting emloyee");
	}

}

