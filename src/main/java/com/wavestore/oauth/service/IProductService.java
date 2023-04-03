package com.wavestore.oauth.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.wavestore.service.products.commons.entity.BassAmpCabinet;

public interface IProductService {
	
	public List<BassAmpCabinet> getBassAmpCabinetList();
	
	public Page<BassAmpCabinet> getBassAmpCabinetListWithPagination(int offset, int pageSize);
	
	public List<BassAmpCabinet> getBassAmpCabinetByBrand(int brand);
	
	public BassAmpCabinet getBassAmpCabinetById(int id);
	
	public long getTableCount();

}
