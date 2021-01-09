package net.xdclass.shopmanager.service.ipl;

import lombok.extern.slf4j.Slf4j;
import net.xdclass.shopmanager.service.UserService;
import org.springframework.stereotype.Service;

@Service
@Slf4j           //@Slf4j 或 @Log
public class UserServiceImpl implements UserService {
    @Override
    public void login(String pwd, String phone) {
        log.info("日志打印用户登录: {}",phone);
    }
}
