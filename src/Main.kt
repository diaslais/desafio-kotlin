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
        println(i.toString())
    }
    println("")

    //excluirAluno
    curso1.excluirAluno(curso1.alunosMatriculados[1])

    for (i in curso1.alunosMatriculados){
        println(i.toString())
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
    digitalHouse.registrarCurso("Desenvolvimento Web", 91011, 1)

    for (i in listaDeCursos){
        println(i.toString())
    }
    println("")

    //excluirCurso
    digitalHouse.excluirCurso(12345)

    for (i in listaDeCursos){
        println(i.toString())
    }
    println("")

    //registrarProfessorAdjunto
    digitalHouse.registrarProfessorAdjunto("Tibúrcio", "Souza", 666, 10)
    digitalHouse.registrarProfessorAdjunto("Jonas", "Menezes", 777, 7)

    for (i in digitalHouse.professores){
        println(i.toString())
    }
    println("")

    //registrarProfessorTitular
    digitalHouse.registrarProfessorTitular("Marcio", "Gonzales", 789, "Front-end")
    digitalHouse.registrarProfessorTitular("Zé", "Juares", 456, "Back-end")

    for (i in digitalHouse.professores){
        println(i.toString())
    }
    println("")

    //excluirProfessor
    digitalHouse.excluirProfessor(666)
    digitalHouse.excluirProfessor(789)

    for (i in digitalHouse.professores){
        println(i.toString())
    }
    println("")

    //matricularAluno
    digitalHouse.matricularAluno("Huguinho", "Duck", 100)
    digitalHouse.matricularAluno("Zezinho", "Duck", 200)
    digitalHouse.matricularAluno("Luizinho", "Duck", 300)

    for (i in digitalHouse.alunos){
        println(i.toString())
    }
    println("")

    //matricularAluno
    digitalHouse.matricularAluno(100, 91011)
    digitalHouse.matricularAluno(200, 91011)
    digitalHouse.matricularAluno(300, 91011)

    for (i in digitalHouse.matriculas){
        println(i.toString())
    }
    println("")

    //alocarProfessores
    digitalHouse.alocarProfessores(5678, 456, 777)

    for (i in listaDeCursos){
        println(i.toString())
    }
    println("")
}