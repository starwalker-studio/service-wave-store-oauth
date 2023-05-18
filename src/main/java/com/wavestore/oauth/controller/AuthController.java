package com.wavestore.oauth.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
import com.wavestore.service.products.commons.entity.BassAmpHead;
import com.wavestore.service.products.commons.entity.BassComboAmp;
import com.wavestore.service.products.commons.entity.Brand;
import com.wavestore.service.products.commons.entity.GuitarAmpCabinet;
import com.wavestore.service.products.commons.entity.GuitarAmpHead;
import com.wavestore.service.products.commons.entity.GuitarComboAmp;
import com.wavestore.service.users.commons.models.entity.User;

@RestController
public class AuthController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IProductService productService;
	
	/* Bass Amp Cabinet */
	
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
	public Page<BassAmpCabinet> getBassAmpCabinetByBrand(@RequestParam("brands") Collection<Integer> brands, Pageable pageable) {
		Page<BassAmpCabinet> catalogWithPagination = productService.getBassAmpCabinetByBrandIn(brands, pageable);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/bass-amp-cabinet/id/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BassAmpCabinet getBassAmpCabinetById(@RequestParam("id") int id) {
		return productService.getBassAmpCabinetById(id);
	}
	
	@RequestMapping(value = "/bass-amp-cabinet/get-count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableBassAmpCabinetCount() {
		return productService.getTableBassAmpCabinetCount();
	}
	
	/* Bass Amp Head */
	
	@RequestMapping(value = "/bass-amp-head/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassAmpHead> getBassAmpHeadCatalog() {
		return productService.getBassAmpHeadList().stream().collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/bass-amp-head/list/pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassAmpHead> getBassAmpHeadCatalogWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
		Page<BassAmpHead> catalogWithPagination = productService.getBassAmpHeadListWithPagination(offset, limit);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/bass-amp-head/brands/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassAmpHead> getBassAmpHeadByBrand(@RequestParam("brands") Collection<Integer> brands, Pageable pageable) {
		Page<BassAmpHead> catalogWithPagination = productService.getBassAmpHeadByBrandIn(brands, pageable);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/bass-amp-head/id/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BassAmpHead getBassAmpHeadById(@RequestParam("id") int id) {
		return productService.getBassAmpHeadById(id);
	}
	
	@RequestMapping(value = "/bass-amp-head/get-count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableBassAmpHeadCount() {
		return productService.getTableBassAmpHeadCount();
	}
	
	/* Bass Combo Amp */
	
	@RequestMapping(value = "/bass-combo-amp/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BassComboAmp> getBassComboAmpCatalog() {
		return productService.getBassComboAmpList().stream().collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/bass-combo-amp/list/pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassComboAmp> getBassComboAmpCatalogWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
		Page<BassComboAmp> catalogWithPagination = productService.getBassComboAmpListWithPagination(offset, limit);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/bass-combo-amp/brands/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<BassComboAmp> getBassComboAmpByBrand(@RequestParam("brands") Collection<Integer> brands, Pageable pageable) {
		Page<BassComboAmp> catalogWithPagination = productService.getBassComboAmpByBrandIn(brands, pageable);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/bass-combo-amp/id/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BassComboAmp getBassComboAmpById(@RequestParam("id") int id) {
		return productService.getBassComboAmpById(id);
	}
	
	@RequestMapping(value = "/bass-combo-amp/get-count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableBassComboAmpCount() {
		return productService.getTableBassComboAmpCount();
	}
		
	/* Guitar Amp Cabinet */
	
	@RequestMapping(value = "/guitar-amp-cabinet/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GuitarAmpCabinet> getGuitarAmpCabinetCatalog() {
		return productService.getGuitarAmpCabinetList().stream().collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/guitar-amp-cabinet/list/pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarAmpCabinet> getGuitarAmpCabinetCatalogWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
		Page<GuitarAmpCabinet> catalogWithPagination = productService.getGuitarAmpCabinetListWithPagination(offset, limit);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/guitar-amp-cabinet/brands/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarAmpCabinet> getGuitarAmpCabinetByBrand(@RequestParam("brands") Collection<Integer> brands, Pageable pageable) {
		Page<GuitarAmpCabinet> catalogWithPagination = productService.getGuitarAmpCabinetByBrandIn(brands, pageable);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/guitar-amp-cabinet/id/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public GuitarAmpCabinet getGuitarAmpCabinetById(@RequestParam("id") int id) {
		return productService.getGuitarAmpCabinetById(id);
	}
	
	@RequestMapping(value = "/guitar-amp-cabinet/get-count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableGuitarAmpCabinetCount() {
		return productService.getTableGuitarAmpCabinetCount();
	}
	
	/* Guitar Amp Head */
	
	@RequestMapping(value = "/guitar-amp-head/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GuitarAmpHead> getGuitarAmpHeadCatalog() {
		return productService.getGuitarAmpHeadList().stream().collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/guitar-amp-head/list/pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarAmpHead> getGuitarAmpHeadCatalogWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
		Page<GuitarAmpHead> catalogWithPagination = productService.getGuitarAmpHeadListWithPagination(offset, limit);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/guitar-amp-head/brands/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarAmpHead> getGuitarAmpHeadByBrand(@RequestParam("brands") Collection<Integer> brands, Pageable pageable) {
		Page<GuitarAmpHead> catalogWithPagination = productService.getGuitarAmpHeadByBrandIn(brands, pageable);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/guitar-amp-head/id/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public GuitarAmpHead getGuitarAmpHeadById(@RequestParam("id") int id) {
		return productService.getGuitarAmpHeadById(id);
	}
	
	@RequestMapping(value = "/guitar-amp-head/get-count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableGuitarAmpHeadCount() {
		return productService.getTableGuitarAmpHeadCount();
	}
	
	/* Guitar Combo Amp */
	
	@RequestMapping(value = "/guitar-combo-amp/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GuitarComboAmp> getGuitarComboAmpCatalog() {
		return productService.getGuitarComboAmpList().stream().collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/guitar-combo-amp/list/pagination", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarComboAmp> getGuitarComboAmpCatalogWithPagination(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
		Page<GuitarComboAmp> catalogWithPagination = productService.getGuitarComboAmpListWithPagination(offset, limit);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/guitar-combo-amp/brands/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<GuitarComboAmp> getGuitarComboAmpByBrand(@RequestParam("brands") Collection<Integer> brands, Pageable pageable) {
		Page<GuitarComboAmp> catalogWithPagination = productService.getGuitarComboAmpByBrandIn(brands, pageable);
		return catalogWithPagination;
	}
	
	@RequestMapping(value = "/guitar-combo-amp/id/search-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public GuitarComboAmp getGuitarComboAmpById(@RequestParam("id") int id) {
		return productService.getGuitarComboAmpById(id);
	}
	
	@RequestMapping(value = "/guitar-combo-amp/get-count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getTableGuitarComboAmpCount() {
		return productService.getTableGuitarComboAmpCount();
	}
	
	/* Brands */
	
	@RequestMapping(value = "/brands/get-brands-by", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Brand> getBrandsByIdsIn(@RequestParam Collection<Integer> ids) {
		return productService.getBrandByIds(ids);
	}
	
	/* User */
	
	@PostMapping("/save")
	public Map<String, Object> newUser(@RequestBody User user) {
		return userService.createNewUser(user);
	}

}
