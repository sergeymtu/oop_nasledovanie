package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addIdNotNull() {
        val post1 = Post(id = 1, text = "Первый пост")
        val wall = WallService()
        val testPost = wall.add(post1)

        assertEquals(true, testPost.id !== 0)
    }

    @Test
    fun updateIdExist() {
        val post1 = Post(id = 1, text = "Первый пост")
        val post2 = Post(id = 2, text = "Второй пост")
        val post3 = Post(id = 1, text = "Третий пост") //id совпадает
        val post4 = Post(id = 3, text = "Четвертый пост")

        val wall = WallService()
        wall.add(post1)
        val result = wall.update(post3)

        assertEquals(true, result)
    }

    @Test
    fun updateIdNotExist() {
        val post1 = Post(id = 1, text = "Первый пост")
        val post2 = Post(id = 2, text = "Второй пост")
        val post3 = Post(id = 1, text = "Третий пост") //id совпадает
        val post4 = Post(id = 3, text = "Четвертый пост")

        val wall = WallService()
        wall.add(post1)
        val result = wall.update(post3)

        assertEquals(true, result)
    }

}