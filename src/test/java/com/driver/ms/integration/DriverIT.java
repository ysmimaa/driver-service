package com.driver.ms.integration;

import com.driver.ms.common.constant.DriverConstant;
import com.driver.ms.common.utils.JsonUtils;
import com.driver.ms.entity.Driver;
import com.driver.ms.repository.DriverRepository;
import com.driver.ms.service.DriverService;
import org.hamcrest.MatcherAssert;
import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class DriverIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private DriverService driverService;


    /*@Disabled("Disable until defining the list of users behavior")
    @Test
    void should_return_a_list_of_users() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(DriverConstant.BASE_URL.concat(DriverConstant.DRIVERS)))
                .andReturn();
        String content = result.getResponse().getContentAsString();

        List<Driver> drivers = JsonUtils.deserializeStringToList(content, Driver.class);

        MatcherAssert.assertThat(drivers, IsCollectionWithSize.hasSize(6));
    }*/
}
