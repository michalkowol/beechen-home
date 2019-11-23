package com.michalkowol.beechenhome.animal;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Cat implements Animal {

    private final String name;
    private int livesLeft = 9;

    @Override
    public String makeSound() {
        if (isDead()) {
            return "Meaow from behind the grave...";
        }
        return "Cat " + name + " meawoe (livesLeft: " + livesLeft + ")";
    }

    public boolean isDead() {
        return livesLeft <= 0;
    }

    @Override
    public void die() {
        livesLeft = livesLeft - 1;
    }
}
