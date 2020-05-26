package org.sonar.maven.model.maven2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.sonar.maven.model.LocatedAttribute;
import org.sonar.maven.model.LocatedAttributeAdapter;
import org.sonar.maven.model.LocatedTreeImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DistributionManagement", propOrder={})
public class DistributionManagement extends LocatedTreeImpl
{
    protected DeploymentRepository repository;
    protected DeploymentRepository snapshotRepository;
    protected Site site;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute downloadUrl;
    protected Relocation relocation;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute status;

    public DeploymentRepository getRepository()
    {
        return this.repository;
    }

    public void setRepository(DeploymentRepository value)
    {
        this.repository = value;
    }

    public DeploymentRepository getSnapshotRepository()
    {
        return this.snapshotRepository;
    }

    public void setSnapshotRepository(DeploymentRepository value)
    {
        this.snapshotRepository = value;
    }

    public Site getSite()
    {
        return this.site;
    }

    public void setSite(Site value)
    {
        this.site = value;
    }

    public LocatedAttribute getDownloadUrl()
    {
        return this.downloadUrl;
    }

    public void setDownloadUrl(LocatedAttribute value)
    {
        this.downloadUrl = value;
    }

    public Relocation getRelocation()
    {
        return this.relocation;
    }

    public void setRelocation(Relocation value)
    {
        this.relocation = value;
    }

    public LocatedAttribute getStatus()
    {
        return this.status;
    }

    public void setStatus(LocatedAttribute value)
    {
        this.status = value;
    }
}