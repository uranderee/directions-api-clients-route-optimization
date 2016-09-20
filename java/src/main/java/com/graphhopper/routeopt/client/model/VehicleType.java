/**
 * Route Optimization API
 * Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.graphhopper.routeopt.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VehicleType
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-20T15:55:03.557+02:00")
public class VehicleType   {
  @SerializedName("type_id")
  private String typeId = null;

  /**
   * Profile of vehicle type
   */
  public enum ProfileEnum {
    @SerializedName("car")
    CAR("car"),
    
    @SerializedName("bike")
    BIKE("bike"),
    
    @SerializedName("foot")
    FOOT("foot"),
    
    @SerializedName("mtb")
    MTB("mtb"),
    
    @SerializedName("motorcycle")
    MOTORCYCLE("motorcycle"),
    
    @SerializedName("racingbike")
    RACINGBIKE("racingbike"),
    
    @SerializedName("truck")
    TRUCK("truck"),
    
    @SerializedName("small_truck")
    SMALL_TRUCK("small_truck"),
    
    @SerializedName("bus")
    BUS("bus");

    private String value;

    ProfileEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("profile")
  private ProfileEnum profile = null;

  @SerializedName("capacity")
  private List<Integer> capacity = new ArrayList<Integer>();

  @SerializedName("speed_factor")
  private Double speedFactor = null;

  @SerializedName("service_time_factor")
  private Double serviceTimeFactor = null;

  public VehicleType typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Unique identifier for the vehicle type
   * @return typeId
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier for the vehicle type")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public VehicleType profile(ProfileEnum profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Profile of vehicle type
   * @return profile
  **/
  @ApiModelProperty(example = "car", value = "Profile of vehicle type")
  public ProfileEnum getProfile() {
    return profile;
  }

  public void setProfile(ProfileEnum profile) {
    this.profile = profile;
  }

  public VehicleType capacity(List<Integer> capacity) {
    this.capacity = capacity;
    return this;
  }

  public VehicleType addCapacityItem(Integer capacityItem) {
    this.capacity.add(capacityItem);
    return this;
  }

   /**
   * array of capacity dimensions
   * @return capacity
  **/
  @ApiModelProperty(example = "null", value = "array of capacity dimensions")
  public List<Integer> getCapacity() {
    return capacity;
  }

  public void setCapacity(List<Integer> capacity) {
    this.capacity = capacity;
  }

  public VehicleType speedFactor(Double speedFactor) {
    this.speedFactor = speedFactor;
    return this;
  }

   /**
   * speed_factor of vehicle type
   * @return speedFactor
  **/
  @ApiModelProperty(example = "null", value = "speed_factor of vehicle type")
  public Double getSpeedFactor() {
    return speedFactor;
  }

  public void setSpeedFactor(Double speedFactor) {
    this.speedFactor = speedFactor;
  }

  public VehicleType serviceTimeFactor(Double serviceTimeFactor) {
    this.serviceTimeFactor = serviceTimeFactor;
    return this;
  }

   /**
   * service time factor of vehicle type
   * @return serviceTimeFactor
  **/
  @ApiModelProperty(example = "null", value = "service time factor of vehicle type")
  public Double getServiceTimeFactor() {
    return serviceTimeFactor;
  }

  public void setServiceTimeFactor(Double serviceTimeFactor) {
    this.serviceTimeFactor = serviceTimeFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleType vehicleType = (VehicleType) o;
    return Objects.equals(this.typeId, vehicleType.typeId) &&
        Objects.equals(this.profile, vehicleType.profile) &&
        Objects.equals(this.capacity, vehicleType.capacity) &&
        Objects.equals(this.speedFactor, vehicleType.speedFactor) &&
        Objects.equals(this.serviceTimeFactor, vehicleType.serviceTimeFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, profile, capacity, speedFactor, serviceTimeFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleType {\n");
    
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    speedFactor: ").append(toIndentedString(speedFactor)).append("\n");
    sb.append("    serviceTimeFactor: ").append(toIndentedString(serviceTimeFactor)).append("\n");
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

