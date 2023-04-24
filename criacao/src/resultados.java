import java.util.Scanner;

public class resultados {

    public static void main(String[] args) {
 
        System.out.println("Exercício calculadora");
            calculadora.soma(3, 6);
            calculadora.subtracao(9, 1.8);
            calculadora.multiplicacao(7, 8);
            calculadora.divisao(5, 2.5); 

        Scanner novoScan = new Scanner(System.in);

        double montante = 0;
        double juros = 0.025;
        double parcelas = 0;
        String respostas;

        System.out.println("Qual será o valor do empréstimo?");
            montante = novoScan.nextInt();
           
        System.out.println("O valor que do empréstimo é " + montante + "?");
            respostas = novoScan.next();
                if (respostas == "Não"){
                    System.out.println("Qual será o valor do empréstimo?");
                        montante = novoScan.nextInt();
                            novoScan.close();
                }

        System.out.println("Quantas vezes deseja dividir?");
            parcelas = novoScan.nextInt();
        
        System.out.println("Você deseja dividir em " + parcelas + "parcelas?");
            respostas = novoScan.next();
                if (respostas.equals ("Não")){
                    System.out.println("Quantas vezes deseja dividir?");
                        parcelas = novoScan.nextInt();
                            novoScan.close();
                }
                
        System.out.println("O valor da parcela será de " + emprestimo.taxar(montante, juros, parcelas) + " ao mês.");
        System.out.println("O valor total a pagar será de " + emprestimo.calcularTotal(montante, juros, parcelas));
    }
}
