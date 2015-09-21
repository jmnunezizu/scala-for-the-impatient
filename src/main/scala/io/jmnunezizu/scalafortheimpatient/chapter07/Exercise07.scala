package io.jmnunezizu.scalafortheimpatient.chapter07

/**
 * Chapter 7 - Exercise 7.
 *
 * In the preceding exercise, move all imports into the innermost scope possible.
 */
object Exercise07 extends App {

  import java.util.{HashMap => JavaHashMap}
  val javaMap: JavaHashMap[Int, String] = new JavaHashMap[Int, String] {
    put(1, "a")
    put(2, "b")
    put(3, "c")
  }

  import scala.collection.immutable.{Map => ScalaHashMap}
  import scala.collection.JavaConverters._
  val scalaMap: ScalaHashMap[Int, String] = javaMap.asScala.toMap

  println("Java Map")
  import scala.collection.JavaConversions._
  for (entry <- javaMap.entrySet())
    println(s"${entry.getKey} -> ${entry.getValue}")

  println("Scala Map")
  for ((k, v) <- scalaMap) {
    println(s"$k -> $v")
  }

}
