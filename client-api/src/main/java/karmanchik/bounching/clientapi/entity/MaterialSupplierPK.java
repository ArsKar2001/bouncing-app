package karmanchik.bounching.clientapi.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class MaterialSupplierPK implements Serializable {
    private Integer materialId;
    private Integer supplierId;
}
