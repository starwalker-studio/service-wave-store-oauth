package com.wavestore.oauth.client;

import java.util.Collection;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wavestore.service.products.commons.entity.BassAmpCabinet;
import com.wavestore.service.products.commons.entity.BassAmpHead;
import com.wavestore.service.products.commons.entity.BassComboAmp;
import com.wavestore.service.products.commons.entity.Brand;
import com.wavestore.service.products.commons.entity.GuitarAmpCabinet;
import com.wavestore.service.products.commons.entity.GuitarAmpHead;
import com.wavestore.service.products.commons.entity.GuitarComboAmp;

@FeignClient(name = "service-wavestore-products")
public interface ProductFeignClient {
	
	/* Bass Amp Cabinet */

	@RequestMapping(value = "/bass-amp-cabinet/catalog", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassAmpCabinet> getBassAmpCabinetList();
	
	@RequestMapping(value = "/bass-amp-cabinet/catalog-pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassAmpCabinet> getBassAmpCabinetListWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int pageSize);

	@RequestMapping(value = "/search-by-brand/bass-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassAmpCabinet> getBassAmpCabinetByBrandIn(@RequestParam("brands") Collection<Integer> brands, Pageable pageable);
	
	@RequestMapping(value = "/search-by-id/bass-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BassAmpCabinet getBassAmpCabinetById(@RequestParam("id") int id);
	
	@RequestMapping(value = "/get-count/bass-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableBassAmpCabinetCount();
	
	/* Bass Amp Head */
	
	@RequestMapping(value = "/bass-amp-head/catalog", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassAmpHead> getBassAmpHeadList();
	
	@RequestMapping(value = "/bass-amp-head/catalog-pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassAmpHead> getBassAmpHeadListWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int pageSize);
	
	@RequestMapping(value = "/search-by-brand/bass-amp-head", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassAmpHead> getBassAmpHeadByBrandIn(@RequestParam("brands") Collection<Integer> brands, Pageable pageable);
	
	@RequestMapping(value = "/search-by-id/bass-amp-head", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BassAmpHead getBassAmpHeadById(@RequestParam("id") int id);
	
	@RequestMapping(value = "/get-count/bass-amp-head", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableBassAmpHeadCount();
	
	/* Bass Amp Head */
	
	@RequestMapping(value = "/bass-combo-amp/catalog", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassComboAmp> getBassComboAmpList();
	
	@RequestMapping(value = "/bass-combo-amp/catalog-pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassComboAmp> getBassComboAmpListWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int pageSize);
	
	@RequestMapping(value = "/search-by-brand/bass-combo-amp", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassComboAmp> getBassComboAmpByBrandIn(@RequestParam("brands") Collection<Integer> brands, Pageable pageable);
	
	@RequestMapping(value = "/search-by-id/bass-combo-amp", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BassComboAmp getBassComboAmpById(@RequestParam("id") int id);
	
	@RequestMapping(value = "/get-count/bass-amp-head", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableBassComboAmpCount();
	
	/* Guitar Amp Cabinet */
	
	@RequestMapping(value = "/guitar-amp-cabinet/catalog", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GuitarAmpCabinet> getGuitarAmpCabinetList();
	
	@RequestMapping(value = "/guitar-amp-cabinet/catalog-pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarAmpCabinet> getGuitarAmpCabinetListWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int pageSize);
	
	@RequestMapping(value = "/search-by-brand/guitar-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarAmpCabinet> getGuitarAmpCabinetByBrandIn(@RequestParam("brands") Collection<Integer> brands, Pageable pageable);
	
	@RequestMapping(value = "/search-by-id/guitar-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public GuitarAmpCabinet getGuitarAmpCabinetById(@RequestParam("id") int id);
	
	@RequestMapping(value = "/get-count/guitar-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableGuitarAmpCabinetCount();
	
	/* Guitar Amp Head */
	
	@RequestMapping(value = "/guitar-amp-head/catalog", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GuitarAmpHead> getGuitarAmpHeadList();
	
	@RequestMapping(value = "/guitar-amp-head/catalog-pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarAmpHead> getGuitarAmpHeadListWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int pageSize);
	
	@RequestMapping(value = "/search-by-brand/guitar-amp-head", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarAmpHead> getGuitarAmpHeadByBrandIn(@RequestParam("brands") Collection<Integer> brands, Pageable pageable);
	
	@RequestMapping(value = "/search-by-id/guitar-amp-head", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public GuitarAmpHead getGuitarAmpHeadById(@RequestParam("id") int id);
	
	@RequestMapping(value = "/get-count/guitar-amp-head", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableGuitarAmpHeadCount();
	
	/* Guitar Combo Amp */
	
	@RequestMapping(value = "/guitar-combo-amp/catalog", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GuitarComboAmp> getGuitarComboAmpList();
	
	@RequestMapping(value = "/guitar-combo-amp/catalog-pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarComboAmp> getGuitarComboAmpListWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int pageSize);
	
	@RequestMapping(value = "/search-by-brand/guitar-combo-amp", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarComboAmp> getGuitarComboAmpByBrandIn(@RequestParam("brands") Collection<Integer> brands, Pageable pageable);
	
	@RequestMapping(value = "/search-by-id/guitar-combo-amp", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public GuitarComboAmp getGuitarComboAmpById(@RequestParam("id") int id);
	
	@RequestMapping(value = "/get-count/guitar-combo-amp", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableGuitarComboAmpCount();
	
	/* Brands */
	
	@RequestMapping(value = "/get-brands/brand-by-ids", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Brand> getBrandByIds(@RequestParam("ids") Collection<Integer> ids);

}
