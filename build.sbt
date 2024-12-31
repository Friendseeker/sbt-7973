ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

ThisBuild / logLevel := Level.Debug

lazy val A = (project in file("A"))
  .settings(
    name := "A"
  )

lazy val B = (project in file("B"))
  .settings(
    name := "B"
  ).dependsOn(A)
