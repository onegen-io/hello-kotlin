package io.onegen.models
import kotlinx.serialization.Transient
import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

@Serializable
data class User(
    var id: Int,
    var email: String,
    @Transient
    var password: String = "",
    var newsletter: Boolean?,
    var notes: List<Note>,
    var username: String?,
    var eyeColor: Color?,
    var birthday: LocalDate,
    var fundom: Map<String, Note>?,
    var reminders: List<List<Note.Reminder>>?,
    var colors: List<Color>) {

    fun isEmailValid(): Boolean {
        val regex = ".+".toRegex()
        return email.contains(regex)
    }

    fun validateEmail(): String? {
        if (isEmailValid()) {
            return null
        } else {
            return "Email is not valid"
        }
    }

    fun isUsernameValid(): Boolean {
        val regex = "[a-zA-Z0-9]{0,40}".toRegex()
        return username?.contains(regex) ?: false
    }

    fun validateUsername(): String? {
        if (isUsernameValid()) {
            return null
        } else {
            return "Username is not valid."
        }
    }

    companion object {
        fun isEmailValid(s: String): Boolean {
            val regex = ".+".toRegex()
            return s.contains(regex)
        }

        fun validateEmail(s: String): String? {
            if (isEmailValid(s)) {
                return null
            } else {
                return "Email is not valid"
            }
        }

        fun isUsernameValid(s: String): Boolean {
            val regex = "[a-zA-Z0-9]{0,40}".toRegex()
            return s.contains(regex)
        }

        fun validateUsername(s: String): String? {
            if (isUsernameValid(s)) {
                return null
            } else {
                return "Username is not valid."
            }
        }
    }
}
