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
@XmlType(name="ReportPlugin", propOrder={})
public class ReportPlugin extends LocatedTreeImpl
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
    protected ReportSets reportSets;

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

    public ReportSets getReportSets()
    {
        return this.reportSets;
    }

    public void setReportSets(ReportSets value)
    {
        this.reportSets = value;
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
    @XmlType(name="", propOrder={"reportSets"})
    public static class ReportSets extends LocatedTreeImpl
    {

        @XmlElement(name="reportSet")
        protected List<ReportSet> reportSets;

        public List<ReportSet> getReportSets()
        {
            if (this.reportSets == null) {
                this.reportSets = new ArrayList();
            }
            return this.reportSets;
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