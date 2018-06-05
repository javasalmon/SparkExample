package com.exercise.spark.example2;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;

public class SparkWordCount_1_7 {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("hadoop.home.dir"));
		String inputPath = args[0];
		String outputPath = args[1];
		FileUtils.deleteQuietly(new File(outputPath));

		JavaSparkContext sc = new JavaSparkContext("local", "sparkwordcount1.7");

		JavaRDD<String> rdd = sc.textFile(inputPath);

		JavaPairRDD<String, Integer> counts = rdd
				.flatMap(new FlatMapFunction<String, String>() {
					public Iterator<String> call(String x) {
						return (Iterator<String>) Arrays.asList(x.split(" "));
					}
				}).mapToPair(new PairFunction<String, String, Integer>() {
					public Tuple2<String, Integer> call(String x) {
						return new Tuple2(x, 1);
					}
				}).reduceByKey(new Function2<Integer, Integer, Integer>() {
					public Integer call(Integer x, Integer y) {
						return x + y;
					}
				});
		counts.saveAsTextFile(outputPath);
		sc.close();
	}
}
