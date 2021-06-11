package KotlinLearnings.src

import java.util.*

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(entityType: EntityType): EntityObj {
        val id = UUID.randomUUID().toString()
        val name = when (entityType) {
            EntityType.EASY -> entityType.name
            EntityType.MEDIUM -> entityType.getFormattedName()
            EntityType.HARD -> "HARD"
            else -> "None"
        }
        return when (entityType) {
            EntityType.EASY -> EntityObj.Easy(id, name)
            EntityType.MEDIUM -> EntityObj.Medium(id, name)
            EntityType.HARD -> EntityObj.Hard(id, name, 2.5f)
            EntityType.HELP -> EntityObj.Help
            else -> EntityObj.Help
        }
    }
}

sealed class EntityObj {
    object Help : EntityObj() {
        val name = "Help"
    }

    data class Easy(val id: String, val name: String) : EntityObj() {
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }

    data class Medium(val id: String, val name: String) : EntityObj()
    data class Hard(val id: String, val name: String, val multiplier: Float) : EntityObj()
//    override fun toString(): String {
//        return "id=$id, name=$name"
//    }
}

fun EntityObj.Medium.printInfo() {
    println("Medium class: $id")
}

val EntityObj.Medium.info: String
    get() = "Some Info"

fun main(args: Array<String>) {
    /*
    val entityObjEasy: EntityObj = EntityFactory.create(EntityType.EASY)
    println(entityObjEasy)

    val entityObjMedium: EntityObj = EntityFactory.create(EntityType.MEDIUM)
    println(entityObjMedium)

    val entityObj: EntityObj = EntityFactory.create(EntityType.EASY)
    val message = when(entityObj){
        is EntityObj.Easy -> "easy class"
        is EntityObj.Hard -> "hard class"
        EntityObj.Help -> "help class"
        is EntityObj.Medium -> "medium class"
    }
    print(message)
    */

    val entity1: EntityObj = EntityObj.Easy("id", "name")
    val entity2: EntityObj = EntityObj.Easy("id", "name") //entity1.copy(name ="New Name")
    if (entity1 == entity2) {
        println("They are equal")
    } else {
        println("They are not equal")
    }

    val entityMedium: EntityObj = EntityFactory.create(EntityType.MEDIUM)
    if (entityMedium is EntityObj.Medium) {
        println("${entityMedium.info}")
        entityMedium.printInfo()
    } else {
        println("None")
    }
}