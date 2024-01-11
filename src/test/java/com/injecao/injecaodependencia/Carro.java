package com.injecao.injecaodependencia;

public class Carro implements Veiculo{
    @Override
    public void acao() {
        System.out.println("Isso é um carro!");
    }
}
