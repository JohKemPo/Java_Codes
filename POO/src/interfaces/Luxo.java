package interfaces;

public interface Luxo {
    public void ligarAr();
	abstract void desligarAr();// classe abstrata
	
	default int velocidadeDoAr() {
		return 1;
	}
}
