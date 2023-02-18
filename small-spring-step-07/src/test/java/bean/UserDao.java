package bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {


    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "盟哥");
        hashMap.put("10002", "华子");
    }

    public void destroyDataMethod() {
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
