package ArenaDosHeróis;

public class Mago extends Personagem {
     private int mana;
     
     public Mago(String nome) {
    	 super(nome, 100, 25); // Menos vida, ataque mágico moderado
    	 this.mana = 50;
     }
     @Override
     public void atacar(Personagem oponente) {
    	 if(mana >= 10) {
    	 oponente.receberDano(this.getDanoBase() +15); // Causa dano extra com magia
    	 mana -=10;
    	 System.out.println(getNome()+ " lançou um feitiço em " + oponente.getNome() + " à distância.");
    	 }else {
    		 System.out.println(getNome() + " não tem mana suficiente para atacar!");
    	 }
     }
}
