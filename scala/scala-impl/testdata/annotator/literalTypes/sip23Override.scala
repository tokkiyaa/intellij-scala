trait Overridden {
  val f0 = 4
  val f1: Int = 4
  val f2: 4 = 4

  def f3 = 4
  def f4: Int = 4
  def f5: 4 = 4
}

class Overrider0 extends Overridden {
  override val f0 = 4
  override val f1: Int = 4
  override val f2: 4 = 4

  override def f3 = 4
  override def f4: Int = 4
  override def f5: 4 = 4
}
