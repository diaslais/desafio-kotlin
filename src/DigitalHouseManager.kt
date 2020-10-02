import java.time.LocalDateTime

class DigitalHouseManager(
        var alunos: MutableList<Aluno>,
        var professores: MutableList<Professor>,
        var cursos: MutableList<Curso>,
        var matriculas: MutableList<Matricula>
) {
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        this.cursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int){
        var cursoAExcluir: Curso? = null
        for(curso in this.cursos){
            if(curso.codigoCurso == codigoCurso){
                cursoAExcluir = curso
            }
        }
        if (cursoAExcluir != null){
            this.cursos.remove(cursoAExcluir)
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        this.professores.add(ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        this.professores.add(ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int){
        var professorAExcluir: Professor? = null
        for(professor in this.professores){
            if(professor.codigoProfessor == codigoProfessor){
                professorAExcluir = professor
            }
        }
        if (professorAExcluir != null){
            this.professores.remove(professorAExcluir)
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        this.alunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        var alunoMatricula: Aluno? = null
        var cursoMatricula: Curso? = null

        for (aluno in this.alunos){
            if(aluno.codigoAluno == codigoAluno){
                alunoMatricula = aluno
            }
        }
        for (curso in this.cursos){
            if(curso.codigoCurso == codigoCurso){
                cursoMatricula = curso
            }
        }
        if (alunoMatricula == null){
            throw Exception("Aluno não encontrado.")
        }
        if (cursoMatricula == null){
            throw Exception("Curso não encontrado.")
        }

        if (cursoMatricula.alunosMatriculados.size < cursoMatricula.quantidadeMaximaDeAlunos){
            this.matriculas.add(Matricula(alunoMatricula, cursoMatricula, LocalDateTime.now()))
            cursoMatricula.alunosMatriculados.add(alunoMatricula)
            println("O aluno foi matriculado com sucesso!")
        } else{
            println("Não foi possível realizar a matrícula pois não há vagas.")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        var titular: ProfessorTitular? = null
        var adjunto: ProfessorAdjunto? = null
        var cursoAlocacao: Curso? = null

        for (professor in this.professores){
            if (professor.codigoProfessor == codigoProfessorTitular){
                titular = professor as ProfessorTitular
            } else if (professor.codigoProfessor == codigoProfessorAdjunto){
                adjunto = professor as ProfessorAdjunto
            }
        }
        for (curso in cursos){
            if (curso.codigoCurso == codigoCurso){
                cursoAlocacao = curso
            }
        }
        if (titular == null){
            throw Exception("Professor titular não encontrado.")
        }
        if (adjunto == null){
            throw Exception("Professor adjunto não encontrado.")
        }
        if (cursoAlocacao == null){
            throw Exception("Curso não encontrado.")
        }
        cursoAlocacao.professorTitular = titular
        cursoAlocacao.professorAdjunto = adjunto
    }
}