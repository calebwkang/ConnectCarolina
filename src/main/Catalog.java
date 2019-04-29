package main;

import java.util.Iterator;

import main.Class.GenEd;

public interface Catalog extends Iterable<Class>{
	Class[] getClasses();
	
	/*returns iterator over classes with level above
	 *the specified level*/
	default Iterator<Class> levelIterator(int level) {
		return new LevelIterator(level, this);
	}
	
	/*returns iterator over classes in the specified dept*/
	default Iterator<Class> deptIterator(String dept) {
		return new DeptIterator(dept, this);
	}
	
	/*returns iterator over classes that have the specified ge*/
	default Iterator<Class> genEdIterator(GenEd ge) {
		return new GenEdIterator(ge, this);
	}
}
