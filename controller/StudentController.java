package controller;

import java.util.ArrayList;

import assignment.StudentDTO;

public class StudentController {
	//selectAll(), select(id), insert(StudentDTO),
	//update(StudentDTO), delete(StudentDTO)
	ArrayList<StudentDTO> list;
	
	public StudentController() {
		list = new ArrayList<StudentDTO>();
		
		StudentDTO s = new StudentDTO();
		s.setId(0);
		s.setName("이름1");
		s.setMajor("화학공학");
		s.setKor(90);
		s.setEng(70);
		s.setMath(80);
		
		StudentDTO s2 = new StudentDTO();
		s2.setId(1);
		s2.setName("이름2");
		s2.setMajor("전자공학");
		s2.setKor(70);
		s2.setEng(90);
		s2.setMath(60);
		
		StudentDTO s3 = new StudentDTO();
		s3.setId(3);
		s3.setName("이름3");
		s3.setMajor("기계공학");
		s3.setKor(90);
		s3.setEng(50);
		s3.setMath(90);
		
		list.add(s);
		list.add(s2);
		list.add(s3);
		
	}
	
	
	
	public ArrayList<StudentDTO> selectAll(){
		return list;
	}
	
	public StudentDTO select(int index) {
		return list.get(index);
	}
	
	public void insert(StudentDTO studentDTO) {
		int lastId = list.get(list.size()-1).getId()+1;
		studentDTO.setId(lastId);
		
		list.add(studentDTO);
	}
	
	public void update(StudentDTO studentDTO) {
		int index = list.indexOf(studentDTO);
		list.remove(index);
		list.add(index, studentDTO);
	}
	
	public void delete(StudentDTO studentDTO) {
		list.remove(studentDTO);
	}
}
