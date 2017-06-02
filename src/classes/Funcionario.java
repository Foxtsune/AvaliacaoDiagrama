/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Autenticavel;

public class Funcionario implements Autenticavel{

    private String nome;
    private Data nascimento;
    private Endereco end;

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
     * @return the nascimento
     */
    public Data getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the end
     */
    public Endereco getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(Endereco end) {
        this.end = end;
    }

    public void mostraDados() {

    }

    void setSenha(String senha) {
        
    }

    @Override
    public void autentica(String senha) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
