import sbt._
import sbt.Keys._

object AkkaTutorialBuild extends Build {

  lazy val akkaTutorial = Project(
    id = "akka-tutorial",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Akka Tutorial",
      organization := "com.mattgillooly",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.1"
    )
  )
}
