package guru.springframework.vgbrewery.services;

import guru.springframework.vgbrewery.web.model.BeerDto;
import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
