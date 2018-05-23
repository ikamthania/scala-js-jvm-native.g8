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

  object Versions {
    val app = "$version$"
  }

  lazy val shared = (crossProject(JSPlatform, JVMPlatform, NativePlatform).crossType(CrossType.Pure) in file("$name;format="norm"$-shared")).settings(commonSettings: _*).settings(
    crossScalaVersions := Seq("$scala_version_for_jvm$" ,"$scala_version_for_js$" ,"$scala_version_for_native$").distinct,
    libraryDependencies ++= Seq(

    )
  )
    .jvmSettings(
      scalaVersion := "$scala_version_for_jvm$"

    )
    .jsSettings(
      scalaVersion := "$scala_version_for_js$"
    )
    .nativeSettings(
      scalaVersion := "$scala_version_for_native$"
    )

  lazy val sharedJs = shared.js
  lazy val sharedJvm = shared.jvm
  lazy val sharedNative = shared.native
}