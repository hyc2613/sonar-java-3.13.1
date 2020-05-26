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
@XmlType(name="Model", propOrder={})
public class MavenProject extends LocatedTreeImpl
{

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute modelVersion;
    protected Parent parent;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute groupId;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute artifactId;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute version;

    @XmlElement(type=String.class, defaultValue="jar")
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute packaging;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute name;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute description;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute url;

    @XmlElement(type=String.class)
    @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
    protected LocatedAttribute inceptionYear;
    protected Organization organization;
    protected Licenses licenses;
    protected Developers developers;
    protected Contributors contributors;
    protected MailingLists mailingLists;
    protected Prerequisites prerequisites;
    protected Modules modules;
    protected Scm scm;
    protected IssueManagement issueManagement;
    protected CiManagement ciManagement;
    protected DistributionManagement distributionManagement;
    protected Properties properties;
    protected DependencyManagement dependencyManagement;
    protected Dependencies dependencies;
    protected Repositories repositories;
    protected PluginRepositories pluginRepositories;
    protected Build build;
    protected Reports reports;
    protected Reporting reporting;
    protected Profiles profiles;

    public LocatedAttribute getModelVersion()
    {
        return this.modelVersion;
    }

    public void setModelVersion(LocatedAttribute value)
    {
        this.modelVersion = value;
    }

    public Parent getParent()
    {
        return this.parent;
    }

    public void setParent(Parent value)
    {
        this.parent = value;
    }

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

    public LocatedAttribute getPackaging()
    {
        return this.packaging;
    }

    public void setPackaging(LocatedAttribute value)
    {
        this.packaging = value;
    }

    public LocatedAttribute getName()
    {
        return this.name;
    }

    public void setName(LocatedAttribute value)
    {
        this.name = value;
    }

    public LocatedAttribute getDescription()
    {
        return this.description;
    }

    public void setDescription(LocatedAttribute value)
    {
        this.description = value;
    }

    public LocatedAttribute getUrl()
    {
        return this.url;
    }

    public void setUrl(LocatedAttribute value)
    {
        this.url = value;
    }

    public LocatedAttribute getInceptionYear()
    {
        return this.inceptionYear;
    }

    public void setInceptionYear(LocatedAttribute value)
    {
        this.inceptionYear = value;
    }

    public Organization getOrganization()
    {
        return this.organization;
    }

    public void setOrganization(Organization value)
    {
        this.organization = value;
    }

    public Licenses getLicenses()
    {
        return this.licenses;
    }

    public void setLicenses(Licenses value)
    {
        this.licenses = value;
    }

    public Developers getDevelopers()
    {
        return this.developers;
    }

    public void setDevelopers(Developers value)
    {
        this.developers = value;
    }

    public Contributors getContributors()
    {
        return this.contributors;
    }

    public void setContributors(Contributors value)
    {
        this.contributors = value;
    }

    public MailingLists getMailingLists()
    {
        return this.mailingLists;
    }

    public void setMailingLists(MailingLists value)
    {
        this.mailingLists = value;
    }

    public Prerequisites getPrerequisites()
    {
        return this.prerequisites;
    }

    public void setPrerequisites(Prerequisites value)
    {
        this.prerequisites = value;
    }

    public Modules getModules()
    {
        return this.modules;
    }

    public void setModules(Modules value)
    {
        this.modules = value;
    }

    public Scm getScm()
    {
        return this.scm;
    }

    public void setScm(Scm value)
    {
        this.scm = value;
    }

    public IssueManagement getIssueManagement()
    {
        return this.issueManagement;
    }

    public void setIssueManagement(IssueManagement value)
    {
        this.issueManagement = value;
    }

    public CiManagement getCiManagement()
    {
        return this.ciManagement;
    }

    public void setCiManagement(CiManagement value)
    {
        this.ciManagement = value;
    }

    public DistributionManagement getDistributionManagement()
    {
        return this.distributionManagement;
    }

    public void setDistributionManagement(DistributionManagement value)
    {
        this.distributionManagement = value;
    }

    public Properties getProperties()
    {
        return this.properties;
    }

    public void setProperties(Properties value)
    {
        this.properties = value;
    }

