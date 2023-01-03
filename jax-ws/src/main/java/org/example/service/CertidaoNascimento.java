package org.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

//Service Endpoint Interface - SEI
@WebService //indica que essa interface é uma interface de serviços
@SOAPBinding(style = SOAPBinding.Style.RPC) //indica que vamos trabalhar com tipos primitivos,
// tanto na entrada quanto na saída do métodos
public interface CertidaoNascimento {
    @WebMethod //indica que esses métodos são operações de serviços
    int calcularIdade(String idade);

    @WebMethod
    String diaSemanaNascimento(String idade);
}
