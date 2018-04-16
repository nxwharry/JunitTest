@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello(){
        return "11. Hello jenkins, " + new Date();
    }
}
