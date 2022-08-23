package guru.springframework.vgbrewery.services;

import guru.springframework.vgbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.UUID;

@Slf4j //inject a logger
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).
                beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //TODO
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer....");
    }
}
