package io.onegen.models
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

@Serializable
data class DataType(
    var a: Boolean,
    var b: Int,
    var c: Byte,
    var d: Short,
    var e: Int,
    var f: Long,
    var g: UInt,
    var h: UByte,
    var i: UShort,
    var j: UInt,
    var k: ULong,
    var l: Float,
    var m: Double,
    var n: String,
    var o: Char,
    var p: Byte,
    var q: ByteArray,
    var r: LocalDate,
    var s: LocalDateTime,
    var aa: Boolean?,
    var bb: Int?,
    var cc: Byte?,
    var dd: Short?,
    var ee: Int?,
    var ff: Long?,
    var gg: UInt?,
    var hh: UByte?,
    var ii: UShort?,
    var jj: UInt?,
    var kk: ULong?,
    var ll: Float?,
    var mm: Double?,
    var nn: String?,
    var oo: Char?,
    var pp: Byte?,
    var qq: ByteArray?,
    var rr: LocalDate?,
    var ss: LocalDateTime?) {
}
