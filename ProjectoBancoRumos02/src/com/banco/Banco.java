package com.banco;

import com.banco.clientes.Cliente;
import com.banco.contas.ContaInvestimento;
import com.banco.contas.ContaOrdem;
import com.banco.contas.ContaPoupanca;
import com.banco.contas.ContaPrazo;
import com.banco.output.Menu;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private int numAgencia;
    private String moradaAgencia;
    public List<Agencia> agencias = new ArrayList<>();
    public List<Cliente> clientesPorto = new ArrayList<>();
    public List<Cliente> clientesLisboa = new ArrayList<>();

    Agencia agenciaPorto = new Agencia(1, "Avenida da Boavista", clientesPorto);
    Agencia agenciaLisboa = new Agencia(2, "Avenida da Liberdade", clientesLisboa);

    Menu menu = new Menu();

    public Banco() {
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public void setMoradaAgencia(String moradaAgencia) {
        this.moradaAgencia = moradaAgencia;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public String getMoradaAgencia() {
        return moradaAgencia;
    }

    public Cliente criarCliente() {
        return null;
    }

    public void eliminarCliente() {
    }

    public ContaOrdem criaContaOrdem() {
        return null;
    }

    public ContaPrazo criaContaPrazo() {
        return null;
    }

    public ContaPoupanca criaPoupanca() {
        return null;
    }

    public ContaInvestimento criaContaInvestimento() {
        return null;
    }

}