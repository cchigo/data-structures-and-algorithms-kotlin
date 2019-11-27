package kotlinTutorial

import java.util.*

fun main (){
   mark()
}

fun mark(): Int {
    var array : Array<Int> = arrayOf(1,20,15, 100, 111, 1000, 5)
    array.sort()
    var sorted = array
    var count = 0
    var n = array.size
    var amount = 50

    for(i in 0 until n){
        if (sorted[i] < amount){
            amount -= sorted[i]
            count ++
        }
    }
    print(count)
    return count
}