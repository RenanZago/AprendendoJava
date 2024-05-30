import java.util.Arrays;

public class Stack {
    private int numberElements;
    private int[] elements;
    private int top;

    public Stack(int numberElements) {
        this.numberElements = numberElements;
        this.top = -1;
        this.elements = new int[numberElements];
    }

    public Result empilhar(int element){
        if (estaCheia()){
            return new Result(false);
        }
        else {
            top++;
            elements[top] = element;
            return new Result(true, element);
        }
    }

    public Result desempilhar(){
        if (estaVazia()){
            return new Result(false);
        }
        else {
            top--;
            return new Result(true, elements[top+1]);

        }

    }

    public boolean estaVazia(){
        return top == -1;
    }

    public boolean estaCheia(){
        return top+1 == numberElements;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "numberElements=" + numberElements +
                ", elements=" + Arrays.toString(elements) +
                ", top=" + top +
                '}';
    }
}
