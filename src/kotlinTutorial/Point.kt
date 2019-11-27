package kotlinTutorial

open class Point(var x: Int, var y:Int) {
    fun addPoint(point: Point): Point{
        return Point(x + point.x, y + point.y)
    }

    fun print(){
        println("($x, $y)")
    }


}