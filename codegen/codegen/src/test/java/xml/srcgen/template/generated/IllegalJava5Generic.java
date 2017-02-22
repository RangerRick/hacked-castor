/*******************************************************************************
 * This file is part of OpenNMS(R).
 * 
 * Copyright (C) 2017-2017 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2017 The OpenNMS Group, Inc.
 * 
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 * 
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *     http://www.gnu.org/licenses/
 * 
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package xml.srcgen.template.generated;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class IllegalJava5Generic.
 * 
 * @version $Revision$ $Date$
 */
@XmlRootElement(name = "illegalJava5Generic")
@XmlAccessorType(XmlAccessType.FIELD)
public class IllegalJava5Generic implements java.io.Serializable {


    @XmlElement(name = "firstInteger", required = true)
    private java.lang.Long firstInteger;

    @XmlElement(name = "firstString", required = true)
    private java.lang.String firstString;

    @XmlElement(name = "listOfIntegers")
    private xml.srcgen.template.generated.ListOfIntegers listOfIntegers;

    public IllegalJava5Generic() {
    }

    /**
     */
    public void deleteFirstInteger() {
        this.firstInteger= null;
    }

    /**
     * Returns the value of field 'firstInteger'.
     * 
     * @return the value of field 'FirstInteger'.
     */
    public java.lang.Long getFirstInteger() {
        return this.firstInteger;
    }

    /**
     * Returns the value of field 'firstString'.
     * 
     * @return the value of field 'FirstString'.
     */
    public java.lang.String getFirstString() {
        return this.firstString;
    }

    /**
     * Returns the value of field 'listOfIntegers'.
     * 
     * @return the value of field 'ListOfIntegers'.
     */
    public xml.srcgen.template.generated.ListOfIntegers getListOfIntegers() {
        return this.listOfIntegers;
    }

    /**
     * Method hasFirstInteger.
     * 
     * @return true if at least one FirstInteger has been added
     */
    public boolean hasFirstInteger() {
        return this.firstInteger != null;
    }

    /**
     * Sets the value of field 'firstInteger'.
     * 
     * @param firstInteger the value of field 'firstInteger'.
     */
    public void setFirstInteger(final java.lang.Long firstInteger) {
        this.firstInteger = firstInteger;
    }

    /**
     * Sets the value of field 'firstString'.
     * 
     * @param firstString the value of field 'firstString'.
     */
    public void setFirstString(final java.lang.String firstString) {
        this.firstString = firstString;
    }

    /**
     * Sets the value of field 'listOfIntegers'.
     * 
     * @param listOfIntegers the value of field 'listOfIntegers'.
     */
    public void setListOfIntegers(final xml.srcgen.template.generated.ListOfIntegers listOfIntegers) {
        this.listOfIntegers = listOfIntegers;
    }

}
