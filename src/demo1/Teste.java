
package demo1;

import java.util.Random;

public class Teste {

    public static void main(String[] args) {
Random gerador = new Random();
 
//imprime sequência de 10 números inteiros aleatórios entre 0 e 5
for (int i = 0; i < 10; i++) {
 System.out.println(gerador.nextInt(5) + 1);
}
    }
    
}
