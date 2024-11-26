package org.example;

import org.example.pojo.Student;
import org.example.pojo.enums.GENDER;
import org.example.service.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

//import static jdk.internal.org.jline.keymap.KeyMap.display;

public class Main {
    public static void main(String[] args) {
        //List<Student> students = StudentService.generateStudents(5);
//        Map< GENDER, List<Student>> studentByGender = new HashMap<>();
//        //display(studentByGender);
        //Map<GENDER, List<Student>> map = new HashMap<>();
        //for(Student student: students)
        //{

            //switch (student.getGender()){
               // case MALE :
				//	map.putIfAbsent(student.getGender(), new ArrayList<>());
				//	map.get(student.getGender()).add(student);
               ///     break;
               // case FEMALE : 
				//	map.putIfAbsent(student.getGender(), new ArrayList<>());
				//	map.get(student.getGender()).add(student);
                  //  break;
            //}
        

        //}
        //System.out.printf("List of Students %s", map.toString() );
		
		//Map<Integer, List<Student>> sortedByAge = new HashMap<>();
		
		//for(Student student: students){
			//int year = 2024-student.getAge();
		  //  sortedByAge.putIfAbsent(year, new ArrayList<>());
			//sortedByAge.get(year).add(student);
		//}
		//System.out.println(sortedByAge);
		
		//Map<String, List<Student>> group = new HashMap<>();
		
		//for(Student student: students){
		//	char[] name = student.getName().toCharArray();
		//	int j;
			//System.out.println(name[0]);
			//System.out.println(student.getName().charAt(0));
		//	for(int i=0; i<=name.length; i++){
		//		j = name[i];
		//		System.out.println(j);
				
		//		}
		//		if j%2 == 0{
		//			List even = new ArrayList();
		//			even.putIfAbsent();
		//	}
			
		
		//}
		char[] name = {'k','r','i','s','h'};
		int i;
		int temp=0, sum=0;
		for( i=0; i<=4; i++){
			 temp = (int) name[i];
			 sum= sum+temp;
			
		}
		 System.out.println(sum);
		
		
    }
	
}