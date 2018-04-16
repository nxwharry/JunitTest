@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello(){
        return "4. Hello jenkins, " + new Date();
    }
}
