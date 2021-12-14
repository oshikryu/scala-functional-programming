def product(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) {
      1
  } else {
      f(a) * product(f)(a + 1, b)
  }

var res = product(x => x * x)(1, 5)
println(res)
//def fact(n: Int) = product(x => x)(1, n)

