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
@XmlType(name="Reporting", propOrder={})
public class Reporting extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute excludeDefaults;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute outputDirectory;
    protected Plugins plugins;

    public LocatedAttribute getExcludeDefaults()
    {
        return this.excludeDefaults;
    }

    public void setExcludeDefaults(LocatedAttribute value)
    {
        this.excludeDefaults = value;
    }

    public LocatedAttribute getOutputDirectory()
    {
        return this.outputDirectory;
    }

    public void setOutputDirectory(LocatedAttribute value)
    {
        this.outputDirectory = value;
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
    @XmlType(name="", propOrder={"plugins"})
    public static class Plugins extends LocatedTreeImpl
    {

        @XmlElement(name="plugin")
        protected List<ReportPlugin> plugins;

        public List<ReportPlugin> getPlugins()
        {
            if (this.plugins == null) {
                this.plugins = new ArrayList();
            }
            return this.plugins;
        }
    }
}