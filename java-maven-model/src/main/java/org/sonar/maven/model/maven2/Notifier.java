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
@XmlType(name="Notifier", propOrder={})
public class Notifier extends LocatedTreeImpl
{

    @XmlElement(type=String.class, defaultValue="mail")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute type;

    @XmlElement(defaultValue="true")
    protected Boolean sendOnError;

    @XmlElement(defaultValue="true")
    protected Boolean sendOnFailure;

    @XmlElement(defaultValue="true")
    protected Boolean sendOnSuccess;

    @XmlElement(defaultValue="true")
    protected Boolean sendOnWarning;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute address;
    protected Configuration configuration;

    public LocatedAttribute getType()
    {
        return this.type;
    }

    public void setType(LocatedAttribute value)
    {
        this.type = value;
    }

    public Boolean isSendOnError()
    {
        return this.sendOnError;
    }

    public void setSendOnError(Boolean value)
    {
        this.sendOnError = value;
    }

    public Boolean isSendOnFailure()
    {
        return this.sendOnFailure;
    }

    public void setSendOnFailure(Boolean value)
    {
        this.sendOnFailure = value;
    }

    public Boolean isSendOnSuccess()
    {
        return this.sendOnSuccess;
    }

    public void setSendOnSuccess(Boolean value)
    {
        this.sendOnSuccess = value;
    }

    public Boolean isSendOnWarning()
    {
        return this.sendOnWarning;
    }

    public void setSendOnWarning(Boolean value)
    {
        this.sendOnWarning = value;
    }

    public LocatedAttribute getAddress()
    {
        return this.address;
    }

    public void setAddress(LocatedAttribute value)
    {
        this.address = value;
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