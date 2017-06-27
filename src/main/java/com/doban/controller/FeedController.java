package com.doban.controller;

import com.doban.domain.Feed;
import com.doban.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/6/10.
 */
@Controller
@RequestMapping("feed")
public class FeedController {

    @Autowired
    private FeedService feedService;

     @RequestMapping(value = "publish",method = RequestMethod.POST)
     public  void publish(Feed feed) {
          this.feedService.publish(feed);
     }
}
