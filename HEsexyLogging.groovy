[{"id":"c4428ec2.917db","type":"tab","label":"Flow 1","disabled":false,"info":""},{"id":"fd442270.65ff8","type":"websocket in","z":"c4428ec2.917db","name":"Hubitat Logsocket","server":"","client":"b327014d.882f3","x":256,"y":160,"wires":[["1ed5be10.ec6b22"]]},{"id":"788b4554.48fd9c","type":"logger","z":"c4428ec2.917db","name":"","filename":"node-red.log","maxsize":1,"maxfiles":10,"complete":"payload","console":false,"file":false,"debug":true,"zip":false,"logtype":"info","x":693,"y":432,"wires":[]},{"id":"1ed5be10.ec6b22","type":"function","z":"c4428ec2.917db","name":"Format","func":"\nmsg.payload = msg.type + ':' + msg.id + '\\t' + msg.name + '\\t' + msg.time + '\\t' + msg.level.toUpperCase() + '\\t' + msg.msg\nreturn msg;","outputs":1,"noerr":0,"x":460,"y":374,"wires":[["788b4554.48fd9c"]]},{"id":"b327014d.882f3","type":"websocket-client","z":"","path":"ws://192.168.10.153/logsocket","tls":"","wholemsg":"true"}]
