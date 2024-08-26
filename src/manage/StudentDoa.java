package manage;

import java.sql.*;


public class StudentDoa {

	
	//Use for Inserting Data
	public static boolean Insert(String sName,String tName) {
		boolean f=false;
		try {
			Connection con = Connectionn.connector();
			String query = "Insert into subjects(Sname,Tname) values(?,?)";
			PreparedStatement pstmt= con.prepareStatement(query);
			pstmt.setString(1, sName);
			pstmt.setString(2,tName);
			pstmt.execute();
			f=true;
		}catch(Exception e) {
			e.getMessage();
		}
		return f;
		
	//Use for Delete Data
	}
	public static boolean Delete(String sId) {
		boolean f=false;
		try {
			Connection con = Connectionn.connector();
			String query ="DELETE FROM subjects WHERE subjectid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1,Integer.valueOf(sId));
			pstmt.execute();
			f=true;
		}catch(Exception e) {
			e.getMessage();
		}
		return f;
		
	}
	
	//Use for Update Data
	public static boolean Update(String sname,String tname,String sid) {
		boolean f=false;
		try {
			Connection con = Connectionn.connector();
			String query = "UPDATE subjects SET Sname = ?, Tname = ? WHERE subjectid = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, sname);
			pstmt.setString(2, tname);
			pstmt.setInt(3, Integer.valueOf(sid));
			pstmt.execute();
			f=true;
		}catch(Exception e) {
			e.getMessage();
		}
		return f;
	}
	
	//User for Show Database
	public static boolean Show(){
		boolean f=false;
		try {
			Connection con = Connectionn.connector();
			String query = "select * from subjects";
			Statement stmt = con.createStatement();
			ResultSet rstmt = stmt.executeQuery(query);
			
			while(rstmt.next()) {
				int id = rstmt.getInt(1);
				String sname = rstmt.getString(2);
				String tname = rstmt.getString(3);
				System.out.println(id+"\t\t"+sname+"\t\t"+tname);
			}
			f=true;
		}catch(Exception e) {
			e.getMessage(); 
		}
		return f;
	}
	


}
