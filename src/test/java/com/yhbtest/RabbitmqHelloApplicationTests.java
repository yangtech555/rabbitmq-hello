package com.yhbtest;
import com.yhbtest.RabbitmqHelloApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitmqHelloApplication.class)
public class RabbitmqHelloApplicationTests{

	@Autowired
	private Sender sender;

	@Test
	public void hello() throws Exception{
		 for(int i=0;i<500000;i++){
			 sender.send();
		 }

	}

}
