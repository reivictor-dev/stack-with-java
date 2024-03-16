import java.util.Random;

public abstract class StackDefault {
    private int tamanho;
    private int topo;
    private int[] pilha;

    public StackDefault(int tam) {
        this.tamanho = tam;
        this.topo = -1;
        this.pilha = new int[tam];
    }

    public boolean full() {
        return this.topo == this.tamanho - 1;
    }

    public int quantidade() {
        return this.topo + 1;
    }

    public boolean isVazia() {
        return quantidade() == 0;
    }

    public int[] populate() {

        for (int i = 0; i < pilha.length; i++) {
            Random rand = new Random();
            int nMax = 15;
            int valor = rand.nextInt(nMax);

            this.topo += 1;
            this.pilha[i] = valor;

        }

        return pilha;
    }

    public boolean push(int value) {
        if (!this.full()) {
            this.topo += 1;
            this.pilha[this.topo] = value;

            return true;
        } else {
            return false;
        }

    }

    public int pop() {

        int nRemoved = -1;

        if (!this.isVazia()) {
            nRemoved = pilha[topo];
            this.topo--;
        }

        return nRemoved;
    }

    public String printStack() {
        String retorno = "";

        if (this.isVazia()) {
            return "A pilha está vazia";
        }

        retorno += "A pilha tem ";
        for (int i = 0; i <= this.topo; i++) {
            retorno += this.pilha[i] + " ";
        }

        return retorno;
    }

    public int[] getPilha() {
        return this.pilha;
    }

    public boolean verifyGame(Stack stack1, Stack stack2) {
        int[] pilha1 = stack1.getPilha();
        int[] pilha2 = stack2.getPilha();

        for (int i = 0; i < Math.min(pilha1.length, pilha2.length); i++) {
            if (pilha1[i] > pilha2[i]) {
                return false;
            }
        }
        return true;
    }

}
