package jedis.test;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class Union {

	public static void main(String[] args) {
		Jedis jedis=new Jedis("192.168.184.130",6379);
		System.out.println(jedis.ping());
		jedis.set("k1", "v1");
		jedis.set("k2", "v2");
		jedis.set("k3", "vv3");
		System.out.println(jedis.get("k3"));
		System.out.println(jedis.getDB());
		Set<String> set=jedis.keys("*");
		for (String string : set) {
			System.out.println("key:"+string+"\tvalue:"+jedis.get(string));
		}
	}
}
