package com.exercise.spark.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ClosureDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1);
		Function<Integer, Integer> closure = t->t*3;
		list.stream().map(closure).forEach(n -> System.out.print(n+" "));
	}
}
