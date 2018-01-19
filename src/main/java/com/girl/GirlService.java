package com.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>girl/com.girl</p>
 *
 * @author Created by BruceZheng
 * @date 2017-12-27 16:48
 **/
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void inserTwo() {
            Girl girl = new Girl();
            girl.setSizeCup("A");
            girl.setAge(20);
            girlRepository.save(girl);

            Girl girl1 = new Girl();
            girl1.setAge(22);
            girl1.setSizeCup("Ccccccccccc");
            girlRepository.save(girl1);
    }
}
