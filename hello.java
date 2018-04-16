@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello(){
        return "13. Hello jenkins, " + new Date();
    }
}
