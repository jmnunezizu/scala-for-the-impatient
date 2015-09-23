package io.jmnunezizu.scalafortheimpatient.chapter11

import scala.collection.mutable.ArrayBuffer

/**
 * Chapter 11 - Exercise 5.
 *
 * Provide operators that construct an HTML table. For example,
 *
 * <pre>
 *   Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
 * </pre>
 *
 * should produce:
 *
 * <pre>
 *   <table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling...
 * </pre>
 */
object Exercise05 extends App {

  class Table {
    private var rows: ArrayBuffer[TableRow] = ArrayBuffer.empty[TableRow]

    def |(value: String): Table = {
      if (rows.isEmpty) {
        rows.append(TableRow())
      }
      rows.last.addCell(TableCell(value))
      this
    }

    def ||(value: String): Table = {
      rows.append(TableRow())
      rows.last.addCell(TableCell(value))
      this
    }

    override def toString(): String = {
      val sb = new StringBuilder()
      sb.append("<table>")

      for (row <- rows) sb.append(row)

      sb.append("</table>")
      sb.toString()
    }
  }

  object Table {
    def apply() = new Table()
  }

  class TableRow {
    var cells: Seq[TableCell] = Seq.empty[TableCell]

    def addCell(cell: TableCell) = cells = cells :+ cell

    override def toString(): String = {
      val sb = new StringBuilder()
      sb.append("<tr>")

      for (cell <- cells) sb.append(cell)
      sb.append("</tr>")

      sb.toString()
    }

  }

  object TableRow {
    def apply() = new TableRow()
  }

  class TableCell(val value: String) {
    override def toString(): String = value.mkString("<td>", "", "</td>")
  }

  object TableCell {
    def apply(value: String) = new TableCell(value)
  }

  val t1 = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  println(t1)
  assert(t1.toString == "<table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling</td><td>Odersky</td></tr><tr><td>JVM</td><td>JVM, .NET</td></tr></table>")

  val t2 = Table() || "" || ""
  println(t2)
  assert(t2.toString == "<table><tr><td></td></tr><tr><td></td></tr></table>")

}
