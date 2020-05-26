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
@XmlType(name="Contributor", propOrder={})
public class Contributor extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute name;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute email;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute url;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute organization;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute organizationUrl;
    protected Roles roles;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute timezone;
    protected Properties properties;

    public LocatedAttribute getName()
    {
        return this.name;
    }

    public void setName(LocatedAttribute value)
    {
        this.name = value;
    }

    public LocatedAttribute getEmail()
    {
        return this.email;
    }

    public void setEmail(LocatedAttribute value)
    {
        this.email = value;
    }

    public LocatedAttribute getUrl()
    {
        return this.url;
    }

    public void setUrl(LocatedAttribute value)
    {
        this.url = value;
    }

    public LocatedAttribute getOrganization()
    {
        return this.organization;
    }

    public void setOrganization(LocatedAttribute value)
    {
        this.organization = value;
    }

    public LocatedAttribute getOrganizationUrl()
    {
        return this.organizationUrl;
    }

    public void setOrganizationUrl(LocatedAttribute value)
    {
        this.organizationUrl = value;
    }

    public Roles getRoles()
    {
        return this.roles;
    }

    public void setRoles(Roles value)
    {
        this.roles = value;
    }

    public LocatedAttribute getTimezone()
    {
        return this.timezone;
    }

    public void setTimezone(LocatedAttribute value)
    {
        this.timezone = value;
    }

    public Properties getProperties()
    {
        return this.properties;
    }

    public void setProperties(Properties value)
    {
        this.properties = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"roles"})
    public static class Roles extends LocatedTreeImpl
    {

        @XmlElement(name="role", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> roles;

        public List<LocatedAttribute> getRoles()
        {
            if (this.roles == null) {
                this.roles = new ArrayList();
            }
            return this.roles;
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
}