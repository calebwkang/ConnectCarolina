package main;

import java.util.Iterator;

public class GradeIterator extends StudentIterator implements Iterator<Student> {

	private double lower;
	private double higher;
	
	
	
	public GradeIterator(double lower, double higher, Class class1) {
		super(class1);
		this.lower = lower;
		this.higher = higher;
	}
	
	
	@Override
	public boolean hasNext() {
		Student[] roster = class1.getRoster();
		normalize();
		
		for (int i = 0; i < roster.length; i++) {
			if (roster[current].getGPA() > lower && roster[current].getGPA() < higher) {
				return true;
			}
			
			current++;
		}
		
		return false;
	}

	@Override
	public Student next() {
		if (hasNext()) {
			Student[] roster = class1.getRoster();
			Student next = roster[current];
			current++;
			return next;
		}
		
		return null;
	}

}
