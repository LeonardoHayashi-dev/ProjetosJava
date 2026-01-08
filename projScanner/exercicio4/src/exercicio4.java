import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        int dist, time, velMed;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("insira a distancia em km");
        dist = ler.nextInt();

        System.out.println("insira o tempo em horas");
        time = ler.nextInt();

        velMed = (dist / time);

        System.out.println("a velocidade media é de: " + velMed);



    }
}
