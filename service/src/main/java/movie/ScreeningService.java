package movie;

import movie.model.Screening;
import movie.service.ScreeningServiceInterface;


import java.util.Collection;

public class ScreeningService implements ScreeningServiceInterface {


    private ScreeningFileDAO screeningFileDAO;

        public ScreeningService() {
            super();
            this.screeningFileDAO = screeningFileDAO;
        }

        public Collection<Screening> listScreenings() {

            final ScreeningFileDAO screeningFileDAO = new ScreeningFileDAO();

            Collection<Screening> screenings = screeningFileDAO.readScreening();

            return screenings;

        }

}
