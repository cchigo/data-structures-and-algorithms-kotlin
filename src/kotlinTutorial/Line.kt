package kotlinTutorial

class Line (var point1: Point, var point2: Point, x: Int, y: Int) : Point(x, y) {
    fun findLine(line: Line): Int {
        return ((point2.y - point1.y)/(point2.x -point1.x))
    }
    fun show(){
        println("")
    }
}