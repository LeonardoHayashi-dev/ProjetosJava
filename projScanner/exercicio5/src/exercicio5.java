import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        double pe, cent, milha, jarda, poleg;
        Scanner ler;
        ler = new Scanner(System.in);

        System.out.println("Coloque a medida em pés");
        pe = ler.nextDouble();

        poleg = pe * 12 ;
        jarda = pe / 3;
        milha = pe / 5280;
        cent = pe * 30.48 ;
        String milhaconvert = String.format("%.4f", milha);
        String jardaconvert = String.format("%.4f", jarda);

        System.out.println("A medida em polegadas é: " + poleg);
        System.out.println("A medida em jarda é: " + jardaconvert);
        System.out.println("A medida em milha é: " + milhaconvert);
        System.out.println("A medida em centimetros é: " + cent);


    }
}
