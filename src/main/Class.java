package main;

import java.util.Iterator;



public interface Class extends Iterable<Student>{
	
	public enum GenEd {CR, FL, QR, LF,PX, PL, HS, SS,
						BN, CI, EE, GI, NA, US, WB};
	String getDept();
	Student[] getRoster();
	int getLevel();
	String getDescription();
	GenEd[] getGenEds();
	
	default String getName() {
		return getDept() + " " + getLevel();
	}
	
	/*returns iterator of students with a gpa in between the
	 *specified upper and lower bounds*/
	default Iterator<Student> gradeIterator(double lower, double upper) {
		return new GradeIterator(lower, upper, this);
	}
	
	/*returns an iterator of students in the specified year
	 * in school*/
	default Iterator<Student> yearIterator(Student.Year year) {
		return new YearIterator(year, this);
	}
	
	
	/*returns an iterator of students with the specified major*/
	default Iterator<Student> majorIterator(String major) {
		return new MajorIterator(major, this);
	}
	
}
