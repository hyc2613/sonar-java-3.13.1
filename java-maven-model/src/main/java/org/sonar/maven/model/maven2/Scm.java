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
@XmlType(name="Scm", propOrder={})
public class Scm extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute connection;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute developerConnection;

    @XmlElement(type=String.class, defaultValue="HEAD")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute tag;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute url;

    public LocatedAttribute getConnection()
    {
        return this.connection;
    }

    public void setConnection(LocatedAttribute value)
    {
        this.connection = value;
    }

    public LocatedAttribute getDeveloperConnection()
    {
        return this.developerConnection;
    }

    public void setDeveloperConnection(LocatedAttribute value)
    {
        this.developerConnection = value;
    }

    public LocatedAttribute getTag()
    {
        return this.tag;
    }

    public void setTag(LocatedAttribute value)
    {
        this.tag = value;
    }

    public LocatedAttribute getUrl()
    {
        return this.url;
    }

    public void setUrl(LocatedAttribute value)
    {
        this.url = value;
    }
}