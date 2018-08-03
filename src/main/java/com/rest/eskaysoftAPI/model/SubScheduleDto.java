package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class SubScheduleDto implements Serializable, Comparable<SubScheduleDto> {

	private static final long serialVersionUID = 655159852262403024L;

	private Long subScheduleId;
	private String subScheduleName;
	private Long subScheduleIndex;

	private Long scheduleId;

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Long getSubScheduleId() {
		return subScheduleId;
	}

	public void setSubScheduleId(Long subScheduleId) {
		this.subScheduleId = subScheduleId;
	}

	public String getSubScheduleName() {
		return subScheduleName;
	}

	public void setSubScheduleName(String subScheduleName) {
		this.subScheduleName = subScheduleName;
	}

	public Long getSubScheduleIndex() {
		return subScheduleIndex;
	}

	public void setSubScheduleIndex(Long subScheduleIndex) {
		this.subScheduleIndex = subScheduleIndex;
	}

	@Override
	public int compareTo(SubScheduleDto subschedule) {

		return this.subScheduleName.compareTo(subschedule.getSubScheduleName());
	}

}