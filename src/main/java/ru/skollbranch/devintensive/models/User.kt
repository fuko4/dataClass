package ru.skollbranch.devintensive.models

import ru.skollbranch.devintensive.utils.Utils
import java.util.*

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
) {
    var introBit: String

    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String): this(id, "John", "Doe")

    init {
        introBit = getIntro()

        println("I'm Alive!!! \n" +
                "${if (lastName == "Doe") "His name is $firstName $lastName" else "And his name $firstName $lastName"}\n" +
        "$introBit")
    }

    private fun getIntro()="""
        rrrrrrrrrrrrrrr!!!
        rrrrrrrrrr!!!
    """.trimIndent()

    fun printMe()= println("""
            id = $id
            firstName = $firstName
            lastName = $lastName
            avatar = $avatar
            rating = $rating
            respect = $respect
            lastVisit = $lastVisit
            isOnline = $isOnline
        """.trimIndent())

    /***
     * Компаньен объект который создает объекты класса User
     * Принимает fullName - разделяет его на firstName и lastName
     */
    companion object Factory{
        private var lastId = -1

        fun makeUsre(fullName: String?): User{
            lastId++
//            val parts: List<String>? = fullName?.split(" ")
//            val firstName = parts?.getOrNull(0)
//            val lastName = parts?.getOrNull(1)

            val (firstName, lastName) = Utils.parseFullName(fullName)
            return User(id = "$lastId", firstName = firstName, lastName = lastName )
        }
    }

}