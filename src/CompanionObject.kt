package KotlinLearnings.src

interface IIdProvider {
    fun getId(): String
}

class Entity private constructor(id: String) {
    companion object Factory :IIdProvider{
        const val id = "id"
        fun create() = Entity(getId())
        override fun getId(): String {
            return "123"
        }
    }
}

fun main(args: Array<String>) {
    //val entity = Entity.Companion.create()
    val entity = Entity.Factory.create()
    print(Entity.id)
}