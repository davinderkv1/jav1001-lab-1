/*Convert.kt
 Write a small Kotlin command line application (Convert.kt) that allows a user to convert between different forms of measurement. The program should:

1. Collect a numeric value from the user and store it in an appropriate variable
2. Collect the current unit of measurement.
3. Determine the appropriate conversion (in either direction, i.e., the user can enter km or mi)
4. Display the new result */

fun main()
    {
        println("Program to Convert units")
        print("Enter the value to be converted: ")
        val value = readLine()!!.toDouble()
        println(value)
        print("Enter the Current unit: ")
        val currentUnit = readLine()
        println(currentUnit)
        print("Enter the unit to which you want to convert value: ")
        val targetUnit = readline()
        println(targetUnit)


    }