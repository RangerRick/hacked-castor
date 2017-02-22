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
 * Class ListOfIntegers.
 * 
 * @version $Revision$ $Date$
 */
@XmlRootElement(name = "listOfIntegers")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListOfIntegers implements java.io.Serializable {


    @XmlElement(name = "listType", required = true)
    private java.util.Vector listTypeList;

    public ListOfIntegers() {
        this.listTypeList = new java.util.Vector();
    }

    /**
     * 
     * 
     * @param vListType
     * @throws java.lang.IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addListType(final java.lang.Long vListType) throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this.listTypeList.size() >= 256) {
            throw new IndexOutOfBoundsException("addListType has a maximum of 256");
        }
        
        this.listTypeList.addElement(vListType);
    }

    /**
     * 
     * 
     * @param index
     * @param vListType
     * @throws java.lang.IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addListType(final int index, final java.lang.Long vListType) throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this.listTypeList.size() >= 256) {
            throw new IndexOutOfBoundsException("addListType has a maximum of 256");
        }
        
        this.listTypeList.add(index, vListType);
    }

    /**
     * Method enumerateListType.
     * 
     * @return an Enumeration over all java.lang.Long elements
     */
    public java.util.Enumeration enumerateListType() {
        return this.listTypeList.elements();
    }

    /**
     * Method getListType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     * @return the value of the java.lang.Long at the given index
     */
    public java.lang.Long getListType(final int index) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.listTypeList.size()) {
            throw new IndexOutOfBoundsException("getListType: Index value '" + index + "' not in range [0.." + (this.listTypeList.size() - 1) + "]");
        }
        
        return ((java.lang.Long) listTypeList.get(index));
    }

    /**
     * Method getListType.Returns the contents of the collection in an Array. 
     * <p>Note:  Just in case the collection contents are changing in another
     * thread, we pass a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of exactly the correct
     * length.
     * 
     * @return this collection as an Array
     */
    public java.lang.Long[] getListType() {
        java.lang.Long[] array = new java.lang.Long[0];
        return (java.lang.Long[]) this.listTypeList.toArray(array);
    }

    /**
     * Method getListTypeCount.
     * 
     * @return the size of this collection
     */
    public int getListTypeCount() {
        return this.listTypeList.size();
    }

    /**
     */
    public void removeAllListType() {
        this.listTypeList.clear();
    }

    /**
     * Method removeListType.
     * 
     * @param vListType
     * @return true if the object was removed from the collection.
     */
    public boolean removeListType(final java.lang.Long vListType) {
        boolean removed = listTypeList.remove(vListType);
        return removed;
    }

    /**
     * Method removeListTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.Long removeListTypeAt(final int index) {
        java.lang.Object obj = this.listTypeList.remove(index);
        return ((java.lang.Long) obj);
    }

    /**
     * 
     * 
     * @param index
     * @param vListType
     * @throws java.lang.IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void setListType(final int index, final java.lang.Long vListType) throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.listTypeList.size()) {
            throw new IndexOutOfBoundsException("setListType: Index value '" + index + "' not in range [0.." + (this.listTypeList.size() - 1) + "]");
        }
        
        this.listTypeList.set(index, vListType);
    }

    /**
     * 
     * 
     * @param vListTypeArray
     */
    public void setListType(final java.lang.Long[] vListTypeArray) {
        //-- copy array
        listTypeList.clear();
        
        for (int i = 0; i < vListTypeArray.length; i++) {
                this.listTypeList.add(vListTypeArray[i]);
        }
    }

}
