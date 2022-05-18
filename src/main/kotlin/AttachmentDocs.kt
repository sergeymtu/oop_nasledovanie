package ru.netology

class AttachmentDocs(docs: Docs):Attachment {
    override val type: String = "Docs"
    override val value: Docs = docs
}