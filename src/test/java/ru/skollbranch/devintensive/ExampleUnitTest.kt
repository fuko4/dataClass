package ru.skollbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skollbranch.devintensive.extentions.format
import ru.skollbranch.devintensive.models.User
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_instance() {
//        val user = User("1")
        val user2 = User("2", "John2", "Cena")
//        val user3 = User("3", "John3", "Silverhend", null, lastVisit = Date(), isOnline = true)

//        user.printMe()
//        user2.printMe()
//        user3.printMe()

//        println("$user")

    }

    @Test
    fun test_companion(){
        val user = User.makeUsre("Иван Иванов")
        val userCopy = user.copy(id = "2", lastName = "Петров")

        println(user)
        println(userCopy)
    }

    @Test
    fun test_decomposition(){
        val user = User.makeUsre(fullName = "Сегей Петов")

        /**
         * Функция ниже позволяет вывести необходимые данные объекта
         */

        fun getUserInfo() = user

        val(id, firrstName, lastName) = getUserInfo()

        println("user = $id, $firrstName, $lastName")

        println(".Component = ${user.component2()}")
    }

    @Test
    fun dateFormate(){
        val user = User("2", "John2", "Cena")
        var user1 = user.copy(lastVisit = Date())
        val user2 = User("100",
         "firstName: String?",
         "lastName: String?",
         "avatar: String?",
         1,
         2,
         Date(),
         false
        )

        println(user2.lastVisit)
    }
}
