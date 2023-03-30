public class Letrasa extends Correntedeleitura {
  int Quantos;
 
    public Letrasa(String texto) {
        super(Cleitura.Letrasa);
      for (int i= 0; i < texto.length(); i++){ 
        if(texto.charAt(i) == 'a')
                Quantos++;
        }
        System.out.println("Seu texto tem "+ Quantos + " Letras 'a' ");
    }
}