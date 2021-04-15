onEvent('chat.channel.channel.message', event => {
    utils.server.tell([
        "[",
        Text.aqua("Twitch"),
        "] ",
        `${event.user.name}: ${event.message}`
    ]);
    console.info(`Channel ID: ${event.channel.id}`);
});
onEvent('player.chat', event => {
    twitch.client.chat.channels.forEach( (id) => {
        console.info(`Relaying Message to Channel ${id}`);
        twitch.client.chat.sendMessage(id, `[Minecraft] ${event.username}: ${event.message}`);
    });
});