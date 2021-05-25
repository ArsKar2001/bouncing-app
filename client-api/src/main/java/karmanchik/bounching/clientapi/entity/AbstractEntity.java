package karmanchik.bounching.clientapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractEntity implements Serializable {
    @Id
    @Getter
    @Setter
    @GeneratedValue
    protected Integer id;
}
