package com.exercise.spark.example5;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SQLContext;

public class ContextCreation {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	
	SparkConf conf =new SparkConf().setMaster("local").setAppName("Sql");
	
	JavaSparkContext javaSparkContext = new JavaSparkContext(conf);
	
	SQLContext sqlContext = new SQLContext(javaSparkContext);
	
	//HiveContext hiveContext = new HiveContext(javaSparkContext);
}
}
