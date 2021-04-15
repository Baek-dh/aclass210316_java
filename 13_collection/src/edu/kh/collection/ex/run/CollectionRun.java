package edu.kh.collection.ex.run;

import edu.kh.collection.ex.model.service.ListService;
import edu.kh.collection.ex.model.service.SetService;
import edu.kh.collection.ex.model.service.StudentManagementService;

public class CollectionRun {
	public static void main(String[] args) {
		ListService lService = new ListService();
//		lService.example1();
//		lService.example2();
		
		
		StudentManagementService stdService = new StudentManagementService();
//		stdService.displayMenu();
		
		SetService sService = new SetService();
		//sService.example1();
		sService.lotto1();
		
		
		
		
	}
}
