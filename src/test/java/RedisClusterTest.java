import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.exceptions.JedisException;

public class RedisClusterTest {
    public static void main(String[] args) throws Exception {
        JedisCluster jedisCluster = null;
        try {
            ApplicationContext ac = new ClassPathXmlApplicationContext("spring-redis.xml");
            jedisCluster = (JedisCluster) ac.getBean("jedisCluster");
            System.out.println(jedisCluster.get("foo"));
            System.out.println(jedisCluster.set("qq","222"));
            System.out.println(jedisCluster.get("qq"));
        } catch (JedisException je) {
            throw je;
        } finally {
            if (jedisCluster != null) {
                jedisCluster.close();
            }
        }
    }
}
