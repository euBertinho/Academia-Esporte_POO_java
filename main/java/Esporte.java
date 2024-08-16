public class Esporte{
  private String nome;
  private String horarios;
  private double mensalidade;

  public Esporte(String nome, String horarios, double mensalidade){
    this.nome = nome;
    this.horarios = horarios;
    this.mensalidade = mensalidade;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getHorarios() {
    return horarios;
  }

  public void setHorarios(String horarios) {
    this.horarios = horarios;
  }

  public double getMensalidade() {
    return mensalidade;
  }

  public void setMensalidade(double mensalidade) {
    this.mensalidade = mensalidade;
  }

  @Override
  public String toString(){
    return nome + "\n" +
           "• Horarios: " + horarios + "\n" +
           "• Mensalidade R$:" + mensalidade + "0";
  }
}