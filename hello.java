@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello(){
        return "6. Hello jenkins, " + new Date();
    }
}
