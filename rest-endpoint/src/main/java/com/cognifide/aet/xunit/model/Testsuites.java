/**
 * Automated Exploratory Tests
 *
 * Copyright (C) 2013 Cognifide Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.25 at 11:19:20 AM CEST 
//


package com.cognifide.aet.xunit.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * {@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{}testsuite" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="tests" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="failures" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "testsuite"
})
@XmlRootElement(name = "testsuites")
public class Testsuites {

  protected List<Testsuite> testsuite;
  @XmlAttribute(name = "name")
  protected String name;
  @XmlAttribute(name = "tests")
  protected String tests;
  @XmlAttribute(name = "failures")
  protected String failures;

  /**
   * Gets the value of the testsuite property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the testsuite property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTestsuite().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Testsuite }
   *
   *
   */
  public List<Testsuite> getTestsuite() {
    if (testsuite == null) {
      testsuite = new ArrayList<Testsuite>();
    }
    return this.testsuite;
  }

  /**
   * Gets the value of the name property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the tests property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getTests() {
    return tests;
  }

  /**
   * Sets the value of the tests property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setTests(String value) {
    this.tests = value;
  }

  /**
   * Gets the value of the failures property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getFailures() {
    return failures;
  }

  /**
   * Sets the value of the failures property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setFailures(String value) {
    this.failures = value;
  }

}
