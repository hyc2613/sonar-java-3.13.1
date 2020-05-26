package org.sonar.maven.model.maven2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.sonar.maven.model.LocatedAttribute;
import org.sonar.maven.model.LocatedAttributeAdapter;
import org.sonar.maven.model.LocatedTreeImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Dependency", propOrder={})
public class Dependency extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute groupId;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute artifactId;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute version;

    @XmlElement(type=String.class, defaultValue="jar")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute type;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute classifier;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute scope;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute systemPath;
    protected Exclusions exclusions;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute optional;

    public LocatedAttribute getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(LocatedAttribute value)
    {
        this.groupId = value;
    }

    public LocatedAttribute getArtifactId()
    {
        return this.artifactId;
    }

    public void setArtifactId(LocatedAttribute value)
    {
        this.artifactId = value;
    }

    public LocatedAttribute getVersion()
    {
        return this.version;
    }

    public void setVersion(LocatedAttribute value)
    {
        this.version = value;
    }

    public LocatedAttribute getType()
    {
        return this.type;
    }

    public void setType(LocatedAttribute value)
    {
        this.type = value;
    }

    public LocatedAttribute getClassifier()
    {
        return this.classifier;
    }

    public void setClassifier(LocatedAttribute value)
    {
        this.classifier = value;
    }

    public LocatedAttribute getScope()
    {
        return this.scope;
    }

    public void setScope(LocatedAttribute value)
    {
        this.scope = value;
    }

    public LocatedAttribute getSystemPath()
    {
        return this.systemPath;
    }

    public void setSystemPath(LocatedAttribute value)
    {
        this.systemPath = value;
    }

    public Exclusions getExclusions()
    {
        return this.exclusions;
    }

    public void setExclusions(Exclusions value)
    {
        this.exclusions = value;
    }

    public LocatedAttribute getOptional()
    {
        return this.optional;
    }

    public void setOptional(LocatedAttribute value)
    {
        this.optional = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"exclusions"})
    public static class Exclusions extends LocatedTreeImpl
    {

        @XmlElement(name="exclusion")
        protected List<Exclusion> exclusions;

        public List<Exclusion> getExclusions()
        {
            if (this.exclusions == null) {
                this.exclusions = new ArrayList();
            }
            return this.exclusions;
        }
    }
}