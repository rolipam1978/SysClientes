
import java.sql.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiro
 */
public class ClientesBean {
    
    // Cadastro de Clientes
    private Integer id_cliente;             // Integer Not Null
    private Date data_cadastro;             // Date Not Null
    private String nome;                    // Varchar (100) Not Null
    private String sexo;                    // Char(1) - (M ; F) Not Null
    private String email;                   // Varchar (100) Null
    private String telefone;                // Varchar (20) Null
    private String celular;                 // Varchar (20) Null
    private String estado;                  // Char (2) - (BA ; RJ ; SP ; etc) Null
    private String cidade;                  // Varchar (100) Null
    private String cep;                     // Varchar (15) Null
    private String empresa;                 // Varchar (100) Null
    private String fax;                     // Varchar (20) Null
    
    // Histórico de Licenças
    private Integer id_licenca;             // Integer Not Null
    private String software;                // Varchar (100) Not Null
    private String tipo_licenca;            // Varchar (5) - (TRIAL ; FULL) - Not Null
    private String cod_ativacao;            // Varchar (100) Null
    private Date data_ativacao;             // Date Null
    private String reativacao;              // Char (1) - (S ; N) Not Null
    private String motivo_reativacao;       // Varchar (100) Null

    /**
     * @return the id
     */
    public Integer getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id the id to set
     */
    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the data_cadastro
     */
    public Date getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the software
     */
    public String getSoftware() {
        return software;
    }

    /**
     * @param software the software to set
     */
    public void setSoftware(String software) {
        this.software = software;
    }

    /**
     * @return the tipo_licenca
     */
    public String getTipo_licenca() {
        return tipo_licenca;
    }

    /**
     * @param tipo_licenca the tipo_licenca to set
     */
    public void setTipo_licenca(String tipo_licenca) {
        this.tipo_licenca = tipo_licenca;
    }

    /**
     * @return the cod_ativacao
     */
    public String getCod_ativacao() {
        return cod_ativacao;
    }

    /**
     * @param cod_ativacao the cod_ativacao to set
     */
    public void setCod_ativacao(String cod_ativacao) {
        this.cod_ativacao = cod_ativacao;
    }

    /**
     * @return the data_ativacao
     */
    public Date getData_ativacao() {
        return data_ativacao;
    }

    /**
     * @param data_ativacao the data_ativacao to set
     */
    public void setData_ativacao(Date data_ativacao) {
        this.data_ativacao = data_ativacao;
    }

    /**
     * @return the reativacao
     */
    public String getReativacao() {
        return reativacao;
    }

    /**
     * @param reativacao the reativacao to set
     */
    public void setReativacao(String reativacao) {
        this.reativacao = reativacao;
    }

    /**
     * @return the motivo_reativacao
     */
    public String getMotivo_reativacao() {
        return motivo_reativacao;
    }

    /**
     * @param motivo_reativacao the motivo_reativacao to set
     */
    public void setMotivo_reativacao(String motivo_reativacao) {
        this.motivo_reativacao = motivo_reativacao;
    }

    /**
     * @return the id_licenca
     */
    public Integer getId_licenca() {
        return id_licenca;
    }

    /**
     * @param id_licenca the id_licenca to set
     */
    public void setId_licenca(Integer id_licenca) {
        this.id_licenca = id_licenca;
    }
}
