@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello(){
        return "14. Hello jenkins, " + new Date();
    }
}
