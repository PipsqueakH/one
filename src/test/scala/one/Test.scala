package one

/**
 * Created by Pipsqueak on 2016/2/25.
 */

import org.scalatest._
import test.fun
class Test extends FlatSpec{
  "a fun" should "equals 1" in {
    assert(fun == 1)
  }
}
