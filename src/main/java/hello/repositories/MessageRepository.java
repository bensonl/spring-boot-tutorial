package hello.repositories;

import hello.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bliu on 3/8/15.
 */
public interface MessageRepository extends CrudRepository<Message, Long> {
}
