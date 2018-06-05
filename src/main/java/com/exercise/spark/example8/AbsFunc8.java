package com.exercise.spark.example8;

import java.io.Serializable;

import org.apache.spark.graphx.EdgeTriplet;

import scala.runtime.AbstractFunction1;

public class AbsFunc8 extends AbstractFunction1<EdgeTriplet<String,String>,Integer> implements Serializable{

	@Override
	public Integer apply(EdgeTriplet<String,String> triplet) {
		return triplet.attr().length();
	}

	
	
}