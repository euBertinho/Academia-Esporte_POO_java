public class Main {
  public static void main(String[] args) {
   Esporte e1 = new Esporte("Ciclismo","15hrs",100);
   Esporte e2 = new Esporte("Cross","18hrs",150);
   Academia a1 = new Academia("Fortinho","Abel Cabral");
  
    a1.inserir(e1);
    a1.inserir(e2);

    System.out.println(a1.toString());
    a1.listar();
    System.out.println("Média mensal nesta academia é de " +     
    "R$:" + a1.mediamensal());
    
    
  }
}