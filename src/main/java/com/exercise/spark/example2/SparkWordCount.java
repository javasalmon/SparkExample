package com.exercise.spark.example2;

import java.io.File;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;
//http://stackoverflow.com/questions/19620642/failed-to-locate-the-winutils-binary-in-the-hadoop-binary-path

//http://www.javaworld.com/article/2972863/big-data/open-source-java-projects-apache-spark.html
	
public class SparkWordCount {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("hadoop.home.dir"));
		String inputPath = args[0];
		String outputPath = args[1];
		FileUtils.deleteQuietly(new File(outputPath));

		JavaSparkContext sc = new JavaSparkContext("local", "sparkwordcount");

		JavaRDD<String> rdd = sc.textFile(inputPath);

		JavaPairRDD<String, Integer> counts = rdd
				.flatMap(x -> Arrays.asList(x.split(" ")).iterator())
				.mapToPair(x -> new Tuple2<String, Integer>((String) x, 1))
				.reduceByKey((x, y) -> x + y);

		counts.saveAsTextFile(outputPath);
		sc.close();
	}
}
