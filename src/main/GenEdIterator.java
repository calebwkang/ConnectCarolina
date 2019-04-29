package main;

import java.util.Iterator;

import main.Class.GenEd;

public class GenEdIterator extends ClassIterator implements Iterator<Class> {
	
	private GenEd ge;
	
	public GenEdIterator(GenEd ge, Catalog catalog) {
		super(catalog);
		this.ge = ge;
	}
	
	/*goes through classes and finds the next class with
	 *the specified GenEd, updating current index along the way*/
	@Override
	public boolean hasNext() {
		Class[] classes = catalog.getClasses();
		normalize();
		
		for (int i = 0; i < classes.length; i++) {
			for (GenEd genEd : classes[i].getGenEds()) {
				if (this.ge == genEd) {
					return true;
				}
			}
			current++;
		}
		return false;
	}

	

}
