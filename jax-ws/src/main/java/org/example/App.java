package org.example;


import jakarta.xml.ws.Endpoint;
import org.example.service.CertidaoNascimentoImpl;

public class App
{
    public static void main( String[] args )
    {
        CertidaoNascimentoImpl certidaoNascimento = new CertidaoNascimentoImpl(); //
        Endpoint.publish("http://localhost:8085/servico/certidao", certidaoNascimento); //dizer qual o caminho da publicação de serviço e qual é o serviço
        System.out.println("Serviço publicado com sucesso!");
    }
}
