package com.example.demo.service.impl;

import com.example.demo.model.CustomerDTO;
import com.example.demo.service.CustomerService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceInMemoryImpl implements CustomerService {
  private Map<Integer, CustomerDTO> persist = new HashMap<>();

  @Override
  public void addCustomer(int id, String name) {
    persist.put(id, new CustomerDTO(id, name));
  }

  @Override
  public CustomerDTO getCustomer(int id) {
    return persist.get(id);
  }
}
