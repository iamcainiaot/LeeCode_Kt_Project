import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    println("Hello World! 第一个程序！")
    println(SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date()))
    // FIXME　var 是一个可变变量   val 是一个常量类似于 final
    var s = 1;
    function1(s);
}

fun function1(s: Int) {
    println("还有我嘞" + s)
}