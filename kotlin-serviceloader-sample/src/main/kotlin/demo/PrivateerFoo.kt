package demo

@Suppress("unused")
class PrivateerFoo {
    class IAmAnInnerClass : Foo {
        override fun doIt() {
            println("For Queen and Country!")
        }
    }
}
