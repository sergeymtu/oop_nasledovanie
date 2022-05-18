package ru.netology


class WallService {
    private var posts: Array<Post> = emptyArray<Post>()


    fun add(post: Post): Post {
        for (i in posts) {
            if (i.id == post.id) return i
        }
        posts += post
        return posts.last()
    }


    fun update(post: Post): Boolean {

        for ((index, p) in posts.withIndex()) {
            if (post.id == posts[index].id) {
                val newPost = p.copy(id = post.id, ownerId = p.ownerId, date = p.date, text = post.text, )
                posts[index] = newPost
                return true
            }
        }
        return false
    }

    fun printPosts(){
        for (post in posts){
            println(" " + post.id + " - " + post.text)
            for (att in post.attachments){
                println("Вложение: " + att.type + " - " + att.value)
            }
        }

    }



}