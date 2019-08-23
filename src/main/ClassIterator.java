package main;

import java.util.Iterator;


// these edits are from brian

abstract public class ClassIterator implements Iterator<Class> {

	/*protected so subclasses can easily access*/
	protected Catalog catalog;
	protected int current;
	
	public ClassIterator(Catalog catalog) {
		this.catalog = catalog;
		current = 0;
	}
	
	/*normalize position so no out of bounds problems*/
	public int normalize() {
		int size = catalog.getClasses().length;
		return  ((current % size) + size) % size;
	}
	
	/*keep abstract because logic for making
	 *iterator is different for each subclass*/
	@Override
	abstract public boolean hasNext();

	
	/*hasNext set's our current index so we just return
	 *the class at the position and increment index*/
	@Override
	public Class next() {
		if (hasNext()) {
			Class[] classes = catalog.getClasses();
			Class next = classes[current];
			current++;
			return next;
		}
		return null;
	}

}
