class ProfessorTitular(
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int,
        codigoProfessor: Int,
        val especialidade: String
): Professor(nome, sobrenome, tempoDeCasa, codigoProfessor){
    override fun toString(): String {
        return "ProfessorTitular(especialidade='$especialidade')"
    }
}