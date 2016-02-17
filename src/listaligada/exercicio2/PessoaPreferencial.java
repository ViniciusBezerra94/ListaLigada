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
public class PessoaPreferencial {
    public void mandaPessoaParaPreferencial(LinkedList<Pessoa> pessoa)
    {
        boolean troca = true;
        Pessoa aux = new Pessoa();
        while (troca) {
            troca = false;
            for (int i = 0; i < pessoa.size() - 1; i++) {
                if (pessoa.get(i).getIdade() < pessoa.get(i + 1).getIdade()) {
                    aux = pessoa.get(i);
                    pessoa.set(i, pessoa.get(i+1));
                    pessoa.set(i+1, aux);

                    troca = true;
                }
            }
        }
    }
}
