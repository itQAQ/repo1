package cruddemo01.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cruddemo01.demo.entity.Userinfo;
import cruddemo01.demo.mapper.Usermapper;
import org.springframework.beans.factory.annotation.Autowired;

public interface Userservice extends IService<Userinfo> {

   Userinfo[] resultDemo(Integer age);
}
