package com.codetron.cloud.queue;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by josetesan on 10/07/16.
 */
@Table(name="HOTELS")
@Entity
@Getter
@ToString
@Builder
public class Hotel implements Serializable {

    @Id
    private Long id;

    private String name;

    private Integer rooms;

    private BigDecimal price;
}
