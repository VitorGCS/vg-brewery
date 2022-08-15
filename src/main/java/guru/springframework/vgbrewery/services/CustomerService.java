package guru.springframework.vgbrewery.services;

import guru.springframework.vgbrewery.web.model.CustomerDto;


import java.util.UUID;

public interface CustomerService {
     CustomerDto getCustomerById( UUID customerId);
}
