package ru.netology

class AttachmentVideo(video: Video):Attachment {
    override val type: String = "Video"
    override val value: Video = video
}