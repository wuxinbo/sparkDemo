package com.wu.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Created by wuxinbo on 8/24/16.
 *  spark
 * @author wuxinbo
 * @version 1.0
 */
public class SparkDemo {


    public static void main(String args[]){
        SparkConf conf =new SparkConf().setAppName("sparkDemo").setMaster("spark://192.168.0.152:7077");
        JavaSparkContext context =new JavaSparkContext(conf);
        System.out.println("SparkappName: "+context.appName());
        JavaRDD<String> rdd =context.textFile("/home/wuxinbo/ZTEPaylog/appserver.log");
        long count =rdd.count();
        System.out.println("文件总共行数："+count);
        System.out.println("文件第一行："+rdd.first());
//        final int[] interfacecont = {0};
         int interfacecount=0;
//         rdd.;
//        for (String s : list) {
//            if (s.contains("检查接口")){
//                System.out.println(s);
//                interfacecount++;
//            }
//        }

        System.out.println("interfaceCount: "+interfacecount);
//        JavaRDD<String> line =rdd.map(s->s.);
//        System.out.println(line.count());
    }
}
