public class Fila {
    private int primeiro; // primeiro elemento
    private int ultimo; // ultimo elemento
    private int dados[]; // armazenamento de dados
    private int capacidade; // tamanho da fila
    private int tamanho; // tamanho atual da fila

    public Fila(int capacidade) {
        this.capacidade = capacidade; // para ter o tamanho do vetor
        this.dados = new int[capacidade];
        this.primeiro = 0;
        this.ultimo = -1;
        this.tamanho = 0; // contador para saber quantos elementos o vetor possui
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("Fila cheia, removendo o primeiro elemento...");
            remove();
        }
        ultimo = (ultimo + 1) % capacidade; // faz a fila ser circular
        dados[ultimo] = elemento;
        tamanho++;
    }

    public boolean cheia() {
        return tamanho == capacidade;
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public void remove() {
        if (vazia()) {
            System.out.println("Fila vazia, nada a remover.");
            return;
        }
        primeiro = (primeiro + 1) % capacidade; // avança o índice do primeiro elemento
        tamanho--;
    }

    public void imprime(){
        if (vazia()){
            System.out.println("Fila vazia.");
            return;
        } else {
            System.out.println("Fila: ");
            for (int i = 0; i < tamanho; i++) {
                int indice = (primeiro + i) % capacidade;
                System.out.print(dados[indice] + " ");
            }
            System.out.println();
        }
    }
}
