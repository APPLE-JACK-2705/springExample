package org.example.simple;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlackAndWhiteRoll implements CameraRoll {
    @Value("${frames.count.bw}")
    private int count;

    @Override
    public void processing() {
        count--;
        System.out.println("-1 b/w roll");
        System.out.printf("Roll has %d frame(s)\n", count);
    }
}
