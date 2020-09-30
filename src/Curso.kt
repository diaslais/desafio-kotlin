class Curso (
        val nome: String,
        val codigoCurso: Int,
        var quantidadeMaximaDeAlunos: Int
) {
    var professorTitular: ProfessorTitular = ProfessorTitular("", "", 0, 0, "")
    var professorAdjunto: ProfessorAdjunto = ProfessorAdjunto("", "", 0, 0, 0)
    var alunosMatriculados: MutableList<Aluno> = mutableListOf<Aluno>()

    constructor(
            nome: String,
            codigoCurso: Int,
            quantidadeMaximaDeAlunos: Int,
            professorTitular: ProfessorTitular,
            professorAdjunto: ProfessorAdjunto,
            alunosMatriculados: MutableList<Aluno>
    ): this(nome, codigoCurso, quantidadeMaximaDeAlunos){
        this.professorTitular = professorTitular
        this.professorAdjunto = professorAdjunto
        this.alunosMatriculados = alunosMatriculados
    }

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
}