package com.michalkowol.beechenhome.animal;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Dog implements Animal {

    private final String name;
    private final int age;
    private boolean dead;

    @Override
    public String makeSound() {
        if (dead) {
            return "Barked from behind the grave";
        }
        return "Dog " + name + " with age " + age + " barked";
    }

    @Override
    public void die() {
        dead = true;
    }
}
