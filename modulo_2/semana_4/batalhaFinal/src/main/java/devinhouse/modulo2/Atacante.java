package devinhouse.modulo2;

public interface Atacante {
    default void atacar(Personagem alvo) {
	System.out.printf("Ataque default; instakill!%n");
	alvo.setSaude(0);
    }
}
