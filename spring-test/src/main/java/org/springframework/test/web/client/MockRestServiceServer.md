* == main entry point -- for -- client-side REST testing
* use cases
  * tests / `RestTemplate` is used direct or indirectly
* allows
  * set up expected requests / -- performed through -- `RestTemplate`
  * mock responses -> NO need for actual server
* _Example:_ check
* alternative
  * `MockMvcClientHttpRequestFactory` | `RestTemplate`
    * -> execute requests -- against -- `MockMvc` instance
* `ResponseActions expect(RequestMatcher matcher)`
  * == set up expectation / 1! HTTP request
  * 👁️ ANY number of times can be invoked | before starting 👁️
* `void verify()`
  * verity that ALL expected requests / setup -- via -- `.expect()`, are performed
  * if NOT ALL are met -> `AssertionError`
* `ResponseActions expect(ExpectedCount count, RequestMatcher matcher)`
  * == set up a range of expectations / HTTP request