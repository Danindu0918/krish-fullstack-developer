var net = require ('net');

var port = 49436;
var host = '192.168.1.4';

var server = net.createServer((socket) => {
    socket.on('end', () => {
        console.log('Server: Client Disconnected');
    });
});

server.on('connection', (socket) => {
    console.log('connected from: ${socket.remortAddress}:${socket.remortPort}');
    socket.write('Hey client, How are u!......');
    socket.end();
});

server.on('error', (err) => {
    throw err;
});

server.listen(port, host);