package com.deborasroka.snacky;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SnackRepository extends JpaRepository<Snack, Integer> {
	
	
	@Query (value ="SELECt * FROM snacks where sweet_tbl=?1 AND salty_tbl=?2 AND sour_tbl=?3 AND bitter_tbl=?4 AND spicy_tbl=?5", nativeQuery = true)
	List<Snack> findByParametersIn(Integer sweet, Integer salty, Integer sour, Integer bitter, Integer spicy );
	
}
