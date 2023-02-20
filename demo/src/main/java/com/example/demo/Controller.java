package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")

	public String boddu() {

	return "mani ";

	}

	@GetMapping("/student")

	public List<StdentModel>getAllStudents(){

	return Servicee.getAllStudents();

	}

	@PostMapping("/addemployee")

	public StdentModel addStudent(@RequestBody StdentModel student){

	return Servicee.addStudent(student);

	}

	@PutMapping("/updateemp/{stuid}")

	public StdentModel updatestudent(@PathVariable Long stuid, @RequestBody StdentModel student){

	return Servicee.updatestudent(stuid,student);

	}

	@DeleteMapping("/deleteemployee/{stuid}")

	public StdentModel deleteStudent(@PathVariable Long stuid){

	return Servicee.deleteStudent(stuid);

	}

	@GetMapping("/stud/{stuid}")

	public StdentModel getStudentDetail(@PathVariable Long stuid) {

	return Servicee.getStudentDetail(stuid);

	}
}
