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
@XmlType(name="PluginExecution", propOrder={})
public class PluginExecution extends LocatedTreeImpl
{

    @XmlElement(type=String.class, defaultValue="default")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute id;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute phase;
    protected Goals goals;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute inherited;
    protected Configuration configuration;

    public LocatedAttribute getId()
    {
        return this.id;
    }

    public void setId(LocatedAttribute value)
    {
        this.id = value;
    }

    public LocatedAttribute getPhase()
    {
        return this.phase;
    }

    public void setPhase(LocatedAttribute value)
    {
        this.phase = value;
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
    @XmlType(name="", propOrder={"goals"})
    public static class Goals extends LocatedTreeImpl
    {

        @XmlElement(name="goal", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> goals;

        public List<LocatedAttribute> getGoals()
        {
            if (this.goals == null) {
                this.goals = new ArrayList();
            }
            return this.goals;
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