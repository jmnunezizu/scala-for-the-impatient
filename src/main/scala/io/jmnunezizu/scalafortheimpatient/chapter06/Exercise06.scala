package io.jmnunezizu.scalafortheimpatient.chapter06

object Exercise06 extends App {

  object PlayingCard extends Enumeration {
    val Hearts = Value("♥")
    val Diamonds = Value("♦")
    val Clubs = Value("♣")
    val Spades = Value("♠")

    def isRed(card: PlayingCard.Value): Boolean = {
      card == PlayingCard.Hearts || card == PlayingCard.Diamonds
    }
  }

  println("Hearts (" + PlayingCard.Hearts + ") is red = " + PlayingCard.isRed(PlayingCard.Hearts))
  println("Diamonds (" + PlayingCard.Diamonds + ") is red = " + PlayingCard.isRed(PlayingCard.Diamonds))
  println("Clubs (" + PlayingCard.Clubs + ") is red = " + PlayingCard.isRed(PlayingCard.Clubs))
  println("Spades (" + PlayingCard.Spades + ") is red = " + PlayingCard.isRed(PlayingCard.Spades))

}
