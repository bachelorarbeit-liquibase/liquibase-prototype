package myerpapp.base.order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import myerpapp.base.customer.CustomerEntity;
import myerpapp.base.machine.MachineEntity;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "ORDER")
public class OrderEntity {

    @Id
    @Column(nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private CustomerEntity customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private MachineEntity machine;

    @Column(nullable = false)
    private LocalDate orderDate;

}
