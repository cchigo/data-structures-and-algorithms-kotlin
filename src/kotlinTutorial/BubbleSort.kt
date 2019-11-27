package kotlinTutorial

fun main(){
    bsort()
//    3
//    1 2 3

//    Array is sorted in 3 swaps.
//    First Element: 1
//    Last Element: 3
}

//fun mark(): Int {
//    var array : Array<Int> = arrayOf(1,20,15, 100, 111, 1000, 5)
//    array.sort()
//    var sorted = array
//    var count = 0
//    var n = array.size
//    var amount = 50
//
//    for(i in 0 until n){
//        if (sorted[i] < amount){
//            amount -= sorted[i]
//            count ++
//        }
//    }
//    print(count)
//    return count
//}
fun bsort(): Int{
    var array : Array<Int> = arrayOf(3,2,1)
//    var newArr: Array<Int> = arrayOf()
    var n : Int = array.size
    var count: Int = 0

    for (i in 0 until n){
        for (j in 0 until n-1) {
            var temp = array[j]
            if (array[j] > array[j + 1])
            {
                array[j] = array[j+1]
                array[j+1] = temp
                count ++
            }
        }

    }

    println("Array is sorted in $count.")
    println("First Element: ${array[0]}")
    println("Last Element:${array[n-1]}")

    return count

}