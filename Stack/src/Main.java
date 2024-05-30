public class Main {
    public static void main(String[] args) {
        Stack pilha1 = new Stack(3);
        pilha1.empilhar(1);
        pilha1.empilhar(2);

        System.out.println(pilha1);

        System.out.println(pilha1.desempilhar().getX());
        System.out.println(pilha1);




    }
}