package com.atm.atmproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
public class AccountLogDto {

    private Long accountId;
    private Long userId;
    private int transactionDetail;
    private Long sendingUserId;
    private BigDecimal sendedAmount;


}
