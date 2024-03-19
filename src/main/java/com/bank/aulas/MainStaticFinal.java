package com.bank.aulas;

public class MainStaticFinal {
    public static void main(String[] args) {
        Pessoa.nomePriscila = "Priscila";
        System.out.println(Pessoa.nomePriscila);

        System.out.println(Pessoa.retornaUltimoNome("Priscila Robbe Righi"));
        //Pessoa.nomeAntonio = "Priscila"; não é possivel modificar
    }


}
