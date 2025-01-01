# Uncommon Scala Bug: Silent Exception Handling Failure

This repository demonstrates a subtle bug in Scala code where an exception is thrown, but it's not always easily caught during testing.  The bug involves improper handling of negative input values. 

The `MyClass` class contains a method that throws an `IllegalArgumentException` if the input `x` is not positive. However, the exception can be missed during typical testing due to the limited scope of test cases.

**To reproduce:** Run `bug.scala`. The exception will be thrown.

**Solution:** The solution involves improved error handling and testing to cover edge cases.

This example highlights the importance of thorough testing and anticipating unexpected input values, especially when working with exceptions.