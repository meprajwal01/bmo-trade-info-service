/**
 * 
 */
package com.bmo.home.bmotradeinfoservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmo.home.bmotradeinfoservice.model.Trade;

/**
 * @author psharma408
 *
 */
@Repository
public interface TradeRepo extends JpaRepository<Trade, Integer> {

}
