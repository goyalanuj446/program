package edu.ncu.processor;
import edu.ncu.exception.*;
public class A{
	public void f() throws LevelOneException{
		throw new LevelOneException("error1");
	}
} 