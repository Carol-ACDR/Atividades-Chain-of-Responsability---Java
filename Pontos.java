public class Pontos extends Correntedeleitura {
  int Quantos;
 
    public Pontos(String texto) {
        super(Cleitura.Pontos);
      for (int i= 0; i < texto.length(); i++){ 
        if(texto.charAt(i) == '.')
                Quantos++;
        }
        System.out.println("Seu texto tem "+ Quantos + " Pontos ");
    }
}