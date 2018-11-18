name := "play-multi"

version := "0.1"

scalaVersion := "2.12.7"

lazy val root = (project in file("."))
  .aggregate(
    core,
    api
  )

lazy val core = project

lazy val api = project
  .enablePlugins(PlayScala)
  .dependsOn(core)
  .settings(
    libraryDependencies ++= Seq(
      guice
    )
  )

scalafmtVersion in ThisBuild := "1.5.1"
