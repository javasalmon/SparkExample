package com.exercise.spark.example8;

import java.io.Serializable;

import org.apache.spark.graphx.EdgeContext;

import scala.runtime.AbstractFunction1;
import scala.runtime.BoxedUnit;

public class AbsFunc4 extends AbstractFunction1<EdgeContext<String,String,Integer>, BoxedUnit> implements Serializable{

	@Override
	public BoxedUnit apply(EdgeContext<String, String, Integer> arg0) {
		
		
		arg0.sendToDst(1);
		return BoxedUnit.UNIT;
	}

}
