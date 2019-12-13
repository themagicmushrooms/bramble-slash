enablePlugins(ScalaJSPlugin, WorkbenchPlugin)

name := "BrambleSlash1"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"
scalaVersion in ThisBuild := "2.11.8"

scalaJSOptimizerOptions ~= { _.withParallel(false) }

lazy val macros = (project in file("macros")).settings(
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
)

lazy val core = (project in file(".")).settings(
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "com.lihaoyi" %%% "scalatags" % "0.6.1"
  )
).dependsOn(macros % "compile-internal")
