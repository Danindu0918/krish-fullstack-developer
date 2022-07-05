import { Kafka } from "kafkajs";

const kafka = new kafka({
    clientId: "employee-service",
    brokers: ["localhost:49436"],
});

const employee = kafka.employee();

const consumer = kafka.consumer({groupId: "project"});
await consumer.subscribe({topic: "employee-topic", fromBeginning: true});

await consumer.run({
    eachMessage: async ({topic, partition, message}) => {
        console.log({
            partition,
            offset: message.offset,
            value: message.value.toString(),
        });
    },
});

const publish = async () => {
    await employee.connect().catch((error) => {

    });

    for (let i = 0; i < 10; i++){
        await employee.send({
            topic: "employee-topic",
            message: [
                {
                    key:  i.toString(),
                value: JSON.stringify({ empName: "Danindu" + i}),
            },
            ],
        });
    }
};

publish().catch((error) => {
    console.log(error)
});