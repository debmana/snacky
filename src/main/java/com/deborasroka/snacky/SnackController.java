package com.deborasroka.snacky;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/snacks")
public class SnackController {

	
    @Autowired
    SnackService snackService;

    @GetMapping(value="/all", produces = {"application/json", "application/xml" })
    public List<Snack> list() {


        return snackService.listAllSnacks();
    }
	
    @GetMapping("/{id}")
    public ResponseEntity<Snack> get(@PathVariable Integer id) {
        try {
            Snack snack = snackService.getSnack(id);
            return new ResponseEntity<Snack>(snack, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Snack>(HttpStatus.NOT_FOUND);
        }
    }
    
    
    @GetMapping("/byflavor")
    public List<Snack>  getbyflavor(@RequestParam Map<String, String> params) {

        //params.forEach((k,v) -> System.out.println("Key = "
                //+ k + ", Value = " + v));
        try {	
        	return snackService.getByFlavor(params);
        } catch (NoSuchElementException e) {
        	System.out.println(e);
        	return null;
        	
        }
        
        }

        
}
	

