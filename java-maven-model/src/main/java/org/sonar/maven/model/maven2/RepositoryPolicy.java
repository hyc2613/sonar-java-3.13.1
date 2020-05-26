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
@XmlType(name="RepositoryPolicy", propOrder={})
public class RepositoryPolicy extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute enabled;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute updatePolicy;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute checksumPolicy;

    public LocatedAttribute getEnabled()
    {
        return this.enabled;
    }

    public void setEnabled(LocatedAttribute value)
    {
        this.enabled = value;
    }

    public LocatedAttribute getUpdatePolicy()
    {
        return this.updatePolicy;
    }

    public void setUpdatePolicy(LocatedAttribute value)
    {
        this.updatePolicy = value;
    }

    public LocatedAttribute getChecksumPolicy()
    {
        return this.checksumPolicy;
    }

    public void setChecksumPolicy(LocatedAttribute value)
    {
        this.checksumPolicy = value;
    }
}