package pius.openfeign.client

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pius.openfeign.client.response.Post

@RestController
@RequestMapping("/api/v1/test")
class TestController(private val client:DummyClient) {

    @GetMapping
    fun test():Any {
        return client.getProducts();
    }
}