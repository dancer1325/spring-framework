* == `FunctionalInterface` / 
  * uses
    * `RestTemplate`'s retrieval methods
    * application code
  * implementations of it
    * extract data -- from a -- `ClientHttpResponse`
    * NOT need to worry about
      * exception handling or
      * closing resources
  * `T extractData(ClientHttpResponse response){}`