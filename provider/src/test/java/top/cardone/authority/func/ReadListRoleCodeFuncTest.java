package top.cardone.authority.func;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cardone.ProviderApplication;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by cardone-home-001 on 2016/4/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProviderApplication.class)
public class ReadListRoleCodeFuncTest {
    @Test
    public void func() throws Exception {
        Set<String> sets = (Set<String>) ApplicationContextHolder.getBean(Func1.class, "readListRoleCodeFunc").func("admin");

        System.out.println(sets);
    }
}