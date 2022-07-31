package com.atm.atmproject.entitys;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created_date,update_date"}, allowGetters = true) //İçerdiği jsonları yoksayar
public class BaseEntity {

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;

    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;

    @Column(name = "update_by")
    @LastModifiedBy
    private String updateBy;

    @Column(name = "update_date")
    @LastModifiedDate
    private Date updateDate;

    @Column(name = "system_auto_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;

}