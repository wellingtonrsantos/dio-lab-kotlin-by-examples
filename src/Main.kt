import model.Aluno
import model.ConteudoEducacional
import model.Formacao
import model.enums.Nivel
import model.enums.TipoConteudo

fun main() {
    val conteudoFuncKotlin = ConteudoEducacional(
        "O Poder das Funções em Kotlin", 2, Nivel.BASICO, TipoConteudo.CURSO)
    val conteudoProjetoKotlin = ConteudoEducacional(
        "Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin",
        2, Nivel.INTERMEDIARIO, TipoConteudo.PROJETO)
    val conteudoDesafioKotlin = ConteudoEducacional(
        "Suas Primeiras Condições em Kotlin",
        2, Nivel.AVANCADO, TipoConteudo.DESAFIO_CODIGO)

    val listConteudosKotlin = listOf(conteudoFuncKotlin, conteudoProjetoKotlin, conteudoDesafioKotlin)
    val formacaoBackendKotlin = Formacao(
        "Desenvolvimento Backend com Kotlin", "Kotlin", listConteudosKotlin, Nivel.BASICO)

    val aluno1 = Aluno("Wellington", "wel@gmail.com")
    val aluno2 = Aluno("Jose", "jose@gmail.com")

    formacaoBackendKotlin.matricular(aluno1)
    formacaoBackendKotlin.matricular(aluno2)
    println("Alunos inscritos na formacao ${formacaoBackendKotlin.nome}: ${formacaoBackendKotlin.inscritos}")

    formacaoBackendKotlin.cancelarMatricula(aluno1)
    println("Alunos inscritos na formacao ${formacaoBackendKotlin.nome}: ${formacaoBackendKotlin.inscritos}")
}
