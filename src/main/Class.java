package main;

import java.util.Iterator;

public interface Class extends Iterable<Student>{
	
	String getDept();
	Student[] getRoster();
	
	/*returns iterator of students with a gpa in between the
	 *specified upper and lower bounds*/
	default Iterator<Student> gradeIterator(double lower, double upper) {
		return new GradeIterator(lower, upper, this);
	}
	
	/*returns an iterator of students in the specified year
	 * in school*/
	Iterator<Student> yearIterator(Student.Rank year);
	
	
	/*returns an iterator of students with the specified major*/
	Iterator<Student> majorIterator(String major);
	
}
