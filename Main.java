import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    Correntedeleitura Corrente = new Espaços(s);
    Corrente.setProximo(new Letrasa(s));
    Corrente.setProximo(new Pontos(s));
  }
}