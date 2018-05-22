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
    scalacOptions ++= Seq(
      "-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked", "–Xcheck-null" /*, "-Xfatal-warnings"*/ , "-Xlint", "-Ywarn-unused:locals,privates",
      "-Ywarn-adapted-args", "-Ywarn-dead-code", "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-numeric-widen", "-language:higherKinds",
      "-language:implicitConversions"
    ),
    scalacOptions in Test ++= Seq("-Yrangepos")

  )

  object Versions {
    val app = "$version$"
  }

  lazy val shared = (crossProject(JSPlatform, JVMPlatform, NativePlatform).crossType(CrossType.Pure) in file("$name;format="norm"$-shared")).settings(commonSettings: _*).settings(
    crossScalaVersions := Seq("$scala_version_for_jvm$" ,"$scala_version_for_js$" ,"$scala_version_for_native$").distinct,
    libraryDependencies ++= Seq(

    )
  )
    .jvmSettings(
      scalaVersion := "$scala_version_for_jvm$",
      libraryDependencies ++= Seq(

      )
    )
    .jsSettings(
      scalaVersion := "$scala_version_for_js$",
      libraryDependencies ++= Seq(

      )
    )
    .nativeSettings(
      scalaVersion := "$scala_version_for_native$",
      libraryDependencies ++= Seq(

      )
    )

  lazy val sharedJs = shared.js
  lazy val sharedJvm = shared.jvm
  lazy val sharedNative = shared.native
}