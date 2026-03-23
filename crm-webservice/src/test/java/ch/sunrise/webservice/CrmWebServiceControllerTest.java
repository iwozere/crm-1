package ch.sunrise.webservice;

import ch.sunrise.ws.tasks.WebServiceTaskAggregator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Integration tests for CrmWebServiceController.
 */
@WebMvcTest(CrmWebServiceController.class)
class CrmWebServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WebServiceTaskAggregator taskAggregator;

    @Test
    void readonlyEndpoint_shouldReturnOk() throws Exception {
        mockMvc.perform(post("/api/ws/readonly/getCustomer")
                .contentType("application/json")
                .content("{\"customerId\":\"123\"}"))
                .andExpect(status().isOk());
    }

    @Test
    void readwriteEndpoint_shouldReturnOk() throws Exception {
        mockMvc.perform(post("/api/ws/readwrite/updateOrder")
                .contentType("application/json")
                .content("{\"orderId\":\"456\",\"status\":\"SHIPPED\"}"))
                .andExpect(status().isOk());
    }
}