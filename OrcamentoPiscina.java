import java.util.Scanner;

public class  OrcamentoPiscina {
    public static void main(String[] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Vamos iniciar o seu orçamento? Cobramos R$ 100 por metro cubico. Informe a largura da piscina: ");
        double largura = sc.nextDouble();

        System.out.println("Agora informe o comprimento da piscina: ");
        double comprimento = sc.nextDouble();

        System.out.println("Agora informe a profundidade da piscina:");
        Double profundidade = sc.nextDouble();

        Double volume = largura * comprimento * profundidade;
        
        Double orcamento = volume * 100.0;

        System.out.println("O orcamento para sua piscina seria de R$" + orcamento);

        sc.close();

    }
}