package org.sonar.maven.model.maven2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sonar.maven.model.LocatedTreeImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PluginManagement", propOrder={})
public class PluginManagement extends LocatedTreeImpl
{
    protected Plugins plugins;

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
        protected List<Plugin> plugins;

        public List<Plugin> getPlugins()
        {
            if (this.plugins == null) {
                this.plugins = new ArrayList();
            }
            return this.plugins;
        }
    }
}