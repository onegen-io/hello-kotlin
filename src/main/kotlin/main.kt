package io.onegen.helloKotlin
import io.onegen.helloKotlin.models.AccountPlan
import io.onegen.helloKotlin.models.User
import kotlinx.datetime.*

fun main() {
    val myself = User(
        1, "john@doe.com", "qwerty",
        AccountPlan.PREMIUM,
        Clock.System.now().toLocalDateTime(TimeZone.UTC), emptyList())

    println("Hello, ${myself.username}")
}
