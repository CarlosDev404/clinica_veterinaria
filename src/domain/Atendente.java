package domain;

import java.util.List;
public class Atendente extends Pessoa{

    private Double salario;
    private List<Cliente> clinetesCadastrados;


    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public List<Cliente> getClinetesCadastrados() {
        return clinetesCadastrados;
    }
    public void setClinetesCadastrados(List<Cliente> clinetesCadastrados) {
        this.clinetesCadastrados = clinetesCadastrados;
    }
    
  
    public Atendente(Integer codigo, String nome, String telefone, Double salario, List<Cliente> clinetesCadastrados) {
        super(codigo, nome, telefone);
        this.salario = salario;
        this.clinetesCadastrados = clinetesCadastrados;
    }
    @Override
    public String toString() {
        return "Atendente [codigo=" + codigo + ", nome=" + nome + ", salario=" + salario + ", telefone=" + telefone
                + ", clinetesCadastrados=" + clinetesCadastrados + ", getSalario()=" + getSalario()
                + ", getClinetesCadastrados()=" + getClinetesCadastrados() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }


    
}
