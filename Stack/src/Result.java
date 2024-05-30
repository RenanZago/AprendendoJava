public class Result {
    private boolean sucesso;
    private int x;

    public Result(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public Result(boolean sucesso, int x) {
        this.sucesso = sucesso;
        this.x = x;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public int getX() {
        return x;
    }

}
