package com.framework.connection;

import java.util.List;

public class CompleteObject {

	private String realtime_start;
	private String realtime_end;
	private String observation_start;
	private String observation_end;
	private String units;
	private int output_type;
	private String file_type;
	private String order_by;
	private String sort_order;
	private int count;
	private int offset;
	private int limit;
	private List<Obsertvations> observations;

	public String getRealtime_start() {
		return realtime_start;
	}

	public void setRealtime_start(String realtime_start) {
		this.realtime_start = realtime_start;
	}

	public String getRealtime_end() {
		return realtime_end;
	}

	public void setRealtime_end(String realtime_end) {
		this.realtime_end = realtime_end;
	}

	public String getObservation_start() {
		return observation_start;
	}

	public void setObservation_start(String observation_start) {
		this.observation_start = observation_start;
	}

	public String getObservation_end() {
		return observation_end;
	}

	public void setObservation_end(String observation_end) {
		this.observation_end = observation_end;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public int getOutput_type() {
		return output_type;
	}

	public void setOutput_type(int output_type) {
		this.output_type = output_type;
	}

	public String getFile_type() {
		return file_type;
	}

	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}

	public String getOrder_by() {
		return order_by;
	}

	public void setOrder_by(String order_by) {
		this.order_by = order_by;
	}

	public String getSort_order() {
		return sort_order;
	}

	public void setSort_order(String sort_order) {
		this.sort_order = sort_order;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public List<Obsertvations> getObservations() {
		return observations;
	}

	public void setObservations(List<Obsertvations> observations) {
		this.observations = observations;
	}

}
