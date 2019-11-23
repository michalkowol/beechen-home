package com.michalkowol.beechenhome.animal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
class AnimalController {

    private final Dog burek = new Dog("Burek", 1);
    private final Cat filemon = new Cat("Filemon");
    private final List<Animal> animals = List.of(burek, filemon);

    @GetMapping("/animals")
    List<Animal> getAnimals() {
        return animals;
    }

    @GetMapping("/animals/sounds")
    List<String> getSounds() {
        return animals.stream()
                .map(Animal::makeSound)
                .collect(Collectors.toList());
    }

    @GetMapping("/animals/{name}/die")
    Animal die(@PathVariable String name) {
        Animal found = animals.stream()
                .filter(it -> it.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
        if (found == null) {
            return null;
        }
        found.die();
        return found;
    }
}
