package pius.openfeign.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import pius.openfeign.client.response.Post

@FeignClient(name= "DummyClient", url= "https://dummyjson.com")
interface DummyClient {

    @GetMapping("/posts")
    fun getProducts():Any
}