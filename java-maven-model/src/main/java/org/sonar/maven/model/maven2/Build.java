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
@XmlType(name="Build", propOrder={})
public class Build extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute sourceDirectory;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute scriptSourceDirectory;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute testSourceDirectory;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute outputDirectory;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute testOutputDirectory;
    protected Extensions extensions;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute defaultGoal;
    protected Resources resources;
    protected TestResources testResources;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute directory;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute finalName;
    protected Filters filters;
    protected PluginManagement pluginManagement;
    protected Plugins plugins;

    public LocatedAttribute getSourceDirectory()
    {
        return this.sourceDirectory;
    }

    public void setSourceDirectory(LocatedAttribute value)
    {
        this.sourceDirectory = value;
    }

    public LocatedAttribute getScriptSourceDirectory()
    {
        return this.scriptSourceDirectory;
    }

    public void setScriptSourceDirectory(LocatedAttribute value)
    {
        this.scriptSourceDirectory = value;
    }

    public LocatedAttribute getTestSourceDirectory()
    {
        return this.testSourceDirectory;
    }

    public void setTestSourceDirectory(LocatedAttribute value)
    {
        this.testSourceDirectory = value;
    }

    public LocatedAttribute getOutputDirectory()
    {
        return this.outputDirectory;
    }

    public void setOutputDirectory(LocatedAttribute value)
    {
        this.outputDirectory = value;
    }

    public LocatedAttribute getTestOutputDirectory()
    {
        return this.testOutputDirectory;
    }

    public void setTestOutputDirectory(LocatedAttribute value)
    {
        this.testOutputDirectory = value;
    }

    public Extensions getExtensions()
    {
        return this.extensions;
    }

    public void setExtensions(Extensions value)
    {
        this.extensions = value;
    }

    public LocatedAttribute getDefaultGoal()
    {
        return this.defaultGoal;
    }

    public void setDefaultGoal(LocatedAttribute value)
    {
        this.defaultGoal = value;
    }

    public Resources getResources()
    {
        return this.resources;
    }

    public void setResources(Resources value)
    {
        this.resources = value;
    }

    public TestResources getTestResources()
    {
        return this.testResources;
    }

    public void setTestResources(TestResources value)
    {
        this.testResources = value;
    }

    public LocatedAttribute getDirectory()
    {
        return this.directory;
    }

    public void setDirectory(LocatedAttribute value)
    {
        this.directory = value;
    }

    public LocatedAttribute getFinalName()
    {
        return this.finalName;
    }

    public void setFinalName(LocatedAttribute value)
    {
        this.finalName = value;
    }

    public Filters getFilters()
    {
        return this.filters;
    }

    public void setFilters(Filters value)
    {
        this.filters = value;
    }

    public PluginManagement getPluginManagement()
    {
        return this.pluginManagement;
    }

    public void setPluginManagement(PluginManagement value)
    {
        this.pluginManagement = value;
    }

    public Plugins getPlugins()
    {
        return this.plugins;
    }

    public void setPlugins(Plugins value)
    {
        this.plugins = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"testResources"})
    public static class TestResources extends LocatedTreeImpl
    {

        @XmlElement(name="testResource")
        protected List<Resource> testResources;

        public List<Resource> getTestResources()
        {
            if (this.testResources == null) {
                this.testResources = new ArrayList();
            }
            return this.testResources;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"resources"})
    public static class Resources extends LocatedTreeImpl
    {

        @XmlElement(name="resource")
        protected List<Resource> resources;

        public List<Resource> getResources()
        {
            if (this.resources == null) {
                this.resources = new ArrayList();
            }
            return this.resources;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"plugins"})
    public static class Plugins extends LocatedTreeImpl
    {

        @XmlElement(name="plugin")
        protected List<Plugin> plugins;

        public List<Plugin> getPlugins()
        {
            if (this.plugins == null) {
                this.plugins = new ArrayList();
            }
            return this.plugins;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"filters"})
    public static class Filters extends LocatedTreeImpl
    {

        @XmlElement(name="filter", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> filters;

        public List<LocatedAttribute> getFilters()
        {
            if (this.filters == null) {
                this.filters = new ArrayList();
            }
            return this.filters;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"extensions"})
    public static class Extensions extends LocatedTreeImpl
    {

        @XmlElement(name="extension")
        protected List<Extension> extensions;

        public List<Extension> getExtensions()
        {
            if (this.extensions == null) {
                this.extensions = new ArrayList();
            }
            return this.extensions;
        }
    }
}