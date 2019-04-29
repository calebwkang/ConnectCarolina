package main;

import java.util.Iterator;

public class MajorIterator extends StudentIterator implements Iterator<Student> {
	private String major;
	
	
	public MajorIterator(String major, Class class1) {
		super(class1);
		this.major = major;
	}
	
	
	@Override
	public boolean hasNext() {
		Student[] roster = class1.getRoster();
		normalize();
		
		for (int i = 0; i < roster.length; i++) {
			if (roster[i].getMajor().equals(major)) {
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
		}
		
		return null;
		
	}

}
