package io.onegen.helloKotlin.models
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class User(
    var id: Int,
    var username: String,
    var password: String,
    var accountPlan: AccountPlan,
    var created: LocalDateTime,
    var notes: List<Note>) {
}
