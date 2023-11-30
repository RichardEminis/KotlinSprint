package lesson14

fun main() {
    val message = ForumMessenger(
        name = "Артем Безухов",
        post = "Жить без ушей плохо, но без ума еще хуже",
        data = "2023-08-22 16:30:01"
    )

    message.publishingPost()
    println()

    val comment = Comment(
        name = "Алеша Апупов",
        post = "Че, a мне норм!",
        data = "2023-08-22 20:34:23"
    )

    comment.publishingPost()
}

open class ForumMessenger(
    var name: String,
    var post: String,
    var data: String
) {
    open fun publishingPost() {
        println("Сообщение: $post\nАвтор: $name\nВремя: $data")
    }
}

class Comment(
    name: String,
    post: String,
    data: String
) : ForumMessenger(name, post, data) {
    override fun publishingPost() {
        println("Комментарий: $post\nАвтор: $name\nВремя: $data\n")
    }
}