import java.util.Arrays;
import java.util.List;

public class LambdaERefenceMethod {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3);

        //metodo de referencia
        numeros.forEach(System.out::println);

        //lambda expression in line
        numeros.forEach(n -> System.out.println(n));

        //lambda expression in block
        numeros.forEach(n -> {
            System.out.println(n);
        });
        
    }

}
