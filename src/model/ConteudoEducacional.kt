package model

import model.enums.Nivel
import model.enums.TipoConteudo

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel: Nivel, val tipoConteudo: TipoConteudo)
