package com.wavestore.oauth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wavestore.oauth.client.ProductFeignClient;
import com.wavestore.service.products.commons.entity.BassAmpCabinet;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductFeignClient productFeignClient;
	
	@Override
	public List<BassAmpCabinet> getBassAmpCabinetList() {
		return productFeignClient.getProductList();
	}

	@Override
	public Page<BassAmpCabinet> getBassAmpCabinetListWithPagination(int offset, int pageSize) {
		Page<BassAmpCabinet> catalogWithPagination = productFeignClient.getProductListWithPagination(offset, pageSize);
		return catalogWithPagination;
	}
	
	@Override
	public List<BassAmpCabinet> getBassAmpCabinetByBrand(int brand) {
		return productFeignClient.getBassAmpCabinetByBrand(brand);
	}

	@Override
	public BassAmpCabinet getBassAmpCabinetById(int id) {
		return productFeignClient.getBassAmpCabinetById(id);
	}

	@Override
	public long getTableCount() {
		return productFeignClient.getTableCount();
	}


}
