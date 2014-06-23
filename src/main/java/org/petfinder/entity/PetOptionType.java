//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.02 at 05:30:40 PM EST 
//

package org.petfinder.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for petOptionType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="petOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="specialNeeds"/>
 *     &lt;enumeration value="noDogs"/>
 *     &lt;enumeration value="noCats"/>
 *     &lt;enumeration value="noKids"/>
 *     &lt;enumeration value="noClaws"/>
 *     &lt;enumeration value="hasShots"/>
 *     &lt;enumeration value="housebroken"/>
 *     &lt;enumeration value="altered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "petOptionType")
@XmlEnum
public enum PetOptionType {

	@XmlEnumValue("specialNeeds")
	SPECIAL_NEEDS("specialNeeds", "Has special Needs"), @XmlEnumValue("noDogs")
	NO_DOGS("noDogs", "Needs a home with no dogs"), @XmlEnumValue("noCats")
	NO_CATS("noCats", "Needs a home with no cats"), @XmlEnumValue("noKids")
	NO_KIDS("noKids", "Needs a home with no children"), @XmlEnumValue("noClaws")
	NO_CLAWS("noClaws", "Has no claws"), @XmlEnumValue("hasShots")
	HAS_SHOTS("hasShots", "Up-to-date with routine shots"), @XmlEnumValue("housebroken")
	HOUSEBROKEN("housebroken", "House broken"), @XmlEnumValue("altered")
	ALTERED("altered", "Spayed/Neutered");

	public static PetOptionType fromValue(String v) {
		for (PetOptionType c : PetOptionType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
	private final String description;

	private final String value;

	PetOptionType(String val, String desc) {
		this.value = val;
		this.description = desc;
	}

	public String getDescription() {
		return description;
	}

	public String value() {
		return value;
	}

}
