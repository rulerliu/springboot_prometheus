package org.example.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 
 * @author liuwq
 *
 */
@Data
@ToString
public class OrderEstimateMetaDataVO {

	private String uuid;

	private String name;

	private Boolean required;

	private BigDecimal score;

}
