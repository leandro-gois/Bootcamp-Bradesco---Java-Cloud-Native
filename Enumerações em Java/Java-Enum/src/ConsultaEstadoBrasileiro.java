public class ConsultaEstadoBrasileiro {

    public static void main(String[] args) {
        
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getNome() + " - " + e.getSigla());      
        }
        
        EstadoBrasileiro eb = EstadoBrasileiro.DISTRITO_FEDERAL;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());  
        System.out.println(eb.getNomeMaiusculo());
   
    }

    
}
