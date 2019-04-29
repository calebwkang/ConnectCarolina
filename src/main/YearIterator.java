package main;

import java.util.Iterator;

import main.Student.Year;

public class YearIterator extends StudentIterator implements Iterator<Student> {

	private Year year;
	
	public YearIterator(Student.Year year, Class class1) {
		super(class1);
		this.year = year;
		
	}
	@Override
	public boolean hasNext() {
		Student[] roster = class1.getRoster();
		normalize();
		
		for (int i = 0; i < roster.length; i++) {
			if (roster[i].getYear() == year) {
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
