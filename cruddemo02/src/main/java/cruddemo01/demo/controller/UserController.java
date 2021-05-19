package cruddemo01.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cruddemo01.demo.entity.Userinfo;
import cruddemo01.demo.mapper.Usermapper;
import cruddemo01.demo.service.Impl.Userserviceimpl;
import cruddemo01.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
private Userservice userservice;
    @Autowired
    private Usermapper usermapper;

    @PostMapping("/register")
    public String register(Userinfo userinfo){
        boolean result = userservice.save(userinfo);
        if(result) {
            return "index";
        }
        return "register";

    }

@PostMapping("/login")
    public  String login(String name,String password){

    QueryWrapper queryWrapper=new QueryWrapper();
    queryWrapper.eq("name",name);
    queryWrapper.eq("password",password);
    Userinfo result = userservice.getOne(queryWrapper);
    if(result==null){
        return "login";
    }
    return "index";


}
@RequestMapping("/show")
@ResponseBody
public Object show(){
    Userinfo result3 = userservice.getById(1);
    return result3;

}
//分页
@ResponseBody
    @RequestMapping("/page/{pagenum}")
    public Object page(@PathVariable Integer pagenum){
    Page<Userinfo> page=new Page<>(pagenum,2);

    IPage<Userinfo> tb=usermapper.selectPage(page,null);
    return tb;

}

    @RequestMapping("/showmore")
    @ResponseBody
    public Object show02(){
        Page<Userinfo> page=new Page<>(1,1);
        IPage<Userinfo> tb=usermapper.iPage(page);
        return tb;

    }




}
