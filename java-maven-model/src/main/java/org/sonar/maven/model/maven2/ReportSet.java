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
@XmlType(name="ReportSet", propOrder={})
public class ReportSet extends LocatedTreeImpl
{

    @XmlElement(type=String.class, defaultValue="default")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute id;
    protected Reports reports;

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

    public Reports getReports()
    {
        return this.reports;
    }

    public void setReports(Reports value)
    {
        this.reports = value;
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
    @XmlType(name="", propOrder={"reports"})
    public static class Reports extends LocatedTreeImpl
    {

        @XmlElement(name="report", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> reports;

        public List<LocatedAttribute> getReports()
        {
            if (this.reports == null) {
                this.reports = new ArrayList();
            }
            return this.reports;
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