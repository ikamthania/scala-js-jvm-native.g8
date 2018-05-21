import Dependencies.SharedDependencies
//import com.sksamuel.scapegoat.sbt.ScapegoatSbtPlugin.autoImport._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._
import webscalajs.ScalaJSWeb

object `$name__Camel$Shared` {

  lazy val commonSettings = Seq(
    version := Versions.app,
    scalaVersion := Versions.scala,
    scalacOptions ++= Seq(
      "-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked", "–Xcheck-null" /*, "-Xfatal-warnings"*/ , "-Xlint", "-Ywarn-unused:locals,privates",
      "-Ywarn-adapted-args", "-Ywarn-dead-code", "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-numeric-widen", "-language:higherKinds",
      "-language:implicitConversions"
    ),
    scalacOptions in Test ++= Seq("-Yrangepos")

  )

  object Versions {
    val app = "$version$"
    val scala = "$scala_version$"
  }

  lazy val shared = (crossProject.crossType(CrossType.Pure) in file("$name;format="norm"$-shared")).settings(commonSettings: _*).settings(
    libraryDependencies ++= Seq(

    )
  )
    .jvmSettings(
      libraryDependencies ++= Seq(

      )
    )
    .jsSettings(
      libraryDependencies ++= Seq(

      )
    )
    .nativeSettings(
      libraryDependencies ++= Seq(

      )
    )

  lazy val sharedJs = shared.js
  lazy val sharedJvm = shared.jvm
  lazy val sharedNative = shared.native
}