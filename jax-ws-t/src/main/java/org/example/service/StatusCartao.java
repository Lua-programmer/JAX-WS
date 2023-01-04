
package org.example.service;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusCartao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusCartao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Desconhecido"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Suspenso"/&gt;
 *     &lt;enumeration value="Cancelado"/&gt;
 *     &lt;enumeration value="Irregular"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusCartao")
@XmlEnum
public enum StatusCartao {

    @XmlEnumValue("Desconhecido")
    DESCONHECIDO("Desconhecido"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Suspenso")
    SUSPENSO("Suspenso"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Irregular")
    IRREGULAR("Irregular");
    private final String value;

    StatusCartao(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCartao fromValue(String v) {
        for (StatusCartao c: StatusCartao.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
