package asia.huangzhitao.partnermatchingbackend.utils.script;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * 用户信息
 * author : hwang
 * data : 13:27 2024/2/29
 * description : userInfo
 */
@Data
public class userInfo {
    /**
     * id
     */
    @ExcelProperty("编号")
    private String planetCode;

    /**
     * 用户昵称
     */
    @ExcelProperty("用户昵称")
    private String username;
}
