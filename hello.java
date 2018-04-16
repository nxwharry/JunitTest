@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello(){
        return "5. Hello jenkins, " + new Date();
    }
}
