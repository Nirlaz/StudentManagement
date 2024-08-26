package Information;

import java.io.*;

import manage.StudentDoa;
public class Information {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true) {
				System.out.println("=================================");
				System.out.println("Enter 1 to Insert data: ");
				System.out.println("Enter 2 to Delete data: ");
				System.out.println("Enter 3 to Show data: ");
				System.out.println("Enter 4 to Update data: ");
				System.out.println("Enter 5 to Exit: ");
				System.out.println("=================================");
				String selectNumber = br.readLine();
				switch(selectNumber) {
				case "1":
					Insert();
					break;
				case "2":
					Delete();
					break;
				case "3":
					Show();
					break;
				case "4":
					Update();
					break;
				case "5":
					System.out.println("Exit!!");
					return;
				default:
					break;
				
			}
		}
			
		}catch(Exception e) {
			e.getMessage();
		}}
	
		public static void Insert() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the Student Name: ");
				String sName = br.readLine();
				System.out.println("Enter the Teacher Name: ");
				String tName = br.readLine();
				boolean check = StudentDoa.Insert(sName,tName);
				String message = check ? "Insert successful!" : "Insert unsuccessful!" ;
				System.out.println("=================================");
				System.out.println(message);
			}catch(Exception e) {
				e.getMessage();
			}
			
		}
		public static void Delete() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the id: ");
				String sId = br.readLine();
				boolean check = StudentDoa.Delete(sId);
				String message = check ? "Delete successful!" : "Delete unsuccessful!" ;
				System.out.println("=================================");
				System.out.println(message);
			}catch(Exception e) {
				e.getMessage();
			}
			
		}
		public static void Update() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter the Student id which data need to be updated: ");
				String sid = br.readLine();
				System.out.println("Enter the Student Name: ");
				String sName = br.readLine();
				System.out.println("Enter the Teacher Name: ");
				String tName = br.readLine();
				boolean check = StudentDoa.Update(sName,tName,sid);
				String message =check?"Update successful!":"Update unsuccessful!";
				System.out.println("=================================");
				System.out.println(message);
			}catch(Exception e) {
				e.getMessage();
			}
			
		}
		public static void Show() {
			try {
				
				boolean check = StudentDoa.Show();
				String message =check?"Show successful!":"Show unsuccessful!";
				System.out.println("=================================");
				System.out.println(message);
			}catch(Exception e) {
				e.getMessage();
			}}}
		


