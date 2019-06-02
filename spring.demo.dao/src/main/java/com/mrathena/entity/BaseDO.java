package com.mrathena.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mrathena
 */
@Getter
@Setter
@ToString
public class BaseDO implements Serializable {

	private Long id;
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;

}
