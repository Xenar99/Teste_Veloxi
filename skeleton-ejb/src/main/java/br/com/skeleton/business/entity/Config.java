package br.com.skeleton.business.entity;

import java.io.Serializable;
import java.util.Objects;

public class Config implements Serializable {

  private static final long serialVersionUID = 6615511541532380908L;
  private String mensagem;;


  public Config() {}


  public String getMensagem() {
    return mensagem;
  }


  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }


  @Override
  public int hashCode() {
    return Objects.hash(mensagem);
  }


  @Override
  public boolean equals(Object obj2) {
    if (this == obj2)
      return true;
    if (obj2 == null)
      return false;
    if (getClass() != obj2.getClass())
      return false;
    Config other = (Config) obj2;
    return Objects.equals(mensagem, other.mensagem);
  }

}
