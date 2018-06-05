package com.exercise.spark.example8;

import java.io.Serializable;

import org.apache.spark.graphx.Edge;

import scala.runtime.AbstractFunction1;

public class AbsFunc7 extends AbstractFunction1<Edge<String>,Integer> implements Serializable{

	@Override
	public Integer apply(Edge<String> edge) {
		return edge.attr().length();
	}

	
	
}