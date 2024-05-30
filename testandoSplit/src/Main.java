public class Main {
    public static void main(String[] args) {
        String palavraNaoSeparada = "Renan,13/08/2004,19";

        String[] partes = palavraNaoSeparada.split(",");

        System.out.println("Nome: " + partes[0]);
        System.out.println("Aniversário: " + partes[1]);
        System.out.println("Idade: " + partes[2]);

    }
}