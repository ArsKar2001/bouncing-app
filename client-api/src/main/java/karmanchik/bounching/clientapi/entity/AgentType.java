package karmanchik.bounching.clientapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "AGENTTYPE")
@EqualsAndHashCode(callSuper = true)
public class AgentType extends AbstractEntity {
    private String title;
    private String image;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agentType")
    private List<Agent> agents;

    @Override
    public String toString() {
        return "AgentType{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
