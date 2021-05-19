package cruddemo01.demo.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cruddemo01.demo.entity.Userinfo;
import cruddemo01.demo.mapper.Usermapper;
import cruddemo01.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl extends ServiceImpl<Usermapper, Userinfo> implements Userservice {
    @Autowired
    private Usermapper usermapper;

    @Override
    public Userinfo[] resultDemo(Integer age) {
        return  null;
    }







}
