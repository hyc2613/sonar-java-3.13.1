package org.sonar.maven.model.maven2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sonar.maven.model.LocatedTreeImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DependencyManagement", propOrder={})
public class DependencyManagement extends LocatedTreeImpl
{
    protected Dependencies dependencies;

    public Dependencies getDependencies()
    {
        return this.dependencies;
    }

    public void setDependencies(Dependencies value)
    {
        this.dependencies = value;
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
}