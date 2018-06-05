package com.exercise.spark.example1;

public interface MyInterface {

	default String hello() {
		return "Inside static method in interface";
	}

	void absmethod();
}
