package $package$.$name$.jvm

import org.scalatest.funsuite.AnyFunSuite

object $name;format="Camel"$ServerTests extends AnyFunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

}
