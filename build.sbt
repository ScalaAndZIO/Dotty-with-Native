name := "Dotty-NativeTest"

lazy val root = project
  .in(file("."))
  .settings(
    description := "Example sbt project that compiles using Dotty",
    version := "0.1.0",
    scalaVersion := "0.17.0-RC1"
  )

enablePlugins(ScalaNativePlugin)
