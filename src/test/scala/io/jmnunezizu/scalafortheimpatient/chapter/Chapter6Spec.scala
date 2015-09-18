package io.jmnunezizu.scalafortheimpatient.chapter

import io.jmnunezizu.scalafortheimpatient.chapter06.Exercise01.Conversions
import io.jmnunezizu.scalafortheimpatient.chapter06.Exercise02._
import io.jmnunezizu.scalafortheimpatient.chapter06.Exercise04.Point
import io.jmnunezizu.scalafortheimpatient.chapter06.Exercise06.PlayingCard
import org.specs2.Specification

class Chapter6Spec extends Specification {

  def is = s2"""
    Exercise 1
      inchesToCentimetres should convert nicely $e1t1
      gallonsToLitres should convert nicely $e1t2
      milesToKilometres should convert nicely $e1t3

    Exercise 2
      inchesToCentimetres should convert nicely $e2t1
      gallonsToLitres should convert nicely $e2t2
      milesToKilometres should convert nicely $e2t3

    Exercise 3
      should be able to create a point without the new keyword $e4

    Exercise 6
      should convert to string using the unicode character $e6

    Exercise 7
      isRed should return true for hearts $e7t1
      isRed should return true for diamonds $e7t2
      isRed should return false for clubs $e7t3
      isRed should return false for spades $e7t4
  """

  def e1t1 = Conversions.inchesToCentimetres(2) must be_==(Conversions.OneInchInCentimetres * 2)

  def e1t2 = Conversions.gallonsToLitres(5) must be_==(Conversions.OneGalloInLitres * 5)

  def e1t3 = Conversions.milesToKilometres(10) must be_==(Conversions.OneMileInKilometres * 10)

  def e2t1 = InchesToCentimetres(2) must be_==(InchesToCentimetres.OneInchInCentimetres * 2)

  def e2t2 = GallonsToLitres(5) must be_==(GallonsToLitres.OneGalloInLitres * 5)

  def e2t3 = MilesToKilometres(10) must be_==(MilesToKilometres.OneMileInKilometres * 10)

  def e4 = {
    val p = Point(3, 4)
    p.x must be_==(3)
    p.y must be_==(4)
  }

  def e6 = {
    PlayingCard.Hearts.toString must be_==("♥")
    PlayingCard.Diamonds.toString must be_==("♦")
    PlayingCard.Clubs.toString must be_==("♣")
    PlayingCard.Spades.toString must be_==("♠")
  }

  def e7t1 = PlayingCard.isRed(PlayingCard.Hearts) must beTrue

  def e7t2 = PlayingCard.isRed(PlayingCard.Diamonds) must beTrue

  def e7t3 = PlayingCard.isRed(PlayingCard.Clubs) must beFalse

  def e7t4 = PlayingCard.isRed(PlayingCard.Spades) must beFalse

}
