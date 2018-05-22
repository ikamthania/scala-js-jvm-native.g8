import sbt._
import sbt.Keys._


object $name;format="Camel"$Server {
  private[this] val serverSettings = $name;format="Camel"$Shared.commonSettings ++ Seq(
//    name := "$name;format="Camel"$Server"
  )

  lazy val $name;format="camel"$Server = (project in file("$name;format="norm"$-server"))
    .settings(serverSettings: _*)
    .dependsOn($name;format="Camel"$Shared.sharedJvm)
}