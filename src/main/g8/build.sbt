lazy val sharedJs     = $name;format="Camel"$Shared.sharedJs
lazy val sharedJvm    = $name;format="Camel"$Shared.sharedJvm
lazy val sharedNative = $name;format="Camel"$Shared.sharedNative
lazy val $name;format="camel"$JS  = $name;format="Camel"$JS.$name;format="camel"$JS
lazy val $name;format="camel"$JVM  = $name;format="Camel"$JVM.$name;format="camel"$JVM
lazy val $name;format="camel"$Native  = $name;format="Camel"$Native.$name;format="camel"$Native

triggeredMessage in ThisBuild := Watched.clearWhenTriggered
