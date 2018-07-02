import sbt.Keys._
import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbtcrossproject.{crossProject, CrossType}
import sbtcrossproject.CrossPlugin.autoImport._
import scalajscrossproject.ScalaJSCrossPlugin.autoImport.{toScalaJSGroupID => _, _}
import scalanativecrossproject.ScalaNativeCrossPlugin.autoImport._

object $name;format="Camel"$Shared {

  lazy val commonSettings = Seq(
    version := Versions.app,
    scalacOptions ++= Seq(),
    scalacOptions in Test ++= Seq()

  )

  def getScalaCOptions(version: String): Seq[String] = {
    if (version.contains("2.12"))
      Seq("-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked", "–Xcheck-null", "-Xfatal-warnings", "-Xlint", "-Ywarn-unused:implicits", "-Ywarn-unused:imports", "-Ywarn-unused:locals", "-Ywarn-unused:params", "-Ywarn-unused:patvars", "-Ywarn-unused:privates", "-Ywarn-adapted-args", "-Ywarn-dead-code", "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-numeric-widen", "-language:higherKinds", "-language:implicitConversions")
    else
      Seq("-deprecation", "-encoding", "UTF-8", "-feature", "-language:existentials", "-language:higherKinds", "-language:implicitConversions", "-unchecked", "-Xfatal-warnings", "-Xlint", "-Yno-adapted-args", "-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-value-discard", "-Xfuture", "-Ywarn-unused-import")
  }

  object Versions {
    val app = "$version$"
  }

  lazy val shared = (
    crossProject(JSPlatform, JVMPlatform, NativePlatform)
      .crossType(CrossType.Pure) in file("$name;format="norm"$-shared")).settings(commonSettings: _*)
    .settings(
      crossScalaVersions := Seq("$scala_version_for_jvm$" ,"$scala_version_for_js$" ,"$scala_version_for_native$").distinct
    )
    .jvmSettings(
      scalaVersion := "$scala_version_for_jvm$",
      scalacOptions ++= getScalaCOptions("$scala_version_for_jvm$")

    )
    .jsSettings(
      scalaVersion := "$scala_version_for_js$",
      scalacOptions ++= getScalaCOptions("$scala_version_for_js$")
    )
    .nativeSettings(
      scalaVersion := "$scala_version_for_native$",
      scalacOptions ++= getScalaCOptions("$scala_version_for_native$")
    )

  lazy val sharedJs = shared.js
  lazy val sharedJvm = shared.jvm
  lazy val sharedNative = shared.native
}