package com.ust.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.spring.entity.Flight;
import com.ust.spring.repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository fr;
	
	public Flight create(Flight flight) {
		return fr.save(flight);
	}
	public List<Flight> read() {
		return fr.findAll();
	}
	public Flight read(Integer id) {
		Optional<Flight> temp = fr.findById(id);
		Flight flight=null;
		if(temp.isPresent())
		{
			flight=temp.get();
		}
		return flight;
	}
	public Flight update(Flight flight) {
		Flight temp = read(flight.getId());
		if(temp!=null)
		{
			temp=flight;
			fr.save(temp);
		}
		return temp;
	}
	public Flight delete(Integer id) {
		Flight temp = read(id);
		if(temp!=null)
		{
			fr.delete(temp);
		}
		return temp;
	}
	
}
