package com.doban.service;

import com.doban.domain.Auth;
import com.doban.mapper.AuthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/10.
 * 用户权限管理的服务
 */
@Service
public class AuthService {

    @Autowired
    private AuthMapper authMapper;

    public void login(String userName, String password) {

    }

    public Boolean auth(String path, int userId) {
        String resourcePath = getResourcePath(path);
        String oprate = getOprate(path);
        Auth auth = new Auth(resourcePath, oprate, userId);

        int result = this.authMapper.isLegal(auth);

        if (result != 0) {
            return true;
        }
        return false;
    }

    public String getResourcePath(String path) {
        String result = path.substring(0, path.lastIndexOf("/"));
        return result;
    }

    public String getOprate(String path) {
        String result = path.substring(path.lastIndexOf("/") + 1, path.length());
        return result;
    }
}
