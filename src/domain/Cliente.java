package domain;

import java.util.List;
public class Cliente {


    private String endereço;
    private Atendente cadastradoPor;
    private List<Pet>  pets;

    
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public Atendente getCadastradoPor() {
        return cadastradoPor;
    }
    public void setCadastradoPor(Atendente cadastradoPor) {
        this.cadastradoPor = cadastradoPor;
    }
    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    public Cliente(String endereço, Atendente cadastradoPor, List<Pet> pets) {
        this.endereço = endereço;
        this.cadastradoPor = cadastradoPor;
        this.pets = pets;
    }
    @Override
    public String toString() {
        return "Cliente [endereço=" + endereço + ", cadastradoPor=" + cadastradoPor + ", pets=" + pets
                + ", getEndereço()=" + getEndereço() + ", getCadastradoPor()=" + getCadastradoPor() + ", getPets()="
                + getPets() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }




    
}
