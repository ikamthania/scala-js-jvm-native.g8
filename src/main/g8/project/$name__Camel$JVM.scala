import sbt._
import sbt.Keys._


object $name;format="Camel"$JVM {
  private[this] val serverSettings = $name;format="Camel"$Shared.commonSettings ++ Seq(
//    name := "$name;format="Camel"$JVM"
    scalaVersion := "$scala_version_for_jvm$",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "utest" % "0.6.3" % "test"
    ),
    testFrameworks += new TestFramework("utest.runner.Framework")
  )


  lazy val $name;format="camel"$JVM = (project in file("$name;format="norm"$-jvm"))
    .settings(serverSettings: _*)
    .dependsOn($name;format="Camel"$Shared.sharedJvm)
}