/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *Nesta aula devemos trabalhar com API para resolução dos exercicios abaixo:

1o. Criar um programa que crie uma lista e permita ao usuário escolher entre as várias opções de um menu, listadas da seguir, para operações com a lista.

- Inserir elemento no início da lista
- Inserir elemento no final da lista
- Inserir elemento em uma determinada posição da lista
- Mostrar um elemento de determinada posição da lista
- Mostrar a posição de um determinado elemento
- Mostrar e excluir o primeiro elemento da lista
- Mostrar e excluir o último elemento da lista
- Mostrar e excluir o elemento de determinada posição da lista
- Mostrar e excluir determinado elemento da lista
- Substituir por outro o elemento de determinada posição da lista
- Mostrar todos os elementos da lista
- Remover todos os elementos da lista
Dica: Voce pode utilizar qualquer interface grafica para montar a programa.

 

 

 

2o. Implemente uma rotina para criar uma lista ligada de pessoas que deve ser adicionadas na lista conforme regras abaixo:

Classe ListaDePessoa()

- Crie o método mandaPessoaParaLista() para quando a IDADE da pessoa for MENOR ou IGUAL ao ultimo da lista, deve-se adicionar no final, porém se a IDADE da pessoa for MAIOR, deve-se adicionar ANTES DO ULTIMO, porem voce deve usar o metodo abaixo.
- Crie o método mandaPessoaParaPreferencial() onde voce deve reposicionar a pessoa na LISTA conforme sua idade. Começando das pessoas mais velhos para os mais novos .
- Crie o método ImprimeListas() que deve imprimir o conteúdo de cada uma.
 

A classe Pessoa deve conter os seguintes atributos:

-Nome
-Idade
Lembre-se de criar a Classe principal para executar sua rotina.
 * @author Vinicius - 239547
 */
