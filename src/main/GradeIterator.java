package main;

import java.util.Iterator;

public class GradeIterator implements Iterator<Student> {

	private double lower;
	private double higher;
	private Class class1;
	private int current;
	
	public GradeIterator(double lower, double higher, Class class1) {
		this.lower = lower;
		this.higher = higher;
		this.class1 = class1;
		current = 0;
	}
	
	@Override
	public boolean hasNext() {
		Student[] roster = class1.getRoster();
		
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
