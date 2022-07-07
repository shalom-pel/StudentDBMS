var studentList = mutableListOf<Student>()

fun main(args: Array<String>) {
    println("Exercise Day 2 - Student DMS")
    displayMainOptions()
}

fun displayMainOptions() {
    println("\nChoose From the following Actions:")
    println("\t[A] - Add")
    println("\t[B] - Edit")
    println("\t[C] - Delete")
    println("\t[D] - Display")
    println("\t[E] - Exit App")
    print("\nSelection: ")
    val selection = readln().lowercase()

    val actions = SdbmsActions()

    if (selection == "A") {
        actions.addStudent()
    } else if (selection == "B") {
        actions.editStudent()
    } else if (selection == "C") {
        actions.deleteStudent()
    } else if (selection == "D") {
        actions.displayStudent()
    } else if (selection == "E") {
        //
    } else {
        println("Invalid Selection. Please try again")
        displayMainOptions()
    }
}


