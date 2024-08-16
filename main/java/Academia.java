import java.util.ArrayList;

public class Academia{
  private String nome;
  private String endereco;
  private ArrayList <Esporte> esportes = new ArrayList<>();

  public Academia(String nome, String endereco){
  this.nome = nome;
  this.endereco = endereco;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public ArrayList<Esporte> getEsportes() {
    return esportes;
  }

  public void setEsporte(ArrayList<Esporte> esportes) {
    this.esportes = esportes;
  }

  public void inserir(Esporte esporte){
    this.esportes.add(esporte);
  }

  public void listar(){
    if (esportes.isEmpty()){
      System.out.println("Não tem nenhum esporte!");
    }else{
      System.out.println("Esportes: ");
      for (Esporte esporte : esportes){
        System.out.println("- " + esporte);
        System.out.println();
      }
    }
  }

  public double mediamensal(){
    // double media = 0;    //Média fica feio, somar os 2 e dar o total gasto por                                 todos é melhor
    // for (int i = 0; i < esportes.size(); i++){
    //    media = esportes.size() / esportes.get(i).getMensalidade();
    double media = 0;
    for(int i = 0; i < esportes.size(); i++){
     media = media + esportes.get(i).getMensalidade();
    }
    return media;
  }

  @Override
  public String toString(){
    return "Academia: " + nome + "\n" +
           "Local: " + endereco + "\n";
  }
}