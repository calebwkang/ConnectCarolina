package main;

public interface Student {
	public enum Rank {FRESHMAN, SOPHOMORE, JUNIOR, SENIOR};
	
	int getPID();
	String getMajor();
	double getGPA();
	
	
}
