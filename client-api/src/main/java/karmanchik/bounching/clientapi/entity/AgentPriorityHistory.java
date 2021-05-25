package karmanchik.bounching.clientapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "AGENTPRIORITYHISTORY")
@EqualsAndHashCode(callSuper = true)
public class AgentPriorityHistory extends AbstractEntity {
    private LocalDate changeDate;
    private Integer priority;
    
    @ManyToOne
    @JoinColumn(name = "AGENTID", referencedColumnName = "ID")
    private Agent agent;

    @Override
    public String toString() {
        return "AgentPriorityHistory{" +
                "id=" + id +
                ", changeDate=" + changeDate +
                ", priority=" + priority +
                '}';
    }
}
