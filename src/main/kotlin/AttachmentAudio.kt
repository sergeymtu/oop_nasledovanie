package ru.netology

class AttachmentAudio(audio: Audio):Attachment {
    override val type: String = "Audio"
    override val value: Audio = audio
}