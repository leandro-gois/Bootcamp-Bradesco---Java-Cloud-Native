public class ConsultaEstadoBrasileiro {

    public static void main(String[] args) {
        for (EstadoBrasieiro e: EstadoBrasieiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());            
        }
    }

}
