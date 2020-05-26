package org.sonar.maven.model.maven2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.sonar.maven.model.LocatedAttribute;
import org.sonar.maven.model.LocatedAttributeAdapter;
import org.sonar.maven.model.LocatedTreeImpl;
import org.w3c.dom.Element;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Plugin", propOrder={})
public class Plugin extends LocatedTreeImpl
{

    @XmlElement(type=String.class, defaultValue="org.apache.maven.plugins")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute groupId;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute artifactId;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute version;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute extensions;
    protected Executions executions;
    protected Dependencies dependencies;
    protected Goals goals;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute inherited;
    protected Configuration configuration;

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

    public LocatedAttribute getExtensions()
    {
        return this.extensions;
    }

    public void setExtensions(LocatedAttribute value)
    {
        this.extensions = value;
    }

    public Executions getExecutions()
    {
        return this.executions;
    }

    public void setExecutions(Executions value)
    {
        this.executions = value;
    }

    public Dependencies getDependencies()
    {
        return this.dependencies;
    }

    public void setDependencies(Dependencies value)
    {
        this.dependencies = value;
    }

    public Goals getGoals()
    {
        return this.goals;
    }

    public void setGoals(Goals value)
    {
        this.goals = value;
    }

    public LocatedAttribute getInherited()
    {
        return this.inherited;
    }

    public void setInherited(LocatedAttribute value)
    {
        this.inherited = value;
    }

    public Configuration getConfiguration()
    {
        return this.configuration;
    }

    public void setConfiguration(Configuration value)
    {
        this.configuration = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"elements"})
    public static class Goals extends LocatedTreeImpl
    {

        @XmlAnyElement
        protected List<Element> elements;

        public List<Element> getElements()
        {
            if (this.elements == null) {
                this.elements = new ArrayList();
            }
            return this.elements;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"executions"})
    public static class Executions extends LocatedTreeImpl
    {

        @XmlElement(name="execution")
        protected List<PluginExecution> executions;

        public List<PluginExecution> getExecutions()
        {
            if (this.executions == null) {
                this.executions = new ArrayList();
            }
            return this.executions;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"dependencies"})
    public static class Dependencies extends LocatedTreeImpl
    {

        @XmlElement(name="dependency")
        protected List<Dependency> dependencies;

        public List<Dependency> getDependencies()
        {
            if (this.dependencies == null) {
                this.dependencies = new ArrayList();
            }
            return this.dependencies;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"elements"})
    public static class Configuration extends LocatedTreeImpl
    {

        @XmlAnyElement
        protected List<Element> elements;

        public List<Element> getElements()
        {
            if (this.elements == null) {
                this.elements = new ArrayList();
            }
            return this.elements;
        }
    }
}