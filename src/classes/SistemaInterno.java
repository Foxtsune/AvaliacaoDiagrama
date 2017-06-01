/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import interfaces.Autenticavel;


public class SistemaInterno {
 
    public void login(Autenticavel a, String senha){
        a.autentica(senha);
    }
    
}