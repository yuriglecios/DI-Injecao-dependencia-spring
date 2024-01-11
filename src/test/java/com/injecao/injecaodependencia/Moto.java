package com.injecao.injecaodependencia;

public class Moto implements Veiculo{
    @Override
    public void acao() {
        System.out.println("Isso é uma moto!");
    }
}
