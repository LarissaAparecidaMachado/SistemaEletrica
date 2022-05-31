package br.univille.sistemabillyepantcho.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class OrdemDeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date data;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private Cliente cliente;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private Veiculo veiculo;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrdemDeServico_id")
    private List<ItensOrdemDeServico> listaDeServico = new ArrayList<>();
    

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public List<ItensOrdemDeServico> getItensDeServico() {
        return listaDeServico;
    }
    public void setItensDeServico(ArrayList<ItensOrdemDeServico> itensDeServico) {
        this.listaDeServico = itensDeServico;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
