package com.wavestore.oauth.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wavestore.oauth.client.ProductFeignClient;
import com.wavestore.service.products.commons.entity.BassAmpCabinet;
import com.wavestore.service.products.commons.entity.BassAmpHead;
import com.wavestore.service.products.commons.entity.BassComboAmp;
import com.wavestore.service.products.commons.entity.Brand;
import com.wavestore.service.products.commons.entity.GuitarAmpCabinet;
import com.wavestore.service.products.commons.entity.GuitarAmpHead;
import com.wavestore.service.products.commons.entity.GuitarComboAmp;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductFeignClient productFeignClient;
	
	/* Bass Amp Cabinet */
	
	@Override
	public List<BassAmpCabinet> getBassAmpCabinetList() {
		return productFeignClient.getBassAmpCabinetList();
	}

	@Override
	public Page<BassAmpCabinet> getBassAmpCabinetListWithPagination(int offset, int pageSize) {
		Page<BassAmpCabinet> catalogWithPagination = productFeignClient.getBassAmpCabinetListWithPagination(offset, pageSize);
		return catalogWithPagination;
	}
	
	@Override
	public Page<BassAmpCabinet> getBassAmpCabinetByBrandIn(Collection<Integer> brands, Pageable pageable) {
		Page<BassAmpCabinet> catalogWithPagination = productFeignClient.getBassAmpCabinetByBrandIn(brands, pageable);
		return catalogWithPagination;
	}

	@Override
	public BassAmpCabinet getBassAmpCabinetById(int id) {
		return productFeignClient.getBassAmpCabinetById(id);
	}

	@Override
	public long getTableBassAmpCabinetCount() {
		return productFeignClient.getTableBassAmpCabinetCount();
	}
	
	/* Bass Amp Head */


	@Override
	public List<BassAmpHead> getBassAmpHeadList() {
		return productFeignClient.getBassAmpHeadList();
	}

	@Override
	public Page<BassAmpHead> getBassAmpHeadListWithPagination(int offset, int pageSize) {
		Page<BassAmpHead> catalogWithPagination = productFeignClient.getBassAmpHeadListWithPagination(offset, pageSize);
		return catalogWithPagination;
	}

	@Override
	public Page<BassAmpHead> getBassAmpHeadByBrandIn(Collection<Integer> brands, Pageable pageable) {
		Page<BassAmpHead> catalogWithPagination = productFeignClient.getBassAmpHeadByBrandIn(brands, pageable);
		return catalogWithPagination;
	}

	@Override
	public BassAmpHead getBassAmpHeadById(int id) {
		return productFeignClient.getBassAmpHeadById(id);
	}

	@Override
	public long getTableBassAmpHeadCount() {
		return productFeignClient.getTableBassAmpHeadCount();
	}	

	/* Bass Combo Amp */
	
	@Override
	public List<BassComboAmp> getBassComboAmpList() {
		return productFeignClient.getBassComboAmpList();
	}

	@Override
	public Page<BassComboAmp> getBassComboAmpListWithPagination(int offset, int pageSize) {
		Page<BassComboAmp> catalogWithPagination = productFeignClient.getBassComboAmpListWithPagination(offset, pageSize);
		return catalogWithPagination;
	}

	@Override
	public Page<BassComboAmp> getBassComboAmpByBrandIn(Collection<Integer> brands, Pageable pageable) {
		Page<BassComboAmp> catalogWithPagination = productFeignClient.getBassComboAmpByBrandIn(brands, pageable);
		return catalogWithPagination;
	}

	@Override
	public BassComboAmp getBassComboAmpById(int id) {
		return productFeignClient.getBassComboAmpById(id);
	}

	@Override
	public long getTableBassComboAmpCount() {
		return productFeignClient.getTableBassComboAmpCount();
	}
	
	/* Guitar Amp Cabinet */

	@Override
	public List<GuitarAmpCabinet> getGuitarAmpCabinetList() {
		return productFeignClient.getGuitarAmpCabinetList();
	}

	@Override
	public Page<GuitarAmpCabinet> getGuitarAmpCabinetListWithPagination(int offset, int pageSize) {
		Page<GuitarAmpCabinet> catalogWithPagination = productFeignClient.getGuitarAmpCabinetListWithPagination(offset, pageSize);
		return catalogWithPagination;
	}

	@Override
	public Page<GuitarAmpCabinet> getGuitarAmpCabinetByBrandIn(Collection<Integer> brands, Pageable pageable) {
		Page<GuitarAmpCabinet> catalogWithPagination = productFeignClient.getGuitarAmpCabinetByBrandIn(brands, pageable);
		return catalogWithPagination;
	}

	@Override
	public GuitarAmpCabinet getGuitarAmpCabinetById(int id) {
		return productFeignClient.getGuitarAmpCabinetById(id);
	}

	@Override
	public long getTableGuitarAmpCabinetCount() {
		return productFeignClient.getTableGuitarAmpCabinetCount();
	}
	
	/* Guitar Amp Head */

	@Override
	public List<GuitarAmpHead> getGuitarAmpHeadList() {
		return productFeignClient.getGuitarAmpHeadList();
	}

	@Override
	public Page<GuitarAmpHead> getGuitarAmpHeadListWithPagination(int offset, int pageSize) {
		Page<GuitarAmpHead> catalogWithPagination = productFeignClient.getGuitarAmpHeadListWithPagination(offset, pageSize);
		return catalogWithPagination;
	}

	@Override
	public Page<GuitarAmpHead> getGuitarAmpHeadByBrandIn(Collection<Integer> brands, Pageable pageable) {
		Page<GuitarAmpHead> catalogWithPagination = productFeignClient.getGuitarAmpHeadByBrandIn(brands, pageable);
		return catalogWithPagination;
	}

	@Override
	public GuitarAmpHead getGuitarAmpHeadById(int id) {
		return productFeignClient.getGuitarAmpHeadById(id);
	}

	@Override
	public long getTableGuitarAmpHeadCount() {
		return productFeignClient.getTableGuitarAmpHeadCount();
	}
	
	/* Guitar Combo Amp */

	@Override
	public List<GuitarComboAmp> getGuitarComboAmpList() {
		return productFeignClient.getGuitarComboAmpList();
	}

	@Override
	public Page<GuitarComboAmp> getGuitarComboAmpListWithPagination(int offset, int pageSize) {
		Page<GuitarComboAmp> catalogWithPagination = productFeignClient.getGuitarComboAmpListWithPagination(offset, pageSize);
		return catalogWithPagination;
	}

	@Override
	public Page<GuitarComboAmp> getGuitarComboAmpByBrandIn(Collection<Integer> brands, Pageable pageable) {
		Page<GuitarComboAmp> catalogWithPagination = productFeignClient.getGuitarComboAmpByBrandIn(brands, pageable);
		return catalogWithPagination;
	}

	@Override
	public GuitarComboAmp getGuitarComboAmpById(int id) {
		return productFeignClient.getGuitarComboAmpById(id);
	}

	@Override
	public long getTableGuitarComboAmpCount() {
		return productFeignClient.getTableGuitarComboAmpCount();
	}
	
/* Brands */
	
	@Override
	public List<Brand> getBrandByIds(Collection<Integer> ids) {
		return productFeignClient.getBrandByIds(ids);
	}

}
