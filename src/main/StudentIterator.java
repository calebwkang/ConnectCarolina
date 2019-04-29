package main;

import java.util.Iterator;

abstract public class StudentIterator implements Iterator<Student> {

	/*protected so subclasses can easily access*/
	protected Class class1;
	protected int current;
	
	public StudentIterator(Class class1) {
		this.class1 = class1;
		current = 0;
	}
	
	/*normalize position so no out of bounds problems*/
	public int normalize() {
		int size = class1.getRoster().length;
		return  ((current % size) + size) % size;
	}
	
	/*keep this abstract because the logic for
	 *whether there is a next in our iterator
	 *is different for subclasses*/
	@Override
	abstract public boolean hasNext();

	/*hasNext set's our current index so we just return
	 *the student at the position and increment index*/
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
