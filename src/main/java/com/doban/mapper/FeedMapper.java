package com.doban.mapper;

import com.doban.domain.Feed;

/**
 * Created by Administrator on 2017/6/10.
 */
public interface FeedMapper {
    void publish(Feed feed);
    void deleteById(int id);
    void updateById(Feed feed);
}
