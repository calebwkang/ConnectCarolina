package main;

public interface Student {
	public enum Year {FRESHMAN, SOPHOMORE, JUNIOR, SENIOR};
	
	int getPID();
	String getMajor();
	double getGPA();
	Year getYear();
	
	
}
