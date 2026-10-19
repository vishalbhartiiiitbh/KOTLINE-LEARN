//pasirs and triples
enum class Color(val rgb: Int) {
    RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff), YELLOW(0xFF0000);
}
fun main (){
println("itering over all color")
    for (color in Color.entries){
        println(color)
    }
}
