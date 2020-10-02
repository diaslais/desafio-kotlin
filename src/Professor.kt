abstract class Professor(
        val nome: String,
        val sobrenome: String,
        var tempoDeCasa: Int,
        val codigoProfessor: Int
){
    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', tempoDeCasa=$tempoDeCasa, codigoProfessor=$codigoProfessor)"
    }
}