package movie;

import movie.model.Screening;
import movie.service.ScreeningServiceInterface;

import java.util.Collection;

public class ScreeningController {


    public Collection<Screening> listScreenings() {

        return screeningService.listScreenings();

    }

    private ScreeningService screeningService;

    // instantiate calculator controller with constructor

    public ScreeningController(ScreeningService screeningService) {

        this.screeningService = screeningService;

    }



}
