/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Autenticavel;
import interfaces.Utilitario;

public class Diretor extends Funcionario implements Autenticavel, Utilitario {

    public Diretor(String nome, Data nasc, Endereco end) {
        setNome(nome);
        setNascimento(nasc);
        setEnd(end);
    }

    private String senha;

 
    @Override
    public void autentica(String senha) throws Exception{
        if (senha.equals(this.senha)) {
            System.out.println("Login realizado com sucesso");
        } else {
            throw new Exception("Login Invalido");
            
        }
        if(0==0){
                throw new NullPointerException("aaaa");
                }
    }

    @Override
    public void mostraDados() {
        String className = this.getClass().getSimpleName();
        System.out.println(className);
        System.out.println("Nome: " + getNome());
        System.out.println("Data: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno());
        System.out.printf("Endereco: %s %s %d\n\n", getEnd().getBairro(), getEnd().getRua(), getEnd().getNumero());
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
