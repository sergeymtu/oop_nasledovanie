package ru.netology

class AttachmentPhoto(photo: Photo):Attachment {
    override val type: String = "Photo"
    override val value: Photo = photo
}