import sbt._
import sbt.Keys._
import scala.scalanative.sbtplugin.ScalaNativePlugin
import scala.scalanative.sbtplugin.ScalaNativePlugin.autoImport._


object $name;format="Camel"$Native {
  private[this] val nativeSettings = $name;format="Camel"$Shared.commonSettings ++ Seq(
    name := "$name;format="Camel"$Native",
    nativeLinkStubs := true,
    scalaVersion := "$scala_version_for_native$"
  )

  lazy val $name;format="camel"$Native = (project in file("$name;format="norm"$-native"))
    .settings(nativeSettings: _*)
    .enablePlugins(ScalaNativePlugin)
    .dependsOn($name;format="Camel"$Shared.sharedNative)
}