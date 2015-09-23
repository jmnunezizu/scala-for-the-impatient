package io.jmnunezizu.scalafortheimpatient.chapter10

import java.awt.Point
import java.beans.{PropertyChangeSupport => JavaPropertyChangeSupport, PropertyChangeEvent, PropertyChangeListener}

/**
 * Chapter 10 - Exercise 5.
 */
object Exercise05 extends App {

  trait PropertyChangeSupport {
    protected val delegate = new JavaPropertyChangeSupport(this)

    def addPropertyChangeListener(listener: PropertyChangeListener) = delegate.addPropertyChangeListener(listener)
    def removePropertyChangeListener(listener: PropertyChangeListener) = delegate.removePropertyChangeListener(listener)
  }

  class ListenedPoint(x: Int, y: Int) extends Point(x, y) with PropertyChangeSupport {
    override def setLocation(x: Int, y: Int): Unit = {
      delegate.firePropertyChange("setLocation", (getX, getY), (x, y))
      super.setLocation(x, y)
    }
  }

  class Listener extends PropertyChangeListener {
    override def propertyChange(evt: PropertyChangeEvent): Unit = {
      println(evt.getSource.asInstanceOf[Point].x)
    }
  }

  val listener = new Listener()
  val p1 = new ListenedPoint(10, 20)
  p1.addPropertyChangeListener(listener)
  p1.setLocation(20, 10)

}
