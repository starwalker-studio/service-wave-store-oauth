package com.wavestore.oauth.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wavestore.service.products.commons.entity.BassAmpCabinet;

@FeignClient(name = "service-wavestore-products")
public interface ProductFeignClient {

	@RequestMapping(value = "/bass-amp-cabinet/catalog", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassAmpCabinet> getProductList();
	
	@RequestMapping(value = "/bass-amp-cabinet/catalog-pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassAmpCabinet> getProductListWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int pageSize);

	@RequestMapping(value = "/search-by-brand/bass-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassAmpCabinet> getBassAmpCabinetByBrand(@RequestParam("brand") int brand);
	
	@RequestMapping(value = "/search-by-id/bass-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BassAmpCabinet getBassAmpCabinetById(@RequestParam("id") int id);
	
	@RequestMapping(value = "/get-count/bass-amp-cabinet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableCount();

}
