import br.com.caio.CalculoHoras.Funcionario;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();

        Funcionario p1 = new Funcionario(0001,"Bruce", 100.00, 10,5);
        Funcionario p2 = new Funcionario(0002,"Barry", 50.00, 8,4);
        Funcionario p3 = new Funcionario(0003,"Diana", 30.00, 6,3);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        p1.calculaHorasE();
        p2.calculaHorasE();
        p3.calculaHorasE();

        p1.calculaHorasT();
        p2.calculaHorasT();
        p3.calculaHorasT();


        p1.maiorSalario(p2).imprimir();
        p1.maiorSalario(p3).imprimir();
        p2.maiorSalario(p3).imprimir();

        if(lista.get(0).getHorasExtras() > lista.get(1).getHorasExtras() &&
                lista.get(0).getHorasExtras() > lista.get(2).getHorasExtras() ){
             lista.get(0).imprimir();
        } else if (lista.get(1).getHorasExtras() > lista.get(2).getHorasExtras()) {
            lista.get(1).imprimir();
        } else{
            lista.get(2).imprimir();
        }

    }
}