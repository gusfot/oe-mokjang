/**
 * 
 */
package kr.ch.oe.service;

import kr.ch.oe.dao.TestMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gusfot
 *
 */
@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestMapper testMapper;
	@Override
	public void test() {
		testMapper.test();
		
	}

}
