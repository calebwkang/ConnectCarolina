package main;



public class LevelIterator extends ClassIterator {

	private int level;
	
	public LevelIterator(int level, Catalog catalog) {
		super(catalog);
		this.level = level;
	}
	
	/*iterates through classes and finds the
	 *next class above the certain level*/
	@Override
	public boolean hasNext() {
		Class[] classes = catalog.getClasses();
		normalize();
		
		for (int i = 0; i < classes.length; i++) {
			if(classes[i].getLevel() > level) {
				return true;
			}
			current++;
		}
		return false;
	}



}
