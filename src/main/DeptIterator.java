package main;

public class DeptIterator extends ClassIterator {

	private String dept;
	
	public static void main(String[] args) {
		System.out.println("Hello World!")
	}
	
	public DeptIterator(String dept, Catalog catalog) {
		super(catalog);
		this.dept = dept;
	}
	
	/*goes through classes and finds the next class with
	 *the matching dept, updating index along the way*/
	@Override
	public boolean hasNext() {
		Class[] classes = catalog.getClasses();
		normalize();
		
		for (int i = 0; i < classes.length; i++) {
			if(classes[i].getDept().equals(dept)) {
				return true;
			}
			current++;
		}
		return false;
	}

}
