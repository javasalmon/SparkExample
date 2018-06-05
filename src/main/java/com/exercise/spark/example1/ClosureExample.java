package com.exercise.spark.example1;

import java.util.function.Function;

public class ClosureExample {
	public static Function<Integer, Integer> closure() {
		 int a=3;
		
		Function<Integer, Integer> function = i->{
			//a++;
			return i*a;
		};
		
		return function;
	}
}
