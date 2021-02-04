package com.epam.generics

/**
 * TODO Write generic class Optional which allows
 * - to check whether [value] which it was created with [exists] or null
 * - retrieve value if it is not null [get]
 * - in case value is null get should cause NullPointerException
 * - retrieve nullable version of value [getOrNull]
 *
 * There should be a companion object extension method [toOptional] which allows
 * to create Optional object from `Any?` object
 */
class Optional /*TODO add generic*/ private constructor(
    /*TODO value property*/
) {
    val exists: Boolean = TODO()

    fun get() = TODO("Add return type and implementation")

    fun getOrNull() = TODO("Add return type and implementation")

    companion object {
        fun /*TODO Replace Any with generic type*/Any?.toOptional(): Optional<Any> = Optional(this)
    }
}





