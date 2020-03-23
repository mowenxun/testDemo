import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author mowenxun
 * @Date 2020/3/19
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        String str="12,31";
        List<Long> ids = Arrays.stream(str.split(",")).map(Long::parseLong).collect(Collectors.toList());
        for (Long id : ids
        ) {
            System.out.println(id);
        }
    }
}
