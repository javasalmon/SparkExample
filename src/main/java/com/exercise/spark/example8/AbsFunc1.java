package com.exercise.spark.example8;

import org.apache.spark.graphx.EdgeTriplet;
import scala.runtime.AbstractFunction1;

import java.io.Serializable;

public class AbsFunc1 extends AbstractFunction1<EdgeTriplet<String,String>, Object> implements Serializable{

	
	@Override
	public Object apply(EdgeTriplet<String, String> arg0) {
		return arg0.attr().equals("Friend");
	}
	
}