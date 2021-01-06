package cheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {
    private String userId;
    private String userName;
    private String age;
}
