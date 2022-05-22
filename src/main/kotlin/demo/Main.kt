package demo

import java.util.ServiceLoader

fun main() {
    println("== LOADING")
    val fooLoader = ServiceLoader.load(Foo::class.java)
    println("FOO LOADER -> $fooLoader")
    println("FOOS LOADED -> ${fooLoader.toList()}")
}

interface Foo
