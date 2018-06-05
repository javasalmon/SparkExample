package com.exercise.spark.example1;

public class InterfaceImpl implements Interface1,Interface2{
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		Interface1.super.hello();
		Interface2.super.hello();
	}

}
