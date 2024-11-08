package ArenaDosHeróis;

public abstract class Personagem {
	private String nome;
	private int vida;
	private int danoBase;
	private int posição;
	
	public Personagem (String nome, int vida, int danoBase) {
		this.nome = nome;
		this.vida = vida;
		this.danoBase = danoBase;
		this.posição = 0; // Posição inicial
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDanoBase() {
		return danoBase;
	}

	public void setDanoBase(int danoBase) {
		this.danoBase = danoBase;
	}

	public int getPosição() {
		return posição;
	}

	public void setPosição(int posição) {
		this.posição = posição;
	}
    public void mover(int novaPosição) {
    	this.posição = novaPosição;
    	System.out.println(nome + " se moveu para a posição " + novaPosição);
    }
    
    public abstract void atacar(Personagem oponente);
    
    //Método para reduzir a vida do personagem ao ser atacado
    public void receberDano(int dano) {
    	vida -= dano;
    	if (vida < 0) {
    	vida = 0;
    }
    System.out.println(nome + " recebeu" + dano + " de dano. Vida restante: " + vida);
    }
   
    //Método para calcular a distância entre este personagem e outro
    public int calcularDistancia(Personagem oponente) {
    	return Math.abs(this.posição - oponente.getPosição());
    
    }
       
}
