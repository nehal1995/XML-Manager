package com.xml_manager.controller;

public class XMLController {
	
	
	public void invoker(int task, int xmlFileCount, int noOfChanges){
		//Task 0 is for create
		if(task == 0){
			if(xmlFileCount==1 && noOfChanges==1){
				System.out.println("Task: Create. Function: Single XML file, Single Change");
			}else if(xmlFileCount>1 && noOfChanges==1){
				System.out.println("Task: Create. Function: Multiple XML file, Single Change");
			}else if(xmlFileCount==1 && noOfChanges>1){
				System.out.println("Task: Create. Function: Single XML file, Multiple Change");
			}else if(xmlFileCount>1 && noOfChanges>1){
				System.out.println("Task: Create. Function: Multiple XML file, Multiple Change");
			}else{
				System.out.println("Invalid no of XML Files or No of changes.");
			}
		}else if(task == 1){	//task 1 is for update
			if(xmlFileCount==1 && noOfChanges==1){
				System.out.println("Task: Update. Function: Single XML file, Single Change");
			}else if(xmlFileCount>1 && noOfChanges==1){
				System.out.println("Task: Update. Function: Multiple XML file, Single Change");
			}else if(xmlFileCount==1 && noOfChanges>1){
				System.out.println("Task: Update. Function: Single XML file, Multiple Change");
			}else if(xmlFileCount>1 && noOfChanges>1){
				System.out.println("Task: Update. Function: Multiple XML file, Multiple Change");
			}else{
				System.out.println("Invalid no of XML Files or No of changes.");
			}
		}else if(task == 2){	//task 2 is for delete
			if(xmlFileCount==1 && noOfChanges==1){
				System.out.println("Task: Delete. Function: Single XML file, Single Change");
			}else if(xmlFileCount>1 && noOfChanges==1){
				System.out.println("Task: Delete. Function: Multiple XML file, Single Change");
			}else if(xmlFileCount==1 && noOfChanges>1){
				System.out.println("Task: Delete. Function: Single XML file, Multiple Change");
			}else if(xmlFileCount>1 && noOfChanges>1){
				System.out.println("Task: Delete. Function: Multiple XML file, Multiple Change");
			}else{
				System.out.println("Invalid no of XML Files or No of changes.");
			}
		}else{
			System.out.println("Task selected is invalid");
		}
	}
	

}
