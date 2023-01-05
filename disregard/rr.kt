import kotlin.reflect.KProperty

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

class Example {
    var p: String by Delegate()
}

class Dado(val dia: Int, val nome: String)



//val x = 1

fun main () {
    var dado = Dado(13, "Jorge")

    val e = Example()
    println(e.p)
    //println(dado.objectInstance.name)
    println(dado)
    println({dado})
    println(it)

    /* Dado::class.members.map {
     println(it.name)
     println(it.returnType)
    } */

    /* Dado::class.members.map {
        println(it.name)
        println(it.returnType)
    } */

    /* println(::x.get())
    println(::x.name) */
}