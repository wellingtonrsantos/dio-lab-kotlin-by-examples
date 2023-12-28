package model

import model.enums.Nivel

data class Formacao(val nome: String, val stack: String, var conteudos: List<ConteudoEducacional>, val nivel : Nivel) {

    val inscritos = mutableListOf<Aluno>()

    fun matricular(usuario: Aluno) {
        inscritos.add(usuario)
        println("Usuario ${usuario.nome} matriculado com sucesso!")
    }

    fun cancelarMatricula(usuario: Aluno) {
        inscritos.remove(usuario)
        println("Matricula do usuario ${usuario.nome} cancelada com sucesso!")
    }
}
