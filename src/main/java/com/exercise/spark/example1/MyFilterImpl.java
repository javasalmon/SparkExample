package com.exercise.spark.example1;

import java.io.File;

public class MyFilterImpl {
	public static void main(String[] args) {
		File dir = new File("src/main/java");
		//dir.list(new MyFileNameFilter());
		dir.list((dirname,name)->name.endsWith("java"));
		
	}
}
