package asia.huangzhitao.partnermatchingbackend.utils.script;
import com.alibaba.excel.EasyExcel;

import java.util.List;
/**
 * 导入excel数据
 * author : hwang
 * data : 13:23 2024/2/29
 * description : importExcel
 *
 */
public class importExcel {
    /**
     * 读取数据
     */
    public static void main(String[] args) {
        // 写法1：JDK8+ ,不用额外写一个DemoDataListener
        // since: 3.0.0-beta1
        //Excel数据文件放在自己电脑上，能够找到的路径
        String fileName = "E:\\study\\project\\partner-matching\\PartnerMatchingBackend\\src\\main\\resources\\testExcel.xlsx";
          readByListener(fileName);
//        synchronousRead(fileName);

    }
    /**
     * 1.监听器读取
     * 先创建监听器、在读取文件时绑定监听器。
     * 单独抽离处理逻辑，代码清晰易于维护；一条一条处理，适用于数据量大的场景。
     * @param fileName
     */
    public static void readByListener(String fileName) {
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        // 这里每次会读取100条数据 然后返回过来 直接调用使用数据就行
        EasyExcel.read(fileName, userInfo.class, new TableListener()).sheet().doRead();
    }

    /**
     * 2.同步读
     * 同步的返回，不推荐使用，如果数据量大会把数据放到内存里面
     * 无需创建监听器，一次性获取完整数据。
     * 方便简单，但是数据量大时会有等待时常，也可能内存溢出。
     */
    public static void synchronousRead(String fileName) {
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<userInfo> list = EasyExcel.read(fileName).head(userInfo.class).sheet().doReadSync();
        for (userInfo userInfo : list) {
            System.out.println(userInfo);
        }

    }
}
