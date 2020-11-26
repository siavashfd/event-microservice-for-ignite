package ir.fallahdoust.ignitespring.dao;

import ir.fallahdoust.ignitespring.model.Event;
import org.apache.ignite.springdata22.repository.IgniteRepository;
import org.apache.ignite.springdata22.repository.config.Query;
import org.apache.ignite.springdata22.repository.config.RepositoryConfig;
import org.springframework.stereotype.Repository;

import javax.cache.Cache;
import java.util.List;

@RepositoryConfig(cacheName = "Event")
@Repository
public interface EventRepository extends IgniteRepository<Event, Integer> {

    public List<Cache.Entry<Integer, Event>> findByTimestampGreaterThanEqualOrderByTimestampDesc(long timestamp);

    @Query("SELECT * FROM Event WHERE id = ?")
    public Cache.Entry<Integer, Event> findById(int id);
}