    public DependencyManagement getDependencyManagement()
    {
        return this.dependencyManagement;
    }

    public void setDependencyManagement(DependencyManagement value)
    {
        this.dependencyManagement = value;
    }

    public Dependencies getDependencies()
    {
        return this.dependencies;
    }

    public void setDependencies(Dependencies value)
    {
        this.dependencies = value;
    }

    public Repositories getRepositories()
    {
        return this.repositories;
    }

    public void setRepositories(Repositories value)
    {
        this.repositories = value;
    }

    public PluginRepositories getPluginRepositories()
    {
        return this.pluginRepositories;
    }

    public void setPluginRepositories(PluginRepositories value)
    {
        this.pluginRepositories = value;
    }

    public Build getBuild()
    {
        return this.build;
    }

    public void setBuild(Build value)
    {
        this.build = value;
    }

    public Reports getReports()
    {
        return this.reports;
    }

    public void setReports(Reports value)
    {
        this.reports = value;
    }

    public Reporting getReporting()
    {
        return this.reporting;
    }

    public void setReporting(Reporting value)
    {
        this.reporting = value;
    }

    public Profiles getProfiles()
    {
        return this.profiles;
    }

    public void setProfiles(Profiles value)
    {
        this.profiles = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"repositories"})
    public static class Repositories extends LocatedTreeImpl
    {

        @XmlElement(name="repository")
        protected List<Repository> repositories;

        public List<Repository> getRepositories()
        {
            if (this.repositories == null) {
                this.repositories = new ArrayList();
            }
            return this.repositories;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"elements"})
    public static class Reports extends LocatedTreeImpl
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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"profiles"})
    public static class Profiles extends LocatedTreeImpl
    {

        @XmlElement(name="profile")
        protected List<Profile> profiles;

        public List<Profile> getProfiles()
        {
            if (this.profiles == null) {
                this.profiles = new ArrayList();
            }
            return this.profiles;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"pluginRepositories"})
    public static class PluginRepositories extends LocatedTreeImpl
    {

        @XmlElement(name="pluginRepository")
        protected List<Repository> pluginRepositories;

        public List<Repository> getPluginRepositories()
        {
            if (this.pluginRepositories == null) {
                this.pluginRepositories = new ArrayList();
            }
            return this.pluginRepositories;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"modules"})
    public static class Modules extends LocatedTreeImpl
    {

        @XmlElement(name="module", type=String.class)
        @XmlJavaTypeAdapter(LocatedAttributeAdapter.class)
        protected List<LocatedAttribute> modules;

        public List<LocatedAttribute> getModules()
        {
            if (this.modules == null) {
                this.modules = new ArrayList();
            }
            return this.modules;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"mailingLists"})
    public static class MailingLists extends LocatedTreeImpl
    {

        @XmlElement(name="mailingList")
        protected List<MailingList> mailingLists;

        public List<MailingList> getMailingLists()
        {
            if (this.mailingLists == null) {
                this.mailingLists = new ArrayList();
            }
            return this.mailingLists;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"licenses"})
    public static class Licenses extends LocatedTreeImpl
    {

        @XmlElement(name="license")
        protected List<License> licenses;

        public List<License> getLicenses()
        {
            if (this.licenses == null) {
                this.licenses = new ArrayList();
            }
            return this.licenses;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"developers"})
    public static class Developers extends LocatedTreeImpl
    {

        @XmlElement(name="developer")
        protected List<Developer> developers;

        public List<Developer> getDevelopers()
        {
            if (this.developers == null) {
                this.developers = new ArrayList();
            }
            return this.developers;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"dependencies"})
    public static class Dependencies extends LocatedTreeImpl
    {

        @XmlElement(name="dependency")
        protected List<Dependency> dependencies;

        public List<Dependency> getDependencies()
        {
            if (this.dependencies == null) {
                this.dependencies = new ArrayList();
            }
            return this.dependencies;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"contributors"})
    public static class Contributors extends LocatedTreeImpl
    {

        @XmlElement(name="contributor")
        protected List<Contributor> contributors;

        public List<Contributor> getContributors()
        {
            if (this.contributors == null) {
                this.contributors = new ArrayList();
            }
            return this.contributors;
        }
    }
}