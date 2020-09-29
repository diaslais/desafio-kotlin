class Curso (
        val nome: String,
        val codigoCurso: Int,
        val professorTitular: ProfessorTitular,
        val professorAdjunto: ProfessorAdjunto,
        val quantidadeMaximaDeAlunos: Int,
        var alunosMatriculados: MutableList<Aluno>
) {
    //métodos
    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(this.alunosMatriculados.size < quantidadeMaximaDeAlunos){
            this.alunosMatriculados.add(umAluno)
            return true
        } else{
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno){
        this.alunosMatriculados.remove(umAluno)
    }
}