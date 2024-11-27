ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"


val PekkoVersion = "1.1.2"
val PekkoHttpVersion = "1.1.0"

lazy val root = (project in file("."))
  .settings(
    name := "tp-actors",
    resolvers += "Maven Central" at "https://repo.maven.apache.org/maven2",
    idePackagePrefix := Some("fr.cytech.icc"),
    libraryDependencies ++= Seq(
    "org.apache.pekko" %% "pekko-actor-typed" % "2.7.0",
    "org.apache.pekko" %% "pekko-stream" % "2.7.0",
    "org.apache.pekko" %% "pekko-http" % "2.7.0",

  "org.apache.pekko" %% "pekko-http-spray-json" % "2.7.0",
  "com.typesafe" % "config" % "1.4.1")

  
  )
