package org.example;

import org.springframework.stereotype.Component;

@Component
public class BlackAndWhileRoll implements CameraRoll{
    @Override
    public void processing() {
        System.out.println("-1 b/w roll");
    }
}
