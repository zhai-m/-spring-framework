import bean.UserDao;
import bean.UserService;
import cn.hutool.core.io.IoUtil;
import cn.zhaim.springframework.beans.PropertyValue;
import cn.zhaim.springframework.beans.PropertyValues;
import cn.zhaim.springframework.beans.factory.config.BeanDefinition;
import cn.zhaim.springframework.beans.factory.config.BeanReference;
import cn.zhaim.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.zhaim.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import cn.zhaim.springframework.core.io.DefaultResourceLoader;
import cn.zhaim.springframework.core.io.Resource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class ApiTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    private void init(){
        resourceLoader = new DefaultResourceLoader();
    }


    @Test
    public void test_ClassPath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_file() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_url() throws IOException {
        Resource resource = resourceLoader.getResource("https://github.com/fuzhengwei/small-spring/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 2. 读取配置文件&注册Bean
        UserService userService = (UserService) beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

}
