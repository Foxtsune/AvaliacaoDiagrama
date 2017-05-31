/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import interfaces.Autenticavel;
import interfaces.Utilitario;


public class Diretor extends Funcionario implements Autenticavel, Utilitario{
    String senha;

    @Override
    public void autentica(String senha) {
        if(senha.equals(this.senha)){
            System.out.println("Login realizado com sucesso");
        }else{
            System.out.println("Senha invalida");
        }
    }

    @Override
    public void mostraDados() {
        
    }
}
