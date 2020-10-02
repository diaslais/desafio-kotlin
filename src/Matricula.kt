import java.time.LocalDateTime

class Matricula(val aluno: Aluno, val curso: Curso, val dataDeMatricula: LocalDateTime){
    override fun toString(): String {
        return "Matricula(aluno=$aluno, curso=$curso, dataDeMatricula=$dataDeMatricula)"
    }
}