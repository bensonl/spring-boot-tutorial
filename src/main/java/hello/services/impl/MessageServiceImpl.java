package hello.services.impl;

import com.google.common.collect.Lists;
import hello.domain.Message;
import hello.repositories.MessageRepository;
import hello.services.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by bliu on 3/8/15.
 */
public class MessageServiceImpl implements MessageService {

    private static final Logger log = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Autowired
    private MessageRepository messageRepository;


    public List<Message> findAll() {
        return Lists.newArrayList(messageRepository.findAll());
    }
}
