// methods
public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 2;
        double a1 = 4.5;
        double b1 = 4.6;
        System.out.println(add(a,b,c));
    }

    /* modificadorDeAcesso tipoRetorno nomeDoMetodo(parâmetros) {
        // corpo do método
    } */

    static int add(int x, int y) {
        return x + y;
    }
    static double add(double x, double y) {
        return x + y;
    } // Sobrecarga de métodos por tipo

    static int add(int x, int y, int z) {
        return x + y + z;
    } // Sobrecarga por n° de parametros



}