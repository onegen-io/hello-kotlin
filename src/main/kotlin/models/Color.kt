package io.onegen.models
import kotlinx.serialization.Serializable

@Serializable
enum class Color(val value: String) {
    GREEN("GREEN"),
    BLUE("BLUE"),
    RED("RED"),
}
