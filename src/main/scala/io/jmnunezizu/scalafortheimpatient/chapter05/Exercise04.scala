package io.jmnunezizu.scalafortheimpatient.chapter05

object Exercise04 extends App {

  class Time2(val hours: Int, val minutes: Int) {
    private val minutesSinceMidnight: Int = hours * 60 + minutes

    def before(other: Time2): Boolean = {
      minutesSinceMidnight < other.minutesSinceMidnight
    }

    override def toString = s"$hours:$minutes"
  }

  val t1 = new Time2(3, 33)
  val t2 = new Time2(3, 34)

  println(s"Time $t1 before $t2: " + t1.before(t2))

  val t3 = new Time2(3, 33)
  val t4 = new Time2(2, 59)

  println(s"Time $t3 before $t4: " + t3.before(t4))

  val t5 = new Time2(3, 33)
  val t6 = new Time2(3, 33)

  println(s"Time $t5 before $t6: " + t5.before(t6))

}
