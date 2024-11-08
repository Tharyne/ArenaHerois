package ArenaDosHeróis;

public class Arqueiro extends Personagem{
	

	public Arqueiro (String nome) {
		super (nome, 80, 20);
	}
	@Override
	public void atacar (Personagem oponente) {
		oponente.receberDano(this.getDanoBase());
		System.out.println(getNome()+"disparou a flecha em"+oponente.getNome()+"a distancia");
}
}
