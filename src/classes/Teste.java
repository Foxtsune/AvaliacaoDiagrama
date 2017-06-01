/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

public class Teste {
    public static void main(String[] args) {
        
        //Engenheiro
        Data enasc = new Data(5, 10, 2017);
        Endereco eend = new Endereco("jardim", "centro", 10);
        Funcionario eng = new Engenheiro("julio", enasc, eend);
        eng.mostraDados();
        //Diretor
        Data dnasc = new Data(5, 10, 2017);
        Endereco dend = new Endereco("jardim", "centro", 10);
        Funcionario dir = new Diretor("santos", dnasc, dend);
        dir.mostraDados();
        dir.setSenha("a");
        SistemaInterno ds = new SistemaInterno();
        ds.login(dir, "a");
        //Gerente
        Data gnasc = new Data(5, 10, 2017);
        Endereco gend = new Endereco("jardim", "centro", 10);
        Funcionario ger = new Gerente("pelucio", enasc, eend);
        ger.mostraDados();
        ger.setSenha("b");
        SistemaInterno gs = new SistemaInterno();
        ds.login(ger, "a");
        //Cliente
        Data fnasc = new Data(5, 10, 2017);
        Endereco fend = new Endereco("jardim", "centro", 10);
        Funcionario func = new Gerente("fox", enasc, eend);
        func.mostraDados();
        func.setSenha("c");
        SistemaInterno fs = new SistemaInterno();
        fs.login(func, "c");
        
    }

}
