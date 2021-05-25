package karmanchik.bounching.clientapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "AGENT")
@EqualsAndHashCode(callSuper = true)
public class Agent extends AbstractEntity {
    private String title;
    private String address;
    private String inn;
    private String kpp;
    private String directorName;
    private String phone;
    private String email;
    private String logo;
    private Integer priority;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
    private List<AgentPriorityHistory> agentPriorityHistory;

    @ManyToOne
    @JoinColumn(name = "AGENTTYPEID", referencedColumnName = "ID")
    private AgentType agentType;

    public Agent() {

    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", inn='" + inn + '\'' +
                ", kpp='" + kpp + '\'' +
                ", directorName='" + directorName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", logo='" + logo + '\'' +
                ", priority=" + priority +
                ", agentType=" + agentType +
                '}';
    }
}
