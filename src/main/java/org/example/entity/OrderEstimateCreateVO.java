package org.example.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 
 * @author liuwq
 *
 */
@Data
@ToString
public class OrderEstimateCreateVO {

	private String uuid;

	private String orderUuid;

	private String orderCode;

	private List<OrderEstimateMetaDataVO> metaData;

	private String productType;

	private String orderDuration;

	private String remark;

}
