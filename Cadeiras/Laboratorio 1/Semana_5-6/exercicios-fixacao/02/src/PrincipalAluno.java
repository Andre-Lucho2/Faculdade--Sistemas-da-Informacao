public class PrincipalAluno {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Brandamente Brasil", 1585258, 5.0, 9.0);
        Aluno aluno2 = new Aluno("Radigunda Cercená", 2254879, 8.0, 2.0);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", 85994,7.0, 1.0);

        
        aluno2.setNotaA(9);
                
        double novoNotaB_aluno2 = Teclado.leDouble("Digite novo Grau B para Radigunda: ");
        aluno2.setNotaB(novoNotaB_aluno2);
        
        aluno1.setMatricula(1585228);
        
        System.out.println(aluno2.calculaMediaFinal());
        System.out.println(aluno3.getMatricula());
        
        aluno1.imprimeInfo();
        aluno2.imprimeInfo();
        aluno3.imprimeInfo();
    }
}

// Em Java, qualquer literal inteiro que começa com 0 é interpretado como um número octal (base 8) — não decimal. O problema é que os dígitos 8 e 9 não existem no sistema octal, que usa apenas os dígitos 0–7. Isso torna 0085994 um literal octal inválido, causando o erro do compilador