package VirtualKeyRepo;

import java.io.IOException;
import java.util.Scanner;
//import java.util.logging.FileHandler;

public class main implements SameVales {
	//welcome method 
	public static void DisplayWel() {
		System.out.println("WELCOME TO ,LockerMe.com");
		
	System.out.println("Developer Name : SANJEEV SAGAR");
	}
	
	//MAIN 
	
	public static void main(String[] args) {
		int option;
		String FileName;
		Scanner sc = new Scanner(System.in);
		FileHandling  file = new FileHandling();
		
		DisplayWel();
		System.out.println('\n');
		
		while(true) {
			System.out.println("Option are : \n1 Show available files \n2. Add File \n3. Delete File \n4.Serach File \n5.End App");
			option =sc.nextInt();
			switch(option) {
			case 1 :
				System.out.println("Availabe files are : ");
				file.displayFiles();
				break;
			case 2 :
				System.out.println("Enter file Name : ");
				FileName = sc.next().toLowerCase();
				try {
					file.createFile(FileName);
					System.out.println("File Create....");
				}
				catch(IOException e) {
					System.out.println("Failed to Create");
					e.printStackTrace();
					
				}
				break;
			case 3:
				System.out.println("Enter file to delete ");
				FileName= sc.next().toLowerCase();
				try {
					if(file.deleteFile(FileName,"check")) {
						System.out.println("Confirm Delete : yes  ");
						String choice = sc.next().toLowerCase();
						if(choice.equals("yes")) {
							System.out.println("FIle Delete sucess ");
						file.deleteFile(FileName, "delete");
						}
						else 
							System.out.println("File deletion failed");
					}
				}
					
						catch(IOException e) {
							e.printStackTrace();
						}
						break;
			case 4: 
				System.out.println("Enter file to Search ");
				FileName= sc.next().toLowerCase();
				if(file.SearchFile(FileName)!=-1)
					System.out.println("found");
				else
					System.out.println("Not Found");
				break;
			case 5:
				System.out.println("LockerMe welcomes You");
				break;
				default:
					System.out.println("Invalid input");
				
						
							
		
						
					}
				}
						
			}
		
	}


