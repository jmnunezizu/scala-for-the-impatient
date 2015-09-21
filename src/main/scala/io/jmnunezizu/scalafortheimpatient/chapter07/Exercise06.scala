package io.jmnunezizu.scalafortheimpatient.chapter07

import java.util.{HashMap => JavaHashMap}
import java.util.{Map => JavaMap}
import scala.collection.immutable.{Map => ScalaHashMap}
import scala.collection.JavaConverters._
import scala.collection.JavaConversions._

/**
 * Chapter 7 - Exercise 6.
 *
 * Write a program that copies all elements from a Java hash map into a Scala
 * hash map. Use imports to rename both classes.
 */
object Exercise06 extends App {

  val javaMap: JavaHashMap[Int, String] = new JavaHashMap[Int, String] {
    put(1, "a")
    put(2, "b")
    put(3, "c")
  }
  val scalaMap: ScalaHashMap[Int, String] = javaMap.asScala.toMap

  println("Java Map")
  for (entry <- javaMap.entrySet())
    println(s"${entry.getKey} -> ${entry.getValue}")

  println("Scala Map")
  for ((k, v) <- scalaMap) {
    println(s"$k -> $v")
  }

}
