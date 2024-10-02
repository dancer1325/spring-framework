* == base class -- for --
  * `HttpMessageConverter` implementations
  * setting supported `MediaTypes`
    * -- through -- `setSupportedMediaTypes(List<MediaType> supportedMediaTypes) {}`
  * | writing output messages, set
    * `Content-Type`
    * `Content-Length`
* `boolean supports(Class<?> clazz){}`
  * allows
    * 👁️specify if `clazz` is supported by this converter 👁️
* `void writeInternal(T t, HttpOutputMessage outputMessage){}`
  * allows
    * writing `T` | `HttpOutputMessage` 
      * `HttpOutputMessage` == actual body
* `T readInternal(Class<? extends T> clazz, HttpInputMessage inputMessage){}`
  * allows
    * reading from `HttpInputMessage` - return -> an object / class is `T`
* `AbstractHttpMessageConverter(Charset defaultCharset, MediaType... supportedMediaTypes) {}`
  * construct an `AbstractHttpMessageConverter` / set
    * `Charset`
    * supported `MediaType`s
* TODO: