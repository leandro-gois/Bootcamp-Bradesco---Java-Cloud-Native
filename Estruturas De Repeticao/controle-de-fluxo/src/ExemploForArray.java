public class ExemploForArray {

    public static void main(String[] args) {
        String alunos [] = {"João", "Maria", "José", "Pedro", "Ana"};
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno do indice i = " + i + " é: " + alunos[i]);
        }

        System.out.println("\nUtilizando o for each\n");

        // Enhanced for loop
        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
    }
}
