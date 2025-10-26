package com.mcore.hsbc.ecif.implementation.base;

import com.mcore.hsbc.ecif.implementation.BootstrapApplication;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = BootstrapApplication.class)
@Ignore
public class BaseTest {
}
