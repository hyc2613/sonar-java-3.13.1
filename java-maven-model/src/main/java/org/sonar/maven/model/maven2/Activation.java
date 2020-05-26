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
@XmlType(name="Activation", propOrder={})
public class Activation extends LocatedTreeImpl
{

    @XmlElement(defaultValue="false")
    protected Boolean activeByDefault;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute jdk;
    protected ActivationOS os;
    protected ActivationProperty property;
    protected ActivationFile file;

    public Boolean isActiveByDefault()
    {
        return this.activeByDefault;
    }

    public void setActiveByDefault(Boolean value)
    {
        this.activeByDefault = value;
    }

    public LocatedAttribute getJdk()
    {
        return this.jdk;
    }

    public void setJdk(LocatedAttribute value)
    {
        this.jdk = value;
    }

    public ActivationOS getOs()
    {
        return this.os;
    }

    public void setOs(ActivationOS value)
    {
        this.os = value;
    }

    public ActivationProperty getProperty()
    {
        return this.property;
    }

    public void setProperty(ActivationProperty value)
    {
        this.property = value;
    }

    public ActivationFile getFile()
    {
        return this.file;
    }

    public void setFile(ActivationFile value)
    {
        this.file = value;
    }
}