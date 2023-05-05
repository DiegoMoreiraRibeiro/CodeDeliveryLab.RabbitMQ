package com.admin.codedeliverylab.rabbitmq.application.consumer

import org.springframework.amqp.core.Message
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class RabbitMQConsumer {

    @Value("\${queue.name}")
    private lateinit var queueName: String

    @RabbitListener(queues = ["\${queue.name}"])
    fun receiveMessage(message: Message) {
        val json = String(message.body)

    }
}
