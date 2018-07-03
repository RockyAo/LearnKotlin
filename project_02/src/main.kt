

fun main(args: Array<String>) {

    whenExpressions()
}

fun whenExpressions() {
    val number = 10
    when (number) {
        0-> println("Zero")
        else -> println("Non-zero")
    }
}

fun loops(){
    val closeRange = 0..5
    println(closeRange)

    // 0 - 5
    val halOpenRange = 0 until 5
    val decreasingRange = 5 downTo 0

    for (x in halOpenRange) {
        println(x)
    }

    val count = 10
    var sum = 0
    for (i in 1..count) {
        sum += 1
    }

    println(sum)

    sum = 1
    var lastSum = 0
    repeat(10) {
        val tem = sum
        sum += lastSum
        lastSum = tem
    }

    println(lastSum)

    sum = 0
    // 每次跳2
    for(i in 1..count step 2) {
        println(i)
        sum += i
    }

    println(sum)

    sum = 0

    // 减少到1  每次跳2
    for(i in count downTo 1 step 2) {
        println(i)
        sum += i
    }

    sum = 0

    for (row in 0 until 8) {

        println(row)

        if (row % 2 == 0) {
            continue
        }

        for (column in 0 until 8) {
            sum += row * column
        }
    }

    sum = 0

    rowLoop@ for (row in 0 until 8) {
        columnLoop@ for (column in 0 until 8) {
            if (row == column) {
                continue@rowLoop
            }
            sum += row*column
        }
    }

    println(sum)
}