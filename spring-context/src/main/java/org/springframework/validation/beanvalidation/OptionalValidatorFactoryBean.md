* == extension of `LocalValidatorFactoryBean` / 
  * if there is NO available Bean validation -> `Validator` calls -- are turned into -- no-ops (?)
  * if `jakarta.validation` API is present & NO explicit Validator configured -> actual class used | Spring MVC