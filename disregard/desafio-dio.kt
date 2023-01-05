object identificador {
    var turma: Int = 0
    var instrutor: Int = 0
    var formacao: Int = 0
    var modulo: Int = 0
    var curso: Int = 0
    var topico: Int = 0
    var projeto: Int = 0
    var challenge: Int = 0
    var live: Int = 0
}

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
enum class TipoAtividade { CHALLENGE, PROJECT, CURSO, LIVE}

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Curso(var nome: String)

class Topico

class Aula

data class AtividadesEducacionais(val nome: String, val tipo: Int)

data class ConteudoEducacional(val nome: String, var atividades: List<AtividadesEducacionais>)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val id = ++identificador.formacao
}

data class Turma(var inicio: String, var formacao: Int) {
    val id = ++identificador.turma
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun showId() {
        println("turma(id=$id, inicio=$inicio, formacao=$formacao)")
    }
}


fun main() {
    var turma1 = Turma("01/02/2020", 1)
    var turma2 = Turma("02/02/2020", 2)
   
    turma1.showId()
    turma2.showId()
}