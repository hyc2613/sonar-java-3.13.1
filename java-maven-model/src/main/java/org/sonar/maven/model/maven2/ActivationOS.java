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
@XmlType(name="ActivationOS", propOrder={})
public class ActivationOS extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute name;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute family;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute arch;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute version;

    public LocatedAttribute getName()
    {
        return this.name;
    }

    public void setName(LocatedAttribute value)
    {
        this.name = value;
    }

    public LocatedAttribute getFamily()
    {
        return this.family;
    }

    public void setFamily(LocatedAttribute value)
    {
        this.family = value;
    }

    public LocatedAttribute getArch()
    {
        return this.arch;
    }

    public void setArch(LocatedAttribute value)
    {
        this.arch = value;
    }

    public LocatedAttribute getVersion()
    {
        return this.version;
    }

    public void setVersion(LocatedAttribute value)
    {
        this.version = value;
    }
}