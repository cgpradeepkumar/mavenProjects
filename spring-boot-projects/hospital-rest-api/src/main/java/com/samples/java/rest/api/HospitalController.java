package com.samples.java.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;

	@RequestMapping(value = "/hospitals/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody Hospital getHospital(@PathVariable("id") int id) throws Exception {

		return hospitalService.getHospital(id);
	}

	@RequestMapping(value = "/hospitals", method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
		return null;
	}

	@RequestMapping(value = "/hospitals", method = RequestMethod.POST)
	public ResponseEntity<String> addHospital(@RequestBody Hospital hospital) {
		hospitalService.addHospital(hospital);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@RequestMapping(value = "/hospitals", method = RequestMethod.PUT)
	public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {
		hospitalService.updateHospital(hospital);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@RequestMapping(value = "/hospitals", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteHospital(@RequestBody Hospital hospital) {
		hospitalService.deleteHospital(hospital);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
