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
@XmlType(name="Exclusion", propOrder={})
public class Exclusion extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute artifactId;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute groupId;

    public LocatedAttribute getArtifactId()
    {
        return this.artifactId;
    }

    public void setArtifactId(LocatedAttribute value)
    {
        this.artifactId = value;
    }

    public LocatedAttribute getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(LocatedAttribute value)
    {
        this.groupId = value;
    }
}