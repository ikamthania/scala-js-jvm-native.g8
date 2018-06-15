lazy val sharedJs     = $name;format="Camel"$Shared.sharedJs
lazy val sharedJvm    = $name;format="Camel"$Shared.sharedJvm
lazy val sharedNative = $name;format="Camel"$Shared.sharedNative
lazy val $name;format="camel"$Client  = $name;format="Camel"$Client.$name;format="camel"$Client
lazy val $name;format="camel"$Server  = $name;format="Camel"$Server.$name;format="camel"$Server
lazy val $name;format="camel"$Native  = $name;format="Camel"$Native.$name;format="camel"$Native

triggeredMessage in ThisBuild := Watched.clearWhenTriggered
