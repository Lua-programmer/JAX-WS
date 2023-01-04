
package org.example.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de chancelaMaster complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="chancelaMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ativo" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/&gt;
 *         &lt;element name="chancela" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="servicosSigep" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoSigep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chancelaMaster", propOrder = {
    "ativo",
    "chancela",
    "dataAtualizacao",
    "descricao",
    "id",
    "servicosSigep"
})
public class ChancelaMaster {

    @XmlSchemaType(name = "string")
    protected SimNao ativo;
    protected byte[] chancela;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    protected String descricao;
    protected Long id;
    @XmlElement(nillable = true)
    protected List<ServicoSigep> servicosSigep;

    /**
     * Obtém o valor da propriedade ativo.
     * 
     * @return
     *     possible object is
     *     {@link SimNao }
     *     
     */
    public SimNao getAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     * @param value
     *     allowed object is
     *     {@link SimNao }
     *     
     */
    public void setAtivo(SimNao value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade chancela.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChancela() {
        return chancela;
    }

    /**
     * Define o valor da propriedade chancela.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChancela(byte[] value) {
        this.chancela = value;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacao(XMLGregorianCalendar value) {
        this.dataAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the servicosSigep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the servicosSigep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicosSigep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicoSigep }
     * 
     * 
     */
    public List<ServicoSigep> getServicosSigep() {
        if (servicosSigep == null) {
            servicosSigep = new ArrayList<ServicoSigep>();
        }
        return this.servicosSigep;
    }

}
