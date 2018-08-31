package z.learn.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import z.learn.model.User;


/**
 * UserApi Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 20, 2018</pre>
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:test-springmvc-servlet.xml")
public class UserApiTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    /**
     * Method: getUserById(String id)
     */
    @Test
    public void testGetUserById() throws Exception {
        this.mockMvc.perform(get("/users", "id=test").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.name").value("test"));
    }

    @Test
    public void testAddUser() throws Exception {
        this.mockMvc.perform(post("/users", new User("abc")).accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.name").value("abc"));
    }

    @Test
    public void testGetUsers() throws Exception {
        this.mockMvc.perform(get("/users/list").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.name").value("abc"));
    }
} 
