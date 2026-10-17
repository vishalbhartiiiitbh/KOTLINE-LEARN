//fun main (args: Array<String>)
//{
////    println("User input")
////
////    println("Enter your name: ");
////    val name = readln();
////    println("hello"+name);
//    //adding two number
//    println("Enter two number to add");
//    val number = readln();
//    val number2 = readln();
//    print("addition of two number is "+(number+number2));// it return nu1nu2 not nu1+num2
//
//    //
//}

import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    print("Enter first number: ")
    val num1 = read.nextInt()

    print("Enter second number: ")
    val num2 = read.nextInt()

    println("Addition = ${num1 + num2}")
}