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
@XmlType(name="CiManagement", propOrder={})
public class CiManagement extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute system;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute url;
    protected Notifiers notifiers;

    public LocatedAttribute getSystem()
    {
        return this.system;
    }

    public void setSystem(LocatedAttribute value)
    {
        this.system = value;
    }

    public LocatedAttribute getUrl()
    {
        return this.url;
    }

    public void setUrl(LocatedAttribute value)
    {
        this.url = value;
    }

    public Notifiers getNotifiers()
    {
        return this.notifiers;
    }

    public void setNotifiers(Notifiers value)
    {
        this.notifiers = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"notifiers"})
    public static class Notifiers extends LocatedTreeImpl
    {

        @XmlElement(name="notifier")
        protected List<Notifier> notifiers;

        public List<Notifier> getNotifiers()
        {
            if (this.notifiers == null) {
                this.notifiers = new ArrayList();
            }
            return this.notifiers;
        }
    }
}