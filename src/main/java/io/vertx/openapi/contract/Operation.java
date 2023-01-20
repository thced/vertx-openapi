package io.vertx.openapi.contract;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.http.HttpMethod;

import java.util.List;

/**
 * This interface represents the most important attributes of an OpenAPI Operation.
 * <br>
 * <a href="https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.1.0.md#operation-Object">Operation V3.1</a>
 * <br>
 * <a href="https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.3.md#operation-Object">Operation V3.0</a>
 */
@VertxGen
public interface Operation extends OpenAPIObject {

  /**
   * @return operationId of this operation
   */
  String getOperationId();

  /**
   * @return http method of this operation
   */
  HttpMethod getHttpMethod();

  /**
   * @return path in OpenAPI style
   */
  String getOpenAPIPath();

  /**
   * @return tags of this operation
   */
  List<String> getTags();

  /**
   * @return parameters of this operation
   */
  List<Parameter> getParameters();

  /**
   * @return request body of the operation, or null if no request body is defined
   */
  RequestBody getRequestBody();
}
