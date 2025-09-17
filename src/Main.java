import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        double precoRoloFilamento; // CAD
        double pesoRoloFilamento; // g
        double pesoPeca; // g
        double tempoImpressao; // horas
        double tempoProcesso; // horas
        double valorHoraTrabalho; // CAD/h


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do rolo de filamento (CAD): ");
        precoRoloFilamento = scanner.nextDouble();
        System.out.print("Digite o peso do rolo de filamento (g): ");
        pesoRoloFilamento = scanner.nextDouble();
        System.out.print("Digite o peso da peça (g): ");
        pesoPeca = scanner.nextDouble();
        System.out.print("Digite o tempo de impressão (horas): ");
        tempoImpressao = scanner.nextDouble();
        System.out.print("Digite o tempo de processo (horas): ");
        tempoProcesso = scanner.nextDouble();
        System.out.print("Digite o valor da hora de trabalho (CAD/h): ");
        valorHoraTrabalho = scanner.nextDouble();

        Calculadora3D calculadora = new Calculadora3D(precoRoloFilamento, pesoRoloFilamento, pesoPeca, tempoImpressao, tempoProcesso, valorHoraTrabalho);

        System.out.println("Custo Total: " + calculadora.calcularCustoTotal());
        System.out.println("Preço B2B: " + calculadora.calcularB2B());
        System.out.println("Preço B2C: " + calculadora.calcularB2C());
    }
}