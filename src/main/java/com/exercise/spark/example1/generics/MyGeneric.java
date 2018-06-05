package com.exercise.spark.example1.generics;

public class MyGeneric<T> {
	
	T input;
	
	public MyGeneric(T input) {
		this.input=input;
			
	}
	
	public T getInput()
	{
		return input;
	}
	
	
}
