* == synchronous client /
  * uses
    * perform HTTP requests
    * 👁️shared component 👁️
  * expose a method API
    * simple
    * templated
    * -- over -- HTTP client libraries
      * _Example:_ "java.net.http"
  * 👁️ it's configuration must be prepared on startup 👁️
    * Reason: 🧠 configuration does NOT support concurrent modifications 🧠