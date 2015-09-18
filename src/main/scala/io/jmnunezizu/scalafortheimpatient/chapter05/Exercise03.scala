package io.jmnunezizu.scalafortheimpatient.chapter05

object Exercise03 extends App {

  class Time(val hours: Int, val minutes: Int) {
    private val minutesSinceMidnight = (hours * minutes) - 1

    def before(other: Time): Boolean = {
      (hours < other.hours) || (hours == other.hours && minutes < other.minutes)
    }

    override def toString = s"$hours:$minutes"
  }

  val t1 = new Time(3, 33)
  val t2 = new Time(3, 34)

  println(s"Time $t1 before $t2: " + t1.before(t2))

  val t3 = new Time(3, 33)
  val t4 = new Time(2, 59)

  println(s"Time $t3 before $t4: " + t3.before(t4))

  val t5 = new Time(3, 33)
  val t6 = new Time(3, 33)

  println(s"Time $t5 before $t6: " + t5.before(t6))

}
