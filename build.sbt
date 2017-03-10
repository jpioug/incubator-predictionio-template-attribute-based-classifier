import AssemblyKeys._

assemblySettings

name := "template-scala-parallel-classification"

organization := "org.apache.predictionio"

libraryDependencies ++= Seq(
  "org.jpioug.predictionio" %% "apache-predictionio-core" % "0.11.0-v1-SNAPSHOT" % "provided",
  "org.apache.spark"        %% "spark-core"               % "1.3.1" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "1.3.1" % "provided")
