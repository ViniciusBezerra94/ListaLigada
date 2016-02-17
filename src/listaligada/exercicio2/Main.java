/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada.exercicio2;

import java.util.LinkedList;

/**
 *
 * @author Vinicius
 */
public class Main {
    public static void main(String[] args)
    {
        try{
        Pessoa p1 = new Pessoa("Marcelo",32);
        Pessoa p2 = new Pessoa("Bruno",26);
        Pessoa p3 = new Pessoa("Olher",24);
        Pessoa p4 = new Pessoa("Vinicius",20);
        Pessoa p5 = new Pessoa("Fabio",50);
        Pessoa p6 = new Pessoa("Rodrigo",22);
        Pessoa p7 = new Pessoa("Gislaine",20);
        Pessoa p8 = new Pessoa("Emerson", 29);
        Pessoa p9 = new Pessoa("Jussara",87);
        
        
        LinkedList<Pessoa> listap = new LinkedList();
        InserirPessoa input = new InserirPessoa();
        input.mandaPessoaParaLista(p1, listap);
        input.mandaPessoaParaLista(p2, listap);     
        input.mandaPessoaParaLista(p3, listap);
        input.mandaPessoaParaLista(p4, listap);
        input.mandaPessoaParaLista(p5, listap);
        input.mandaPessoaParaLista(p6, listap);
        input.mandaPessoaParaLista(p7, listap);
        input.mandaPessoaParaLista(p8, listap);
        input.mandaPessoaParaLista(p9, listap);
        
            System.out.println("" + listap);
        }catch(Exception e)
        {
            System.out.println("erro ao executar --> "+ e.getMessage());
        }
        
    }
}
