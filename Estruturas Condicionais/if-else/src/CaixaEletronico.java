public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 666.6;
        double valorSolicitado = 100.0;

        if (valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

}
