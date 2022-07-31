package com.atm.atmproject.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accountLog")
public class AccountLogEntity extends BaseEntity{

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accountId")
    private Long accountId;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "transactionDetail")
    private int transactionDetail;

    @Column(name = "sendedUserId")
    private int sendingUserId;

    @Column(name = "sendedAmount")
    private BigDecimal sendedAmount;

}
