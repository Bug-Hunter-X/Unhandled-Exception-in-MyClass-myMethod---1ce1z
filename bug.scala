```scala
class MyClass(val x: Int) {
  def myMethod(): Int = {
    if (x > 0) {
      x * 2 
    } else {
      throw new IllegalArgumentException("x must be positive")
    }
  }
}

object Main extends App {
  val obj = new MyClass(-1)
  println(obj.myMethod())
}
```