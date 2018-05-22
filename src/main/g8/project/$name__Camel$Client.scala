import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object $name;format="Camel"$Client {
  private[this] val clientSettings = Shared.commonSettings ++ Seq(
    name := "$name;format="Camel"$Client",
    // use Scala.js provided launcher code to start the client app
    scalaJSUseMainModuleInitializer := true,
    scalaJSStage in Global := FastOptStage
  )

  lazy val $name;format="camel"$Client = (project in file("$name;format="norm"$-client"))
    .settings(clientSettings: _*)
    .enablePlugins(ScalaJSPlugin)
    .dependsOn(Shared.sharedJs)
}