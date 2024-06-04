import java.util.Scanner;
/**
* <h1>Contador</h1>
* O Contador recebe dois parâmetros realizando interações com a diferença entre eles.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Hendriu Nepuz
* @version 1.0
* @since   04/06/2024
*/

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois =  terminal.nextInt();
        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem: O segundo parâmetro tem que ser maior que o primeiro
            System.out.println("O segundo parâmetro tem que ser maior que o primeiro");
        }
        terminal.close();
    }

    /**
    * Este método é utilizado para verificar o número de interações, imprimir o número da interação e tratar as exceções
    * @param parametroUm este é o primeiro parâmetro do método
    * @param parametroDois este é o segundo parâmetro do método
    * @throws ParametrosInvalidosException é uma exceção para que o segundo parâmetro seja maior que o primeiro
    */

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se o parâmetroUm é MAIOR que o parametroDois e lançar exceção
        if (parametroUm >= parametroDois)
            throw new ParametrosInvalidosException();

        //realizar o for para imprimir os números com base na vairável de contagem

        for (int i = 0; i < (parametroDois - parametroUm); i++ ) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }

}
