public class ErroDeDivisaoPorZero {
    public static void main(String[] args) throws Exception {
        
        int a = 10;
        int b = 0;
        int result = 0;
        
        try {
            result = (a / b);
            System.out.println("Resultado: " + result);
        }
        catch (Exception e) {            
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        
    }
}
