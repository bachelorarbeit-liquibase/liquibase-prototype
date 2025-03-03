package myerpapp.base.machine;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import myerpapp.base.order.OrderEntity;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "MACHINES")
public class MachineEntity {

    @Id
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String serialNumber;

    @Column(nullable = false, length = 100)
    private String type;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @OneToMany(mappedBy = "machine")
    private Set<OrderEntity> orders = new LinkedHashSet<>();

}
