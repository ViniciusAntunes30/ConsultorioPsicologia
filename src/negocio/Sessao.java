/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Calendar;

/**
 *
 * @author Vinicius
 */
public class Sessao {

    
    
  private int idSessao;
  private Calendar DATA;
  private String queixas_paciente ;
  private String plano_tratamento;
  private String diagnostico_final;
  private String resumo_sessao;
  private int evolucao;
  private String pago ;
  private int idAnamnese;  
  
  public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public Calendar getDATA() {
        return DATA;
    }

    public void setDATA(Calendar DATA) {
        this.DATA = DATA;
    }

    public String getQueixas_paciente() {
        return queixas_paciente;
    }

    public void setQueixas_paciente(String queixas_paciente) {
        this.queixas_paciente = queixas_paciente;
    }

    public String getPlano_tratamento() {
        return plano_tratamento;
    }

    public void setPlano_tratamento(String plano_tratamento) {
        this.plano_tratamento = plano_tratamento;
    }

    public String getDiagnostico_final() {
        return diagnostico_final;
    }

    public void setDiagnostico_final(String diagnostico_final) {
        this.diagnostico_final = diagnostico_final;
    }

    public String getResumo_sessao() {
        return resumo_sessao;
    }

    public void setResumo_sessao(String resumo_sessao) {
        this.resumo_sessao = resumo_sessao;
    }

    public int getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(int evolucao) {
        this.evolucao = evolucao;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public int getIdAnamnese() {
        return idAnamnese;
    }

    public void setIdAnamnese(int idAnamnese) {
        this.idAnamnese = idAnamnese;
    }
  
    
}
