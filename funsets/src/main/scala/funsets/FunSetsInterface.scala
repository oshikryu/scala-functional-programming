package funsets

/**
 * The interface used by the grading infrastructure. You should not edit any
 * code here, or your submission may fail with a NoSuchMethodError.
 */
trait FunSetsInterface:
  type FunSet = Int => Boolean

  def contains(s: FunSet, elem: Int): Boolean
  def singletonSet(elem: Int): FunSet
  def union(s: FunSet, t: FunSet): FunSet
  def intersect(s: FunSet, t: Int => Boolean): FunSet
  def diff(s: FunSet, t: FunSet): FunSet
  def filter(s: FunSet, p: Int => Boolean): FunSet
  def forall(s: FunSet, p: Int => Boolean): Boolean
  def exists(s: FunSet, p: Int => Boolean): Boolean
  def map(s: FunSet, f: Int => Int): FunSet
  def toString(s: FunSet): String

for {
  p <- people
  fname = p.firstName
  if (fname startsWith "b")
} yield fname.toUpperCase


abstract class CustomClass[A] {
  def map[B] (f: A => B): CustomClass[B]
}

def withFilter(p: A => Boolean): Sequence[A] = {
  val tmpArrayBuffer = elems.filter(p)
  Sequence(tmpArrayBuffer: _*)
}

val modelAccessTokenMap: Map[String, String] = Map[String, String](modelAccessTokenMetadata.id.toString -> tokenValue.value)