public class ListaLigada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList();
        Scanner entrada = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int opc = 0;
        boolean looping = true;
        System.out.println("Escolha uma das opçoes:\n"
                + "opção 0 = sair\n"
                + "opçao 1 = Inserir elemento no início da lista\n"
                + "opção 2 = Inserir elemento no final da lista\n"
                + "opção 3 = Inserir elemento em uma determinada posição da lista\n"
                + "opção 4 = Mostrar um elemento de determinada posição da lista\n"
                + "opção 5 = Mostrar a posição de um determinado elemento\n"
                + "opçao 6 = Mostrar e excluir o primeiro elemento da lista\n"
                + "opção 7 = Mostrar e excluir o último elemento da lista\n"
                + "opção 8 = Mostrar e excluir o elemento de determinada posição da lista\n"
                + "opção 9 = Mostrar e excluir determinado elemento da lista\n"
                + "opçao 10 = Substituir por outro o elemento de determinada posição da lista\n"
                + "opção 11 = Mostrar todos os elementos da lista\n"
                + "opção 12 = Remover todos os elementos da lista\n"
                + "opção 13 = Exibir Menu\n");
        System.out.println("Escolha uma opção do menu: ");
        try {
            do {

                opc = Integer.parseInt(s.nextLine());
                if (opc >= 0 && opc <= 13) {
                    switch (opc) {
                        case 0:
                            looping = false;
                            System.out.println("###FIM###");
                            break;
                        case 1:
                            System.out.println("Informe o numero para ser inserido no inicio da lista: ");
                            lista.addFirst(entrada.nextInt());
                            System.out.println("-- Numero adicionado no inicio da lista -- ");
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 2:
                            System.out.println("Informe o numero para ser inserido no final da lista: ");
                            lista.addLast(entrada.nextInt());
                            System.out.println("-- Numero adicionado no final da lista -- ");
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 3:
                            System.out.println("Informe a posição que deseja inserir o numero: ");
                            int pos = entrada.nextInt();
                            if (pos>=0 && pos <= lista.size()) {
                                System.out.println("Informe o numero que deseja inserir: ");
                                lista.add(pos, entrada.nextInt());
                                System.out.println("-- Numero adicionado na posição: " + pos + " -- ");
                            } else {
                                System.out.println("valor maior que o tamanho da lista");
                            }
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 4:
                            System.out.println("Informe a posição da lista que deseja ver: ");
                            pos = entrada.nextInt();
                            if (!lista.isEmpty() && pos <= lista.size()) {
                                System.out.println("valor: " + lista.get(pos));
                            } else {
                                System.out.println("valor maior que o tamanho da lista");
                            }
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 5:
                            System.out.println("Informe o numero que deseja encontrar na lista: ");
                            int encontrar = entrada.nextInt();
                            int i = 0;
                            int posAchada = 0;
                            while (i < lista.size()) {
                                if (lista.get(i) == encontrar) {
                                    posAchada = i;
                                    System.out.println("Valor Encontrado na posição: " + i);

                                    break;
                                }

                                i++;
                            }
                            if (i == lista.size() && posAchada == 0) {
                                System.out.println("valor não encontrado");
                            }
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 6:
                            if (!lista.isEmpty()) {
                                System.out.println("Foi removido o primeiro elemento da lista: " + lista.removeFirst());
                            } else {
                                System.out.println("Lista está vazia");
                            }
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 7:
                            if (!lista.isEmpty()) {
                                System.out.println("Foi removido o ultimo elemento da lista: " + lista.removeLast());
                            } else {
                                System.out.println("Lista está vazia");
                            }
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 8:
                            System.out.println("Informe a posição que deseja excluir o numero: ");
                            pos = entrada.nextInt();
                            if (!lista.isEmpty() && pos <= lista.size()) {
                                System.out.println("-- Posição Excluida -- " + pos + " Valor: " + lista.get(pos));
                                lista.remove(pos);
                                
                            } else {
                                System.out.println("Posição não existe na lista");
                            }
                            System.out.println("Escolha outra opção do menu: ");
                            break;

                        case 9:
                            System.out.println("Informe o numero que deseja excluir dentro da lista: ");
                            encontrar = entrada.nextInt();
                            i = 0;
                            posAchada = 0;
                            while (i < lista.size()) {
                                if (lista.get(i) == encontrar) {
                                    posAchada = i;
                                    System.out.println("Valor excluido na posição: " + i);
                                    lista.remove(i);
                                    break;

                                }

                                i++;
                            }
                            if (i == lista.size() && posAchada == 0) {
                                System.out.println("valor não encontrado");
                            }
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 10:

                            System.out.println("Informe a posição que deseja substituir valores: ");

                            pos = entrada.nextInt();
                            if (!lista.isEmpty() && pos <= lista.size()) {
                                System.out.println("Informe o valor que deseja inserir: ");
                                lista.set(pos, entrada.nextInt());
                                System.out.println("-- Posição Substituida --");
                            } else {
                                System.out.println("posição não existe na lista");
                            }
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 11:
                            System.out.println("" + lista);
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 12:
                            while (!lista.isEmpty()) {
                                lista.remove();
                            }
                            System.out.println("lista apagada");
                            System.out.println("Escolha outra opção do menu: ");
                            break;
                        case 13:
                            System.out.println("Escolha uma das opçoes:\n "
                                    + "opção 0 = sair\n"
                                    + "opçao 1 = Inserir elemento no início da lista\n"
                                    + "opção 2 = Inserir elemento no final da lista\n"
                                    + "opção 3 = Inserir elemento em uma determinada posição da lista\n"
                                    + "opção 4 = Mostrar um elemento de determinada posição da lista\n"
                                    + "opção 5 = Mostrar a posição de um determinado elemento\n"
                                    + "opçao 6 = Mostrar e excluir o primeiro elemento da lista\n"
                                    + "opção 7 = Mostrar e excluir o último elemento da lista\n"
                                    + "opção 8 = Mostrar e excluir o elemento de determinada posição da lista\n"
                                    + "opção 9 = Mostrar e excluir determinado elemento da lista\n"
                                    + "opçao 10 = Substituir por outro o elemento de determinada posição da lista\n"
                                    + "opção 11 = Mostrar todos os elementos da lista\n"
                                    + "opção 12 = Remover todos os elementos da lista\n"
                                    + "opção 13 = Exibir Menu\n");
                            System.out.println("Escolha uma opção do menu: ");

                    }
                } else {
                    System.out.println("Este não e um numero valido");
                    System.out.println("Informe outra opção: ");
                }

            } while (looping);
        } catch (Exception e) {

            System.out.println("Erro ao executar menu -->" + e.getMessage());

        }
    }

}
