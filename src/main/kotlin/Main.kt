import javax.sound.midi.Soundbank

fun main(){
var animal =Animal("lion", "roar")
    animal.makeSound()
    var Dog=Animal("dog","whu! whu")
    Dog.makeSound()
    var Cat=Animal("cat","meows")
    Cat.makeSound()

    var Person=Person("Cynthia",19)
    Person.methodIntroduce()
}
open class animal( var species: String,var sound: String){
  open  fun makeSound(sound: String){
        println(sound)

    }
}


//Create a class called Animal with properties for species and sound.
//Write a method called makeSound that prints "{species} says {sound}."
 class Animal( species:String,sound:String):animal(species, sound){
     fun makeSound(){
        println("$species says $sound")
        println("$species barks $sound")
    }
}
//Create a class called Dog that extends Animal and sets species to "dog" and sound to "woof".
//Override the makeSound method to print "{species} barks {sound}."
class Dog(species: String,sound: String):animal(species,sound){
    // extends animal
    override fun makeSound(sound: String) {
        println("$species barks $sound")
    }
}
//Create a class called Cat that extends Animal and sets species to "cat" and sound to "meow".
//Override the makeSound method to print "{species} meows {sound}."
class Cat(species: String,sound: String):animal(species, sound) {
    override fun makeSound(sound: String) {
        println("$species meows $sound")
    }
}
//Create a class called Person with properties for name and age.
//Write a method called introduce that prints "Hi, my name is {name} and I am {age} years old."
class Person(var name:String, val age:Int) {
    fun methodIntroduce() {
        println("Hi,my name is $name and i am $age years old")
    }
}




