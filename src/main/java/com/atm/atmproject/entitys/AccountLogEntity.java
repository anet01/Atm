package com.atm.atmproject.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account_log")
public class AccountLogEntity extends BaseEntity implements Serializable {

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "transaction_detail")
    private int transactionDetail;

    @Column(name = "sended_user_id")
    private int sendingUserId;

    @Column(name = "sended_amount")
    private BigDecimal sendedAmount;

}
