package hello.services;

import hello.domain.Message;

import java.util.List;

/**
 * Created by bliu on 3/8/15.
 */
public interface MessageService {

    public List<Message> findAll();
}
