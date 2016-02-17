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


public class InserirPessoa {
    public void mandaPessoaParaLista(Pessoa gente, LinkedList<Pessoa> listap)
    {
        listap.getLast();
        
        PessoaPreferencial preferencial = new PessoaPreferencial();
        if(!listap.isEmpty())
        {
            
            if(gente.getIdade() <= listap.get(listap.size()-1).getIdade())
            {
                listap.addLast(gente);
            }else{
                if(listap.size() >= 2 ){
                        listap.add(listap.size()-2, gente);
                        preferencial.mandaPessoaParaPreferencial(listap);
                }else
                {
                    listap.add(gente);
                }
            }
        }else
        {
            listap.add(gente);
        }

    } 
}
