package com.wavestore.oauth.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavestore.service.products.commons.entity.BassAmpCabinet;
import com.wavestore.service.products.commons.entity.BassAmpHead;
import com.wavestore.service.products.commons.entity.BassComboAmp;
import com.wavestore.service.products.commons.entity.Brand;
import com.wavestore.service.products.commons.entity.GuitarAmpCabinet;
import com.wavestore.service.products.commons.entity.GuitarAmpHead;
import com.wavestore.service.products.commons.entity.GuitarComboAmp;

public interface IProductService {
	
	/* Bass Amp Cabinet */
	
	public List<BassAmpCabinet> getBassAmpCabinetList();
	
	public Page<BassAmpCabinet> getBassAmpCabinetListWithPagination(int offset, int pageSize);
	
	public Page<BassAmpCabinet> getBassAmpCabinetByBrandIn(Collection<Integer> brands, Pageable pageable);
	
	public BassAmpCabinet getBassAmpCabinetById(int id);
	
	public long getTableBassAmpCabinetCount();
	
	/* Bass Amp Head */
	
	public List<BassAmpHead> getBassAmpHeadList();
	
	public Page<BassAmpHead> getBassAmpHeadListWithPagination(int offset, int pageSize);
	
	public Page<BassAmpHead> getBassAmpHeadByBrandIn(Collection<Integer> brands, Pageable pageable);
	
	public BassAmpHead getBassAmpHeadById(int id);
	
	public long getTableBassAmpHeadCount();
	
	/* Bass Combo Amp */
	
	public List<BassComboAmp> getBassComboAmpList();
	
	public Page<BassComboAmp> getBassComboAmpListWithPagination(int offset, int pageSize);
	
	public Page<BassComboAmp> getBassComboAmpByBrandIn(Collection<Integer> brands, Pageable pageable);
	
	public BassComboAmp getBassComboAmpById(int id);
	
	public long getTableBassComboAmpCount();
	
	/* Guitar Amp Cabinet */
	
	public List<GuitarAmpCabinet> getGuitarAmpCabinetList();
	
	public Page<GuitarAmpCabinet> getGuitarAmpCabinetListWithPagination(int offset, int pageSize);
	
	public Page<GuitarAmpCabinet> getGuitarAmpCabinetByBrandIn(Collection<Integer> brands, Pageable pageable);
	
	public GuitarAmpCabinet getGuitarAmpCabinetById(int id);
	
	public long getTableGuitarAmpCabinetCount();
	
	/* Guitar Amp Head */
	
	public List<GuitarAmpHead> getGuitarAmpHeadList();
	
	public Page<GuitarAmpHead> getGuitarAmpHeadListWithPagination(int offset, int pageSize);
	
	public Page<GuitarAmpHead> getGuitarAmpHeadByBrandIn(Collection<Integer> brands, Pageable pageable);
	
	public GuitarAmpHead getGuitarAmpHeadById(int id);
	
	public long getTableGuitarAmpHeadCount();
	
	/* Guitar Combo Amp */
	
	public List<GuitarComboAmp> getGuitarComboAmpList();
	
	public Page<GuitarComboAmp> getGuitarComboAmpListWithPagination(int offset, int pageSize);
	
	public Page<GuitarComboAmp> getGuitarComboAmpByBrandIn(Collection<Integer> brands, Pageable pageable);
	
	public GuitarComboAmp getGuitarComboAmpById(int id);
	
	public long getTableGuitarComboAmpCount();
	
	/* Brands */
	
	public List<Brand> getBrandByIds(Collection<Integer> ids);

}
