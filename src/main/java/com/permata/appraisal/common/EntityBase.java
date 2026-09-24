package com.permata.appraisal.common;

import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public class EntityBase<ID extends Serializable> implements Serializable {

	private static final long serialVersionUID = -2108375341744114587L;

}