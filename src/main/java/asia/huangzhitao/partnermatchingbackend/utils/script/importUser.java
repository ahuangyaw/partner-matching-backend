package asia.huangzhitao.partnermatchingbackend.utils.script;

import com.alibaba.excel.EasyExcel;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * author : hwang
 * data : 13:51 2024/2/29
 * description : importUser
 */
public class importUser {
    public static void main(String[] args) {
        //Excel数据文件放在自己电脑上，能够找到的路径
        String fileName = "E:\\study\\project\\partner-matching\\PartnerMatchingBackend\\src\\main\\resources\\testExcel.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<userInfo> userInfoList =
                EasyExcel.read(fileName).head(userInfo.class).sheet().doReadSync();
        System.out.println("总数 = " + userInfoList.size());
        Map<String, List<userInfo>> listMap =
                userInfoList.stream()
                        .filter(userInfo -> StringUtils.isNotEmpty(userInfo.getUsername()))//判空
                        .collect(Collectors.groupingBy(userInfo::getUsername));
        for (Map.Entry<String, List<userInfo>> stringListEntry : listMap.entrySet()) {
            if (stringListEntry.getValue().size() > 1) {
                System.out.println("重复username = " + stringListEntry.getKey());
                System.out.println("-----------");
            }
        }
        System.out.println("不重复昵称数 = " + listMap.keySet().size());
        System.out.println("不重复昵称 = " +  listMap.entrySet());
    }
}
