package cruddemo01.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cruddemo01.demo.entity.Userinfo;
import javafx.beans.binding.ObjectBinding;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Usermapper extends BaseMapper<Userinfo> {

    @Select("select * from userinfo where age >20")
    IPage<Userinfo> iPage(Page<Userinfo> page);
//     Userinfo[] selectDemo();
//    Object[] selectDemo();
}
