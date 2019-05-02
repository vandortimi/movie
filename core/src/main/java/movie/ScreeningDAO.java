package movie;


import movie.model.Screening;
import movie.service.DuplicatedMovieEntryException;
import movie.service.EntryNotFoundException;

import java.util.Collection;

public interface ScreeningDAO {

    Collection<Screening> createScreening(Screening screening) throws DuplicatedMovieEntryException;

    Collection<Screening> readScreening();

    void updateScreening(Screening screening) throws EntryNotFoundException;
    void deleteScreening(Screening screening) throws EntryNotFoundException;

}
