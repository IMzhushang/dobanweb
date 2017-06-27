package com.doban.service;

import com.doban.domain.Feed;
import com.doban.mapper.FeedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/10.
 */
@Service
public class FeedService {

    @Autowired
    private FeedMapper feedMapper;

    public  void publish(Feed feed) {
         this.feedMapper.publish(feed);
    }
}
