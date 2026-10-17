import  java.util.Scanner;
fun main ()
{
    val scanner = Scanner(System.`in`)
    println("Enter first number: ")
    val num1 = scanner.nextInt()
    println("Enter second number: ")
    val num2 = scanner.nextInt()
    if (num1 > num2){
        println("num 1 is greater then num2")
    }
    else if (num1 < num2){
        println("num1 is lesser then num2")
    }


}

fun main2() {
    val marks = 85

    when (marks) {
        in 90..100 -> println("Grade A")
        in 75..89 -> println("Grade B")
        in 50..74 -> println("Grade C")
        else -> println("Fail")
    }
}
fun main1() {
    val day = 3

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        else -> println("Invalid day")
    }
}