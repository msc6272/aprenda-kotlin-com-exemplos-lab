//val tipo = TipoConteudo.PROJECT
    /* when(tipo) {
        is Float -> print("float")
        else -> print("não sei")
    } */
    
    /* println(tipo::class.simpleName)
    println(TipoConteudo.PROJECT::class.simpleName)
    println(TipoConteudo::class.simpleName) */

    println(TipoConteudo.values().joinToString(separator = "-"))
    //TipoConteudo.values().forEach { print(it.name); println(it.ordinal) }
    TipoConteudo.values().forEach { println("${it.name} - ${it.ordinal}") }
    //TipoConteudo.values().forEach { println(it.name) }
    //TipoConteudo.values().forEach { println(it.ordinal) }
    println(TipoConteudo.valueOf("CURSO"))


    //val charset = Charsets.UTF_8
    //println(atividade1.toString())
    //println(atividade7.toString())
    //println(atividade1.instrutor)
    //println(atividade1.duracao)


        /* fun definirInstrutor(instrutor: String) {
        var instrutor = instrutor
    } */

    //override fun toString(): String = "Atividade [Nome -> ${this.nome}, Nivel -> ${this.nivel}]"



    val id = ++identificador.atividade
    //lateinit var instrutor: String 
    //var instrutor?: String = null
    var instrutor: String = ""
    //var duracao: Int = 0 // em minutos
    var link: String = ""
    var stack: String = ""
    // var pai?: Int


        //println(it.name())
        //println(it.object.name)
        //println(it)
        //println(this.name)
        //println(it.simpleName)
        //println(this.name)




/* formacao1.showDetails()
    formacao2.showDetails()
    
    atividade1.showDetails()
    atividade2.showDetails()
    atividade3.showDetails()
    atividade4.showDetails()
    atividade5.showDetails()
    atividade6.showDetails()
    atividade7.showDetails() */

    //println(objectInstance(atividade2))
    //println(atividade5::class.simpleName)
    // println(::atividade3)
    // println(::atividade3.get())
    // println(::atividade3.name)
    // println(::atividade3.simpleName)
    //println(atividade3.this)
    
    // println("[conteudo1] Qtd atividades: ${conteudo1.itens}")
    // println("[conteudo2] Qtd atividades: ${conteudo2.itens}")



    /* for (atividade in conteudo1.atividades) {
        println(atividade.showDetails())
    } */

    
            //println(conteudos?.size) // it works
        conteudos?.forEach { e -> println("$e ") } // it works
        println(conteudos?.get(1).toString()) // it works


