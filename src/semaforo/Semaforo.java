package semaforo;

public class Semaforo {
	private int cor = 2;

	public void MudaProximaCor() {
		if (cor == 0) {
			cor = 1;
		}
		else if (cor == 1) {
			cor = 2;
		}
		else if (cor == 2) {
			cor = 0;
		}
	}
	
	public void MudaCorFixa(int corFornecida) {
		this.cor = corFornecida;
	}
	
	public int MostraCor() {
		return cor;
	}
}
