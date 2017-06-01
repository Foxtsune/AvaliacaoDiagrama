/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Utilitario;

public class Engenheiro extends Funcionario implements Utilitario {

    public Engenheiro(String nome, Data nasc, Endereco end) {
        setNome(nome);
        setNascimento(nasc);
        setEnd(end);
    }

    @Override
    public void mostraDados() {
        String className = this.getClass().getSimpleName();
        System.out.println(className);
        System.out.println("Nome: " + getNome());
        System.out.println("Data: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno());
        System.out.printf("Endereco: %s %s %d\n\n", getEnd().getBairro(), getEnd().getRua(), getEnd().getNumero());
    }

}
