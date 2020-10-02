fun main(){

    //testando métodos da classe Curso

    val aluno1 = Aluno("Maria", "Silva", 111)
    val aluno2 = Aluno("Jose", "Silva", 222)
    val aluno3 = Aluno("Marta", "Silva", 333)
    val aluno4 = Aluno("Joao", "Silva", 444)

    val curso1 = Curso("Desenvolvimento Mobile", 12345, 2)

    //adicionarUmAluno
    curso1.adicionarUmAluno(aluno1)
    curso1.adicionarUmAluno(aluno2)
    curso1.adicionarUmAluno(aluno3)

    for (i in curso1.alunosMatriculados){
        println("${i.nome}, ${i.sobrenome}, ${i.codigoAluno}")
    }

    //excluirAluno
    curso1.excluirAluno(curso1.alunosMatriculados[1])
    println("")

    for (i in curso1.alunosMatriculados){
        println("${i.nome}, ${i.sobrenome}, ${i.codigoAluno}")
    }
    println("")

    //testando métodos da classe DigitalHouseManager

    val listaDeAlunos = mutableListOf<Aluno>()
    val listaDeProfessores = mutableListOf<Professor>()
    val listaDeCursos = mutableListOf<Curso>()
    val listaDeMatriculas = mutableListOf<Matricula>()

    val digitalHouse = DigitalHouseManager(listaDeAlunos, listaDeProfessores, listaDeCursos, listaDeMatriculas)

    //registrarCurso
    digitalHouse.registrarCurso("Fullstack", 5678, 3)
    digitalHouse.registrarCurso("Desenvolvimento Mobile", 12345, 2)

    for (i in listaDeCursos){
        println("${i.nome}, ${i.codigoCurso}, ${i.quantidadeMaximaDeAlunos}")
    }
    println("")

    //excluirCurso
    digitalHouse.excluirCurso(12345)

    for (i in listaDeCursos){
        println("${i.nome}, ${i.codigoCurso}, ${i.quantidadeMaximaDeAlunos}")
    }
    println("")




}