package guru.springframework.vgbrewery.services;

import guru.springframework.vgbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class DefaultCustomerServiceimpl implements CustomerService{
    
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(customerId).name("GET - Vitor Silva").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("POST - Vitor Silva")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer....");
    }
}
