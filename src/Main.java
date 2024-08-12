public class Main {
    public static void main(String[] args){
        Fila fila = new Fila(4);

        fila.insere(10);
        fila.insere(20);
        fila.insere(30);
        fila.insere(40);

        fila.imprime();

        fila.insere(50);

        fila.imprime(); // Saída esperada: Fila: 20 30 40 50

        fila.insere(60);

        fila.imprime(); // Saída esperada: Fila: 30 40 50 60
    }
}
