package com.wavestore.oauth.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavestore.oauth.service.IProductService;
import com.wavestore.oauth.service.IUserService;
import com.wavestore.service.products.commons.entity.BassAmpCabinet;
import com.wavestore.service.users.commons.models.entity.User;

@RestController
public class AuthController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IProductService productService;
	
	@RequestMapping(value = "/bass-amp-cabinet/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassAmpCabinet> getBassAmpCabinetCatalog() {
		return productService.getBassAmpCabinetList().stream().collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/bass-amp-cabinet/list/pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassAmpCabinet> getBassAmpCabinetCatalogWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
		Page<BassAmpCabinet> catalogWithPagination = productService.getBassAmpCabinetListWithPagination(offset, limit);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/bass-amp-cabinet/brands/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassAmpCabinet> getBassAmpCabinetByBrand(@RequestParam("brand") int brand) {
		return productService.getBassAmpCabinetByBrand(brand);
	}
	
	@RequestMapping(value = "/bass-amp-cabinet/id/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BassAmpCabinet getBassAmpCabinetById(@RequestParam("id") int id) {
		return productService.getBassAmpCabinetById(id);
	}
	
	@RequestMapping(value = "/bass-amp-cabinet/get-count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableCount() {
		return productService.getTableCount();
	}
	
	@PostMapping("/save")
	public Map<String, Object> newUser(@RequestBody User user) {
		return userService.createNewUser(user);
	}

}
