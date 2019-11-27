package kotlinTutorial

fun main(){
 bal()
}
fun bal(): Boolean{
    // accessing string elements one by one

    var str2 = "{[(])}"
    var answer: Boolean

    for(i in 0 until str2.length-1){
        for(j in str2.length-1 until 0){
            if(str2[i] == str2[j]){
                return true
            }
        }
    }
    return true
}
