class SdbmsActions : StudentInterface {

    override fun addStudent() {
        print("\nEnter Name: ")
        val newName = readln()
        print("Enter Age: ")
        val newAge = Integer.valueOf(readln())
        print("Enter Gender: ")
        val newGender = readln()

        studentList.add(index = studentList.size,Student(id = studentList.size+1, name = newName, age = newAge, gender = newGender))

        println("\nStudent, $newName, has been added successfully!")
        displayMainOptions()
    }

    override fun editStudent() {
        print("\nEnter ID: ")
        val input = Integer.valueOf(readln())
        var ctr = 0
        var address = -1
        for (student in studentList) {
            if (student.id == input) {
                address = ctr
                break
            }
            ctr++
        }
        if (address != -1) {
            print("Enter new name: ")
            val newName = readln()
            print("Enter new age: ")
            val newAge = Integer.valueOf(readln())
            studentList[address].name = newName
            studentList[address].age = newAge

            println("\nStudent with ID, ${input}, has been edited successfully!")
            displayMainOptions()
        } else {
            println("\nUnable to find student with ID, ${input}. Please try again.")
            editStudent()
        }
    }

    override fun deleteStudent() {
        print("\nEnter ID: ")
        val input = Integer.valueOf(readln())
        var ctr = 0
        var address = -1
        for (student in studentList) {
            if (student.id == input) {
                address = ctr
                break
            }
            ctr++
        }
        if (address != -1) {
            studentList.removeAt(address)
            println("\nStudent with ID, ${input}, has been deleted!")
            displayMainOptions()
        } else {
            println("\nUnable to find student with ID, ${input}. Please try again.")
            deleteStudent()
        }
    }

    override fun displayStudent() {
        for (student in studentList) {
            println("\nID: ${student.id}")
            println("Name: ${student.name}")
            println("Age: ${student.age}")
            println("Gender: ${student.gender}")
        }
        displayMainOptions()
    }

}
