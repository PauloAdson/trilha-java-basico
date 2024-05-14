package estudo.paulo.tiposvariaveis;

public class tiposvariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);
    }
}
