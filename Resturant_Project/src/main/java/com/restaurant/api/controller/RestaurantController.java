package com.restaurant.api.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.restaurant.api.bean.RestaurantBean;
import com.restaurant.api.bean.RestaurantLocationBean;
import com.restaurant.api.bean.ResturantandLocationDTO;
import com.restaurant.api.service.RestaurantService;
import com.restaurant.api.utils.CsvUtils;
import com.restaurant.api.utils.CustomErrorType;
import com.restaurant.api.utils.CustomSucessType;

@RestController
public class RestaurantController {
	 public static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);
	
	
	  @Autowired 
	  private RestaurantService service;
	 
	
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public @ResponseBody String getValue() {
		return "Welcome To Spring Boot";
	}
	
	@PostMapping(value="/upload_csv/{selectedName}" ,consumes="multipart/form-data")
	public ResponseEntity<?> uploadFileInCSV(@RequestParam("file") MultipartFile file,@PathVariable("selectedName") String selectedName) {
		 try {
			 if(selectedName.equalsIgnoreCase("restaurantbean")) {
			 List<RestaurantBean> al=CsvUtils.readVal(RestaurantBean.class, file.getInputStream());
			 service.saveRestauntdetail(al);
			 }else if(selectedName.equalsIgnoreCase("restaurantLocation")) {
				 List<RestaurantLocationBean> al=CsvUtils.readValLoc(RestaurantLocationBean.class, file.getInputStream());
				 service.saveRestauntLocdetail(al);  
			 }
		} catch (IOException e) {
			//e.printStackTrace();
			logger.error(" File has a some problem {} .", e.getMessage());
			return new ResponseEntity<CustomErrorType>(new CustomErrorType("File has a some problem" +  e.getMessage() 
                    + ""), HttpStatus.NOT_IMPLEMENTED);
		}
		 return new ResponseEntity<CustomSucessType>(new CustomSucessType("Secussful Upload"),HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllRestaurantList")
	public ResponseEntity<List<ResturantandLocationDTO>> getAllRestaurantList(){
		List<ResturantandLocationDTO> user = service.getAllResturantDetails();
        return new ResponseEntity<List<ResturantandLocationDTO>>(user, HttpStatus.OK);
	}
	/*@PostMapping(value="/upload_csv" ,consumes="multipart/form-data")
	public ResponseEntity<?> uploadFileInCSV(@RequestParam("file") MultipartFile file) {
		 try {
			 List<?> al=null;//CsvUtils.readVal(RestaurantCard.class, file.getInputStream());
			service.saveAll(al);
		} catch (IOException e) {
			//e.printStackTrace();
			logger.error(" File has a some problem {} .", e.getMessage());
			return new ResponseEntity<CustomErrorType>(new CustomErrorType("File has a some problem" +  e.getMessage() 
                    + ""), HttpStatus.NOT_IMPLEMENTED);
		}
		 return new ResponseEntity<CustomSucessType>(new CustomSucessType("Secussful Upload"),HttpStatus.OK);
	}
	
	@GetMapping(value="/get-user-info/{id}" )
	public ResponseEntity<?> getUserInfo(@PathVariable("id") String id){
		RestaurantCard user = service.findById(Integer.parseInt(id));
        if (user == null) {
            logger.error("User with id {} not found.", id);
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("User with id " + id 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<RestaurantCard>(user, HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllUser")
	public ResponseEntity<List<RestaurantCard>> getAllUserData(){
		List<RestaurantCard> user = service.getAllUserData();
        return new ResponseEntity<List<RestaurantCard>>(user, HttpStatus.OK);
	}
	
	@GetMapping(value="/indexDataInElastic")
	public ResponseEntity<?> indexerData(){
		return new ResponseEntity<CustomSucessType>(new CustomSucessType(service.indexerData()), HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllDataFromElastic")
	public ResponseEntity<Iterable<RestaurantCardIndexBean>> getAllDataFromElastic(){
		return new ResponseEntity<Iterable<RestaurantCardIndexBean>>(service.getAllDataFromElastic(), HttpStatus.OK);
	}
	
	@GetMapping(value="/searchNameAndId/{text}" )
	public ResponseEntity<?> getInElastic(@PathVariable("text") String param){
		List<RestaurantCardIndexBean> user = service.getInElastic(param);
        if (user == null) {
            logger.error("User with id {} not found.", param);
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("User with id " + param 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<RestaurantCardIndexBean>>(user, HttpStatus.OK);
	}
	
	
	@GetMapping(value="/getDataEducationVsLimitBal")
	public ResponseEntity<List<RestaurantCardDTO>> getDataEducationVsLimitBal(){
		return new ResponseEntity<List<RestaurantCardDTO>>(service.getDataEducationVsLimitBal(), HttpStatus.OK);
	}*/
	
}
