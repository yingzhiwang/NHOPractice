package com.tw.nho.practicesystem;

import com.tw.nho.practicesystem.Bean.QUser;
import com.tw.nho.practicesystem.Bean.TrainingCamp;
import com.tw.nho.practicesystem.Bean.User;
import com.tw.nho.practicesystem.Dao.TrainingCampRepository;
import com.tw.nho.practicesystem.Dao.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeSystemApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TrainingCampRepository trainingCampRepository;

//    @Autowired
//    private JPAQueryFactory jpaQueryFactory;

    @Test
    public void saveTest()  {
        User user = new User();
        user.setName("a");
        user.setUrl("abc");
        User result = userRepository.save(user);
        log.info(result.toString());
        Assert.assertNotNull(user.getId());
    }

    @Test
    public void findByQueryDslTest()  {
        QUser user = QUser.user;
        Optional<User> one = userRepository.findOne(user.id.eq(1L));

        log.info(one.get().toString());
    }

    @Test
    public void findOneTest() {
        Optional<User> user = userRepository.findById(1L);
        log.info(user.toString());
        Assert.assertNotNull(user);
        Assert.assertEquals(1L, (long) user.get().getId());
    }

    @Test
    public void findAllTest() {
        List<TrainingCamp> camps = trainingCampRepository.findAll();
        System.out.println(camps);
    }


}
