package karmanchik.bounching.clientapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "SHOP")
@EqualsAndHashCode(callSuper = true)
public class Shop extends AbstractEntity {
    private String title;
    private String address;

    @ManyToOne
    @JoinColumn(name = "AGENTID")
    private Agent agent;

}
