package com.escola.cadastroescola.orm;

import javax.persistence.*;

@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int cnpj;
    @Column(nullable = false)
    private String razao_social;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private int numero_endereco;
    @Column(nullable = false)
    private int cep;
    @Column(nullable = false)
    private String uf;
    @Column(nullable = false)
    private Long numero_mec;
    @Column(nullable = false)
    private String tipo_escola;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String bairro;
    private String complemento;
    @Column(nullable = false)
    private int ddd;
    @Column(nullable = false)
    private int numero_telefone;
    @Column(nullable = false)
    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero_endereco() {
        return numero_endereco;
    }

    public void setNumero_endereco(int numero_endereco) {
        this.numero_endereco = numero_endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getNumero_mec() {
        return numero_mec;
    }

    public void setNumero_mec(Long numero_mec) {
        this.numero_mec = numero_mec;
    }

    public String getTipo_escola() {
        return tipo_escola;
    }

    public void setTipo_escola(String tipo_escola) {
        this.tipo_escola = tipo_escola;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(int numero_telefone) {
        this.numero_telefone = numero_telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
