public class Espaços extends Correntedeleitura {
  int Quantos;
 
    public Espaços(String texto) {
        super(Cleitura.Espaços);
      for (int i= 0; i < texto.length(); i++){ 
        if(texto.charAt(i) == ' ')
                Quantos++;
        }
        System.out.println("Seu texto tem "+ Quantos + " Espaços");
    }
}