/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada.exercicio2;

/**
 *
 * @author Vinicius
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(){};
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    
    }
   
    @Override
   public String toString()
   {
       return "\nNome: " + nome +" " +"Idade: " + idade ;
   }
}
