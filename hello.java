@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello(){
        return "10. Hello jenkins, " + new Date();
    }
}
