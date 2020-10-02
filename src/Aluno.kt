class Aluno(
        val nome: String,
        val sobrenome: String,
        val codigoAluno: Int
){
    override fun toString(): String {
        return "Aluno(nome='$nome', sobrenome='$sobrenome', codigoAluno=$codigoAluno)"
    }
}