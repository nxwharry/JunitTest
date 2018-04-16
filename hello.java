@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello(){
        return "12. Hello jenkins, " + new Date();
    }
}
