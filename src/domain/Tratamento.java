package domain;
import java.util.List;

public class Tratamento {

    private Integer codigo;
    private String descricao;
    private Veterinario iniciadoPor;
    private List<Consulta> consultas;
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Veterinario getIniciadoPor() {
        return iniciadoPor;
    }
    public void setIniciadoPor(Veterinario iniciadoPor) {
        this.iniciadoPor = iniciadoPor;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    public Tratamento(Integer codigo, String descricao, Veterinario iniciadoPor, List<Consulta> consultas) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.iniciadoPor = iniciadoPor;
        this.consultas = consultas;
    }
    @Override
    public String toString() {
        return "Tratamento [codigo=" + codigo + ", descricao=" + descricao + ", iniciadoPor=" + iniciadoPor
                + ", consultas=" + consultas + ", getCodigo()=" + getCodigo() + ", getDescricao()=" + getDescricao()
                + ", getIniciadoPor()=" + getIniciadoPor() + ", getConsultas()=" + getConsultas() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }


    
}