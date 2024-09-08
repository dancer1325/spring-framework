* := HttpMessageConverter / read & write "com.google.protobuf.Messages" -- via -- Google Protocol Buffers
* if you want to generate "com.google.protobuf.Messages" Java classes -> you need `protoc`
* content-type supported by "com.google.protobuf:protobuf-java",  by default
  * "application/x-protobuf"
  * "text/plain"
  * if you add "com.google.protobuf:protobuf-java-util" -> ALSO supported "application/json"
* requirements
  * Protobuf v3+
  * Spring Framework 6.1+
* if you want a configurable HttpMessageConverter -> use `ProtobufJsonFormatHttpMessageConverter`