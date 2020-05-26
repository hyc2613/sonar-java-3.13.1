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
@XmlType(name="Profile", propOrder={})
public class Profile extends LocatedTreeImpl
{

    @XmlElement(type=String.class, defaultValue="default")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute id;
    protected Activation activation;
    protected BuildBase build;
    protected Modules modules;
    protected DistributionManagement distributionManagement;
    protected Properties properties;
    protected DependencyManagement dependencyManagement;
    protected Dependencies dependencies;
    protected Repositories repositories;
    protected PluginRepositories pluginRepositories;
    protected Reports reports;
    protected Reporting reporting;

    public LocatedAttribute getId()
    {
        return this.id;
    }

    public void setId(LocatedAttribute value)
    {
        this.id = value;
    }

    public Activation getActivation()
    {
        return this.activation;
    }

    public void setActivation(Activation value)
    {
        this.activation = value;
    }

    public BuildBase getBuild()
    {
        return this.build;
    }

    public void setBuild(BuildBase value)
    {
        this.build = value;
    }

    public Modules getModules()
    {
        return this.modules;
    }

    public void setModules(Modules value)
    {
        this.modules = value;
    }

    public DistributionManagement getDistributionManagement()
    {
        return this.distributionManagement;
    }

    public void setDistributionManagement(DistributionManagement value)
    {
        this.distributionManagement = value;
    }

    public Properties getProperties()
    {
        return this.properties;
    }

    public void setProperties(Properties value)
    {
        this.properties = value;
    }

    public DependencyManagement getDependencyManagement()
    {
        return this.dependencyManagement;
    }

    public void setDependencyManagement(DependencyManagement value)
    {
        this.dependencyManagement = value;
    }

    public Dependencies getDependencies()
    {
        return this.dependencies;
    }

    public void setDependencies(Dependencies value)
    {
        this.dependencies = value;
    }

    public Repositories getRepositories()
    {
        return this.repositories;
    }

    public void setRepositories(Repositories value)
    {
        this.repositories = value;
    }

    public PluginRepositories getPluginRepositories()
    {
        return this.pluginRepositories;
    }

    public void setPluginRepositories(PluginRepositories value)
    {
        this.pluginRepositories = value;
    }

    public Reports getReports()
    {
        return this.reports;
    }

    public void setReports(Reports value)
    {
        this.reports = value;
    }

    public Reporting getReporting()
    {
        return this.reporting;
    }

    public void setReporting(Reporting value)
    {
        this.reporting = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"repositories"})
    public static class Repositories extends LocatedTreeImpl
    {

        @XmlElement(name="repository")
        protected List<Repository> repositories;

        public List<Repository> getRepositories()
        {
            if (this.repositories == null) {
                this.repositories = new ArrayList();
            }
            return this.repositories;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"elements"})
    public static class Reports extends LocatedTreeImpl
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
    @XmlType(name="", propOrder={"elements"})
    public static class Properties extends LocatedTreeImpl
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
    @XmlType(name="", propOrder={"pluginRepositories"})
    public static class PluginRepositories extends LocatedTreeImpl
    {

        @XmlElement(name="pluginRepository")
        protected List<Repository> pluginRepositories;

        public List<Repository> getPluginRepositories()
        {
            if (this.pluginRepositories == null) {
                this.pluginRepositories = new ArrayList();
            }
            return this.pluginRepositories;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"modules"})
    public static class Modules extends LocatedTreeImpl
    {

        @XmlElement(name="module", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> modules;

        public List<LocatedAttribute> getModules()
        {
            if (this.modules == null) {
                this.modules = new ArrayList();
            }
            return this.modules;
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
}