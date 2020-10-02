class Curso (
        val nome: String,
        val codigoCurso: Int,
        var quantidadeMaximaDeAlunos: Int
) {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    var alunosMatriculados: MutableList<Aluno> = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(this.alunosMatriculados.size < this.quantidadeMaximaDeAlunos){
            this.alunosMatriculados.add(umAluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno){
        this.alunosMatriculados.remove(umAluno)
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigoCurso=$codigoCurso, quantidadeMaximaDeAlunos=$quantidadeMaximaDeAlunos, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto, alunosMatriculados=$alunosMatriculados)"
    }
}