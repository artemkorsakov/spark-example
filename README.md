# Spark simple application

[Download Apache Spark].

### Package app jar
``` sh
sbt package
```

### Run app
``` sh
YOUR_SPARK_HOME/bin/spark-submit --class "SimpleApp" --master local[4] SPARK_EXAMPLE_PROJECT_DIR/target/scala-2.12/spark-example_2.12-0.1.jar FILE_ABSOLUTE_PATH
```
App returns count of rows containing "a" and count of rows containing "b".
For example:
```
20/10/13 11:03:10 INFO SimpleApp: Lines with a: 64, Lines with b: 32
```

### Apache Spark Documentation
- [Apache Spark Documentation]

[Download Apache Spark]: https://spark.apache.org/downloads.html
[Apache Spark Documentation]: https://spark.apache.org/docs/latest/quick-start.html
