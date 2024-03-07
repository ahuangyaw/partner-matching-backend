package asia.huangzhitao.partnermatchingbackend.model.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 加入队伍封装类
 * author : hwang
 * data : 17:33 2024/3/4
 * description : TeamAddRequest
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 7909609367731613524L;

    /**
     * 队伍id
     */
    private Long teamId;


    /**
     * 密码
     */
    private String password;


}
