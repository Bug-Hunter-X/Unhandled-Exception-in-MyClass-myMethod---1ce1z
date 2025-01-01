```scala
class MyClass(val x: Int) {
  def myMethod(): Int = {
    if (x > 0) {
      x * 2 
    } else {
      println("Warning: Input x is not positive. Returning 0.")
      0 
    }
  }
}

object Main extends App {
  val obj1 = new MyClass(1)
  println(obj1.myMethod()) // Output: 2

  val obj2 = new MyClass(-1)
  println(obj2.myMethod()) // Output: Warning: Input x is not positive. Returning 0. 0
}
```