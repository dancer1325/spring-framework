* == central class / 
  * allows
    * determining -- MediaType / request
      * -- by delegating to -- list of `ContentNegotiationStrategy` instances
    * looking up file extensions / MediaType
      * -- by delegating to -- list of `MediaTypeFileExtensionResolver` instances