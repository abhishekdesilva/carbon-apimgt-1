package org.wso2.carbon.apimgt.rest.api.publisher.dto;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.EndPoint_endpointConfigDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.EndPoint_endpointSecurityDTO;
import java.util.Objects;

/**
 * EndPointDTO
 */
public class EndPointDTO   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("endpointConfig")
  private EndPoint_endpointConfigDTO endpointConfig = null;

  @SerializedName("endpointSecurity")
  private EndPoint_endpointSecurityDTO endpointSecurity = null;

  @SerializedName("maxTps")
  private Long maxTps = null;

  @SerializedName("type")
  private String type = null;

  public EndPointDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the Endpoint entry 
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "UUID of the Endpoint entry ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EndPointDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the Endpoint entry 
   * @return name
  **/
  @ApiModelProperty(example = "Endpoint 1", value = "name of the Endpoint entry ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EndPointDTO endpointConfig(EndPoint_endpointConfigDTO endpointConfig) {
    this.endpointConfig = endpointConfig;
    return this;
  }

   /**
   * Get endpointConfig
   * @return endpointConfig
  **/
  @ApiModelProperty(value = "")
  public EndPoint_endpointConfigDTO getEndpointConfig() {
    return endpointConfig;
  }

  public void setEndpointConfig(EndPoint_endpointConfigDTO endpointConfig) {
    this.endpointConfig = endpointConfig;
  }

  public EndPointDTO endpointSecurity(EndPoint_endpointSecurityDTO endpointSecurity) {
    this.endpointSecurity = endpointSecurity;
    return this;
  }

   /**
   * Get endpointSecurity
   * @return endpointSecurity
  **/
  @ApiModelProperty(value = "")
  public EndPoint_endpointSecurityDTO getEndpointSecurity() {
    return endpointSecurity;
  }

  public void setEndpointSecurity(EndPoint_endpointSecurityDTO endpointSecurity) {
    this.endpointSecurity = endpointSecurity;
  }

  public EndPointDTO maxTps(Long maxTps) {
    this.maxTps = maxTps;
    return this;
  }

   /**
   * Endpoint max tps
   * @return maxTps
  **/
  @ApiModelProperty(example = "1000", value = "Endpoint max tps")
  public Long getMaxTps() {
    return maxTps;
  }

  public void setMaxTps(Long maxTps) {
    this.maxTps = maxTps;
  }

  public EndPointDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "http", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndPointDTO endPoint = (EndPointDTO) o;
    return Objects.equals(this.id, endPoint.id) &&
        Objects.equals(this.name, endPoint.name) &&
        Objects.equals(this.endpointConfig, endPoint.endpointConfig) &&
        Objects.equals(this.endpointSecurity, endPoint.endpointSecurity) &&
        Objects.equals(this.maxTps, endPoint.maxTps) &&
        Objects.equals(this.type, endPoint.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, endpointConfig, endpointSecurity, maxTps, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndPointDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpointConfig: ").append(toIndentedString(endpointConfig)).append("\n");
    sb.append("    endpointSecurity: ").append(toIndentedString(endpointSecurity)).append("\n");
    sb.append("    maxTps: ").append(toIndentedString(maxTps)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

