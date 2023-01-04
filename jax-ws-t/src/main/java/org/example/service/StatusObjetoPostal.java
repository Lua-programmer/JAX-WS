
package org.example.service;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusObjetoPostal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusObjetoPostal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EmBranco"/&gt;
 *     &lt;enumeration value="Postado"/&gt;
 *     &lt;enumeration value="Cancelado"/&gt;
 *     &lt;enumeration value="Estorno"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusObjetoPostal")
@XmlEnum
public enum StatusObjetoPostal {

    @XmlEnumValue("EmBranco")
    EM_BRANCO("EmBranco"),
    @XmlEnumValue("Postado")
    POSTADO("Postado"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Estorno")
    ESTORNO("Estorno");
    private final String value;

    StatusObjetoPostal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusObjetoPostal fromValue(String v) {
        for (StatusObjetoPostal c: StatusObjetoPostal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
