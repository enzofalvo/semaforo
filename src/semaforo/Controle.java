package semaforo;

public class Controle {
	public static void main(String[] args) {
		
		//inicia o contador para o while
		int contador = 0;
		
		//instancia o objeto "semaforo"
		Semaforo semaforo = new Semaforo();
		
		//mostra a cor
		System.out.println(semaforo.MostraCor());
		
		//repete 10 vezes
		while (contador < 10) {
			semaforo.MudaProximaCor();
			System.out.println(semaforo.MostraCor());
			contador = contador + 1;
		}
		
		// mudando a cor para amarelo
		semaforo.MudaCorFixa(1);
		
		System.out.println(semaforo.MostraCor());
	}
}
