fun main() {
    val array = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    println("Было: "+array.toList())
    array.bubbleSort()
    println("Стало: "+array.toList())
}

fun IntArray.bubbleSort() {
    var sorted = false
    while (!sorted) {
        // вложенный цикл
        sorted = true
        for (i in 1 until this.size) {
            val previous = this[i - 1]
            val current = this[i]
            if (previous > current) {
                this.swap(i - 1, i)
                sorted = false
            }
        }
    }
}

fun IntArray.swap(index1: Int, index2: Int) {
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}

