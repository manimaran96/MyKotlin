
/*
	Basic Kotlin 
	Ref: https://devhints.io/kotlin
*/
fun main() {
	
	// Mutability
	var mutableString: String = "Mani" // Modifiable variable 
	val immutableString: String = "Maran" // Not modifiable 
	val inferredString = "Mani" // Dynamic variable
    
    // Strings
    val name = "Manimaran"
    val greeting = "Hello, " + name
    val greetingTemplate = "Hello, $name"
    val interpolated = "Hello, ${name.toUpperCase()}"
    
    // Numbers
    val intNum = 10
    val doubleNum = 10.0
    val longNum = 10L
    val floatNum = 10.0F
    
    // Booleans
    val trueBoolean = true
    val falseBoolean = false
    val andCondition = trueBoolean && falseBoolean
    val orCondition = trueBoolean || falseBoolean

    // Static Fields
    val key = Person.NAME_KEY
    println("Key $key")
    
    // Nullable properties
    // val cannotBeNull: String = null // Invalid
    val canBeNullStr: String? = null // Valid
    // val cannotBeNull: Int = null // Invalid
    val canBeNull: Int? = null // Valid
    
    // Checking for null

    val nameStr: String? = "Manimaran"

    if (nameStr != null && nameStr.length > 0) {
        print("String length is ${nameStr.length}")
    } else {
        print("String is empty.")
    }

    // Safe Operator
    val nullableString: String? = null
    val nullableStringLength: Int? = nullableString?.length
    // val nullableDepartmentHead: String? = person?.department?.head?.name

    // Elvis Operator

    val nonNullStringLength: Int = nullableString?.length ?: 0
    // val nonNullDepartmentHead: String = person?.department?.head?.name ?: ""
    // val nonNullDepartmentHead: String = person?.department?.head?.name.orEmpty()

    // Safe Casts

    // Will not throw ClassCastException
    // val nullableCar: Car? = (input as? Car)



}

// Singleton class 
class Person {
    companion object {
        val NAME_KEY = "name_key"
    }
}

