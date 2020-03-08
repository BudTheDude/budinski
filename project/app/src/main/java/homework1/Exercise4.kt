package homework1

import java.lang.IllegalArgumentException

class RectangularShape(var x: Int = 0, var y: Int =0 , var with: Int= 0, var height: Int =0 , var color: Int= 0) {
    fun measure() {}
    fun render() {}
}

//A
fun validateShape(shape: RectangularShape): Boolean {
    return when {
        (shape.x < 0 || shape.y < 0) -> {
            print("invalid position"); false
        }
        (shape.with > 1024 || shape.height > 1024) -> {
            print("shape too big"); false
        }
        (shape.color !in 0..0xFFFFFF) -> {
            print("invalid color"); false
        }
        else -> true
    }
}

//B
fun initShape(shape: RectangularShape?) {
    shape?.apply {
        x = 10; y = 20
        with = 100; height = 200
        color = 0xFF0066
    } ?: throw IllegalArgumentException()
}

//C
fun drawShape(shape: RectangularShape?) {
    shape?.also {
        validateShape(it)
        it.measure()
        it.render()
    }
}

