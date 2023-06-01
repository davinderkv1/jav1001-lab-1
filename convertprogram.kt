/*Convert.kt
 Write a small Kotlin command line application (Convert.kt) that allows a user to convert between different forms of measurement. The program should:

1. Collect a numeric value from the user and store it in an appropriate variable
2. Collect the current unit of measurement.
3. Determine the appropriate conversion (in either direction, i.e., the user can enter km or mi)
4. Display the new result */

fun main()
    {
        println("******Program to Convert units******\n\n\n")
        print("Enter the value to be converted: ")
        var value = readLine()!!.toDouble()
        println(value)
        print("Enter the Current unit: ")
        var currentUnit = readLine()
        println(currentUnit)
        print("Enter the unit to which you want to convert value: ")
        var targetUnit = readLine()
        println(targetUnit)
        var result : Double = 0.0
        currentUnit = currentUnit!!.lowercase()
        targetUnit = targetUnit!!.lowercase()
        when(currentUnit)
            {
                "mi" -> when(targetUnit)
                    {
                        "km" -> result = value * 1.60934
                         "cm" -> result = value * 160934
                         "in" -> result = value * 63360
                    }
                "km" -> when(targetUnit)
                    {
                        "in" -> result = value * 39370.1
                        "mi" -> result = value * 0.621371
                        "cm" -> result = value * 100000
                    }
                "in" -> when (targetUnit) 
                   {
                       "km" -> result = value / 39370.1
                        "mi" -> result = value / 63360
                        "cm" -> result = value / 0.393701
                   }
                "cm" -> when (targetUnit) 
                   {
                        "km" -> result = value / 100000
                        "mi" -> result = value / 160934
                        "in" -> result =value * 0.393701
                    }
                "f" -> when(targetUnit)
                    {
                        "c" -> result = ((value-32)*5)/9
                    }
                "c" -> when(targetUnit)
                    {
                        "f" -> result = (value*9/5)+32
                    }
        }
        println("The converted Value is $result")
        

    }