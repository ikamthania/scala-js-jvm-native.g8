import sbt._

object $name;format="Camel"$Native {
  private[this] val nativeSettings = Shared.commonSettings ++ Seq(
    name := "$name;format="Camel"$Native",
    nativeLinkStubs := true
  )

  lazy val $name;format="camel"$Native = (project in file("$name;format="norm"$-native"))
    .settings(nativeSettings: _*)
    .enablePlugins(ScalaNativePlugin)
    .dependsOn(Shared.sharedNative)
}