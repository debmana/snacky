package com.deborasroka.snacky;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SnackService {
	
	
	@Autowired
	private SnackRepository repository;
	private Integer sweet=0;
	private Integer salty=0;
	private Integer sour=0;
	private Integer bitter=0;
	private Integer spicy=0;
	
    public List<Snack> listAllSnacks() {
        return repository.findAll();
    }

    
    public Snack getSnack(Integer id) {
        return repository.findById(id).get();
    }
    
    public List<Snack> getSweets() {
    	return repository.findAll();
    }
    
    public List<Snack> getByFlavor (Map<String, String>  flavors){
    	
    	if (flavors.containsKey("sweet") && flavors.get("sweet").equals("1")) {
    		sweet = 1;
    	} else sweet = 0;
    	
    	
    	if (flavors.containsKey("salty") && flavors.get("salty").equals("1")) {
    		salty =  1;
    	} else salty = 0;
    	
    	if (flavors.containsKey("sour") && flavors.get("sour").equals("1")) {
    		sour = 1;
    	} else sour = 0;
    	
    	if (flavors.containsKey("bitter") && flavors.get("bitter").equals("1")) {
    		bitter = 1;
    	} else bitter = 0;
    	
    	if (flavors.containsKey("spicy") && flavors.get("spicy").equals("1")) {
    		spicy = 1;
    	} else spicy = 0; 

    	return repository.findByParametersIn(sweet,salty,sour,bitter,spicy);
    	//return repository.findByParametersIn(flavors.get("sweet"), flavors.get("salty"), flavors.get("sour"), flavors.get("bitter"), flavors.get("spicy") );
    	
 }
    
}
