package org.sonar.maven.model.maven2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.sonar.maven.model.LocatedAttribute;
import org.sonar.maven.model.LocatedAttributeAdapter;
import org.sonar.maven.model.LocatedTreeImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Prerequisites", propOrder={})
public class Prerequisites extends LocatedTreeImpl
{

    @XmlElement(type=String.class, defaultValue="2.0")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute maven;

    public LocatedAttribute getMaven()
    {
        return this.maven;
    }

    public void setMaven(LocatedAttribute value)
    {
        this.maven = value;
    }
}