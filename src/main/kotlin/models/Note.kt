package io.onegen.models
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Note(
    var id: Int,
    var title: String,
    var body: String,
    var user: User,
    var created: LocalDateTime) {

    @Serializable
    data class Reminder(
        var name: String,
        var creator: User) {

        @Serializable
        data class Postit(
            var created: LocalDateTime) {
        }
    }

    @Serializable
    enum class Pet(val value: Int) {
        DOG(0),
        CAT(1),
    }
}
