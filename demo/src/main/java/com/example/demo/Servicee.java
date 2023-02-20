package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
@Service
public class Servicee {
	private static Map<Long,StdentModel>students=new HashMap<Long, StdentModel>();

	private static Long index=0L;

	public static List<StdentModel>getAllStudents(){

	return new ArrayList<StdentModel>(students.values());

	}

	public static StdentModel getStudentDetail(Long StudentId){

	return students.get(StudentId);

	}

	public static StdentModel addStudent(StdentModel student){

	index +=1;

	student.setId(index);

	students.put(index,student);

	return student;

	}

	public static StdentModel updatestudent(Long studentid, StdentModel student){

	student.setId(studentid);

	students.put(studentid,student);

	return student;

	}

	public static StdentModel deleteStudent(Long studentid){

	return students.remove(studentid);

	}

}
