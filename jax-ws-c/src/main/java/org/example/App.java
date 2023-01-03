package org.example;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8085/servico/certidao?wsdl");

        QName qname = new QName("http://service.example.org/", "CertidaoNascimentoImplService");

        Service service = Service.create(url, qname); //comunicação com o serviço que vamos consumir

        CertidaoNascimento certidao = service.getPort(CertidaoNascimento.class);
        int idade = certidao.calcularIdade("16/08/1996");
        String diaSemana = certidao.diaSemanaNascimento("16/08/1996");
        System.out.println("Idade: " + idade);
        System.out.println("Dia da semana: " + diaSemana);
    }
}
