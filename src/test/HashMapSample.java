package test;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("GK", "中村");
        hm.put("DF", "岩波");
        hm.put("MF", "南野");
        hm.put("FW", "浅野");

        String member = hm.get("FW");
        System.out.println(member);

        int size = hm.size();
        System.out.println(size);

        for (String key : hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }
	}

}
