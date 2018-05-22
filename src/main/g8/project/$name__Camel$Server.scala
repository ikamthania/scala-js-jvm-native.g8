import sbt._

object $name;format="Camel"$Server {
  private[this] val serverSettings = Shared.commonSettings ++ Seq(
    name := "$name;format="Camel"$Server"
  )

  lazy val $name;format="camel"$Server = (project in file("$name;format="norm"$-server"))
    .settings(serverSettings: _*)
    .enablePlugins(ScalaJSPlugin)
    .dependsOn(Shared.sharedJvm)
}