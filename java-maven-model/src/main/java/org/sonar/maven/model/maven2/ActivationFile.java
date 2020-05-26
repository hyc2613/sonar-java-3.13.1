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
@XmlType(name="ActivationFile", propOrder={})
public class ActivationFile extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute missing;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute exists;

    public LocatedAttribute getMissing()
    {
        return this.missing;
    }

    public void setMissing(LocatedAttribute value)
    {
        this.missing = value;
    }

    public LocatedAttribute getExists()
    {
        return this.exists;
    }

    public void setExists(LocatedAttribute value)
    {
        this.exists = value;
    }
}