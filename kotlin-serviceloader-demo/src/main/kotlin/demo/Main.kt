package demo

import java.util.ServiceLoader

fun main() {
    println("== LOADING")
    val fooLoader = findServices<Foo>()
    println("FOO LOADER -> $fooLoader")
    println("FOOS LOADED -> ${fooLoader.toList()}")
    println("== EXECUTING")
    fooLoader.forEach { it.doIt() }
}

inline fun <reified T> findServices(): ServiceLoader<T> =
    ServiceLoader.load(T::class.java)
