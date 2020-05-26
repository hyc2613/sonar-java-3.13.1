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
@XmlType(name="MailingList", propOrder={})
public class MailingList extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute name;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute subscribe;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute unsubscribe;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute post;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute archive;
    protected OtherArchives otherArchives;

    public LocatedAttribute getName()
    {
        return this.name;
    }

    public void setName(LocatedAttribute value)
    {
        this.name = value;
    }

    public LocatedAttribute getSubscribe()
    {
        return this.subscribe;
    }

    public void setSubscribe(LocatedAttribute value)
    {
        this.subscribe = value;
    }

    public LocatedAttribute getUnsubscribe()
    {
        return this.unsubscribe;
    }

    public void setUnsubscribe(LocatedAttribute value)
    {
        this.unsubscribe = value;
    }

    public LocatedAttribute getPost()
    {
        return this.post;
    }

    public void setPost(LocatedAttribute value)
    {
        this.post = value;
    }

    public LocatedAttribute getArchive()
    {
        return this.archive;
    }

    public void setArchive(LocatedAttribute value)
    {
        this.archive = value;
    }

    public OtherArchives getOtherArchives()
    {
        return this.otherArchives;
    }

    public void setOtherArchives(OtherArchives value)
    {
        this.otherArchives = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"otherArchives"})
    public static class OtherArchives extends LocatedTreeImpl
    {

        @XmlElement(name="otherArchive", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> otherArchives;

        public List<LocatedAttribute> getOtherArchives()
        {
            if (this.otherArchives == null) {
                this.otherArchives = new ArrayList();
            }
            return this.otherArchives;
        }
    }
}