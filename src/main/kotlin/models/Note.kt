package io.onegen.helloKotlin.models
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Note(
    var id: Int,
    var title: String,
    var note: String,
    var created: LocalDateTime) {
}
