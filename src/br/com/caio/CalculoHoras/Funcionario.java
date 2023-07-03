package br.com.caio.CalculoHoras;

public class Funcionario {
    private int matricula;
    private String nome;

    private double valorHora;

    private double horasTrabalhadas;

    private double horasExtras;

    public Funcionario(int m, String n, double vH, double hT, double hE) {
        this.matricula = m;
        this.nome = n;
        this.valorHora = vH;
        this.horasTrabalhadas = hT;
        this.horasExtras = hE;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void acrescentaHoras(double h){
        horasTrabalhadas += h;
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
    }

    public void horasExtras(double he){
        horasExtras += he;
        System.out.println("Horas Extras: " + horasExtras);
    }

    public double calculaHorasE(){
        return horasExtras * 0.85;
    }

    public double calculaHorasT(){
        return valorHora * horasTrabalhadas;
    }

    public Funcionario maiorSalario(Funcionario t){
        double f1 = this.calculaHorasT() + this.calculaHorasE();
        double f2 = t.calculaHorasT() + t.calculaHorasE();

        if(f1 > f2){
            return this;
        } else{
            return t;
        }

    }

    public void imprimir(){
        System.out.println("""
                Matricula = %d
                Nome = %s;
                Valor Hora = %.2f;
                Horas Trabalhadas = %.2f;
                Horas Extras = %.2f
                """.formatted(matricula, nome, valorHora, horasTrabalhadas, horasExtras));
    }

}
