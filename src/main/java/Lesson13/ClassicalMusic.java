package Lesson13;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

;
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("init-method");
    }
    @PreDestroy
    public void doMyDestruct() {
        System.out.println("destroy-method");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
