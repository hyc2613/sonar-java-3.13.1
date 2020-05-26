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
@XmlType(name="DeploymentRepository", propOrder={})
public class DeploymentRepository extends LocatedTreeImpl
{

    @XmlElement(defaultValue="true")
    protected Boolean uniqueVersion;
    protected RepositoryPolicy releases;
    protected RepositoryPolicy snapshots;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute id;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute name;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute url;

    @XmlElement(type=String.class, defaultValue="default")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute layout;

    public Boolean isUniqueVersion()
    {
        return this.uniqueVersion;
    }

    public void setUniqueVersion(Boolean value)
    {
        this.uniqueVersion = value;
    }

    public RepositoryPolicy getReleases()
    {
        return this.releases;
    }

    public void setReleases(RepositoryPolicy value)
    {
        this.releases = value;
    }

    public RepositoryPolicy getSnapshots()
    {
        return this.snapshots;
    }

    public void setSnapshots(RepositoryPolicy value)
    {
        this.snapshots = value;
    }

    public LocatedAttribute getId()
    {
        return this.id;
    }

    public void setId(LocatedAttribute value)
    {
        this.id = value;
    }

    public LocatedAttribute getName()
    {
        return this.name;
    }

    public void setName(LocatedAttribute value)
    {
        this.name = value;
    }

    public LocatedAttribute getUrl()
    {
        return this.url;
    }

    public void setUrl(LocatedAttribute value)
    {
        this.url = value;
    }

    public LocatedAttribute getLayout()
    {
        return this.layout;
    }

    public void setLayout(LocatedAttribute value)
    {
        this.layout = value;
    }
}