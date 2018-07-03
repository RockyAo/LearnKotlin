// const 只能标记基础数据类型
const val reallyConstant: Int = 42

fun main(args: Array<String>) {
    //常量
    val pi: Double = 3.1415926

    // Variables
    var variableNumber: Int = 10
    variableNumber = 0
    variableNumber = 1_000_000

    var counter: Int = 0

    counter += 1

    println(counter)

    counter -= 1

    println(counter)

    val  characterA: Char = 'A'

    var  stringDog: String = "Dog"

    // 字符串拼接
    var message = "hello " + "my name is "
    val name = "dick"
    message += name

    println(message)

    val exclamationMark: Char = '!'

    message += exclamationMark

    println(message)

    message = "hello my name is $name!"

    println(message)

    //多行字符串

    val bigString = """
  |You can have a string
  |that contains multiple
  |lines
  |by
  |doing this.
  """.trimMargin()

    println(bigString)


    /// 类似 swift 的元组
    val coordinates: Pair<Int,Int> = Pair(2,3)

    val x1 = coordinates.first
    val x2 = coordinates.second

    var (x,y) = coordinates

    println("X: $x, Y: $y")

    val coordinate3d = Triple(2,3,1)

    val (x4,y4,_) = coordinate3d

    val a: Short = 12
    val b: Byte = 120
    val c: Int = -10000

    val  answer = a+b+c

    var any: Any = 42
    any = "42"

    add()
}

//fun add() {
//    val result = 2 + 2
//    println(result)
//}

fun add(): Unit {
    val result = 2+ 2
    println(result)
}

fun doNothingForever(): Nothing {
    while (true) {

    }
}

