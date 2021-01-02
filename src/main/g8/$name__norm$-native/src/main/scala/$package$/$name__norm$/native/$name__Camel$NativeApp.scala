package $package$.$name$.native

import $package$.$name$.shared._

object $name;format="Camel"$NativeApp {

  def main(args: Array[String]): Unit = {
    println(Shared.getMessage("native"))
  }

}
