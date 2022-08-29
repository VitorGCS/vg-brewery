package guru.springframework.vgbrewery.web.mappers;
import guru.springframework.vgbrewery.web.model.CustomerDto;
import guru.springframework.vgbrewery.domain.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);
}
