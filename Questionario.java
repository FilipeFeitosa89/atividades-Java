import java.util.Scanner;

public class Questionario {

    public static void main(String[] args) {

        // declaração das variáveis.
        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        int idadeRuim = 0;
        int otimo = 0, bom = 0, regular = 0, ruim = 0, pessimo = 0;
        int i = 1;
        String conceito;
        
        // entrada de dados do questionário
        while (i <= 40) {
            try {
                System.out.println("Por favor responda esse questinário sobre o filme!");
                System.out.println("Qual a sua idade?");
                idade = leitor.nextInt();
                System.out.println("Qual sua opinião sobre o filme?");
                System.out.println("A = Ótimo / B = Bom / C = Regular / D = Ruim / E = Péssimo");
                conceito = leitor.next();
                    switch (conceito) {
                        case "A":
                            otimo++;
                            break;
                        
                        case "B":
                            bom++;
                            break;
                                        
                        case "C":
                            regular++;
                            break;
                
                        case "D":
                            ruim++; idadeRuim += idade;// somatória das idades de quem respondeu "Ruim".
                            break;
                        
                        case "E":
                            pessimo++;
                            break;

                        default:
                            System.out.println("Digite um conceito válido!");
                            continue;//    
                    }

                    i++;// somatória da contagem das respostas.

                } catch (Exception e) {
                    System.out.println("Erro! Digite novamente!");
                    leitor.nextLine();
                    // inclusão do método necessária para evitar repetições indefinidas.
                }// fim do try/catch.
            }// fim do while.

        // quantidade de respostas "ótimo".
        System.out.println("Quantidade de respostas 'Ótimo'= " + otimo);
        
        // média das idades das pessoas que responderam "ruim".
        if (ruim > 0) {
            double mediaIdade = (idadeRuim/ruim);
            System.out.println("A média das idades das pessoas que responderam 'Ruim'= " + mediaIdade);
        } else {
            System.out.println("Não houve nenhuma resposta 'Ruim'");
        }// fim do if/else.
       
        // porcentagem de respostas "péssimo".
        double porcentagemPessimo = ((double) pessimo / 40) * 100;
        System.out.println("A porcentagem de respostas 'Péssimo'= " + porcentagemPessimo);

    }// fim do main.
}// fim da classe.