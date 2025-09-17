public class Calculadora3D {

    private double precoRoloFilamento;
    private double pesoRoloFilamento;
    private double pesoPeca;
    private double tempoImpressao;
    private static final double CONSUMO_MAQUINA = 0.16; // kW/h
    private static final double CONSUMO_ENERGIA = 0.23; // $CAD/kW/h
    private double tempoProcesso;
    private double valorHoraTrabalho;
    private static final double MANUTENCAO_MAQUINA = 0.2; // $CAD/h
    private static final double MARGEM_LUCRO_B2B = 3.0; // 200%
    private static final double MARGEM_LUCRO_B2C = 5.0; // 400%
    private double custoTotalCalculado;



    public Calculadora3D(double precoRoloFilamento, double pesoRoloFilamento, double pesoPeca, double tempoImpressao, double tempoProcesso, double valorHoraTrabalho) {
        this.precoRoloFilamento = precoRoloFilamento;
        this.pesoRoloFilamento = pesoRoloFilamento;
        this.pesoPeca = pesoPeca;
        this.tempoImpressao = tempoImpressao;
        this.tempoProcesso = tempoProcesso;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.custoTotalCalculado = realizarCalculoDoCusto();
    }

    private double calcularCustoMaterial(){
        return (pesoPeca / pesoRoloFilamento) * precoRoloFilamento;
    }

    private double calcularCustoEnergia(){
        return tempoImpressao * CONSUMO_MAQUINA * CONSUMO_ENERGIA;
    }

    private double calcularCustoMaoDeObra(){
        return tempoProcesso * valorHoraTrabalho;
    }

    private double realizarCalculoDoCusto(){
        return calcularCustoMaterial() + calcularCustoEnergia() + calcularCustoMaoDeObra() + MANUTENCAO_MAQUINA;
    }

    public double calcularCustoTotal(){
        return this.custoTotalCalculado;
    }

    public double calcularB2B(){
        return this.calcularCustoTotal() * MARGEM_LUCRO_B2B;
    }

    public double calcularB2C(){
        return this.calcularCustoTotal() * MARGEM_LUCRO_B2C;
    }




}
