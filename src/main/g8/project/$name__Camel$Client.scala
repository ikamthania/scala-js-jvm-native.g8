import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin


object $name;format="Camel"$Client {
  private[this] val clientSettings = $name;format="Camel"$Shared.commonSettings ++ Seq(
    name := "$name;format="Camel"$Client",
    // use Scala.js provided launcher code to start the client app
    scalaJSUseMainModuleInitializer := true,
    scalaJSStage in Global := FastOptStage
  )

  lazy val $name;format="camel"$Client = (project in file("$name;format="norm"$-client"))
    .settings(clientSettings: _*)
    .enablePlugins(ScalaJSPlugin)
    .dependsOn($name;format="Camel"$Shared.sharedJs)
}