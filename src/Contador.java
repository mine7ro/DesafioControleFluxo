import java.util.Scanner;

// Exceção personalizada para parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Correção aqui
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Correção aqui

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) { // Correção aqui
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close(); // Fechar o Scanner após o uso
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção se necessário
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println(i);
        }
    }
}
