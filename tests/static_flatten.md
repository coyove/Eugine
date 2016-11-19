var a = 1                   |   var {1} = 1
var b = 2                   |   var {2} = 2
                            |   
def foo(x, y) => {          |   def {3}({4}, {5}) => {
    var c = x               |       var {6} = {4}
    var d = y               |       var {7} = {5}
    a + b + c + d + x * y   |       {1} + {2} + {6} + {7} + {4} * {5}
}                           |   }
                            |
var c = 3                   |   var {4} = 3
                            |   
println(a + b + c)          |   println({1} + {2} + {4})
println(foo(a, b))          |   println({3}({1}, {2}))