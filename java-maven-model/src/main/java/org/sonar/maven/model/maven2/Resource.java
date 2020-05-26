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
@XmlType(name="Resource", propOrder={})
public class Resource extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute targetPath;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute filtering;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute directory;
    protected Includes includes;
    protected Excludes excludes;

    public LocatedAttribute getTargetPath()
    {
        return this.targetPath;
    }

    public void setTargetPath(LocatedAttribute value)
    {
        this.targetPath = value;
    }

    public LocatedAttribute getFiltering()
    {
        return this.filtering;
    }

    public void setFiltering(LocatedAttribute value)
    {
        this.filtering = value;
    }

    public LocatedAttribute getDirectory()
    {
        return this.directory;
    }

    public void setDirectory(LocatedAttribute value)
    {
        this.directory = value;
    }

    public Includes getIncludes()
    {
        return this.includes;
    }

    public void setIncludes(Includes value)
    {
        this.includes = value;
    }

    public Excludes getExcludes()
    {
        return this.excludes;
    }

    public void setExcludes(Excludes value)
    {
        this.excludes = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"includes"})
    public static class Includes extends LocatedTreeImpl
    {

        @XmlElement(name="include", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> includes;

        public List<LocatedAttribute> getIncludes()
        {
            if (this.includes == null) {
                this.includes = new ArrayList();
            }
            return this.includes;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"excludes"})
    public static class Excludes extends LocatedTreeImpl
    {

        @XmlElement(name="exclude", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> excludes;

        public List<LocatedAttribute> getExcludes()
        {
            if (this.excludes == null) {
                this.excludes = new ArrayList();
            }
            return this.excludes;
        }
    }
}