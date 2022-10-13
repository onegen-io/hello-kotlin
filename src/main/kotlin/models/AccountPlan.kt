package io.onegen.helloKotlin.models
import kotlinx.serialization.Serializable

@Serializable
enum class AccountPlan(val value: String) {
    BASIC("basic"),
    PREMIUM("premium"),
    PLUS("plus"),
}
