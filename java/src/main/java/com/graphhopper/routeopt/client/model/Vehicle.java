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
import com.graphhopper.routeopt.client.model.Address;
import com.graphhopper.routeopt.client.model.ModelBreak;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Vehicle
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-20T15:55:03.557+02:00")
public class Vehicle   {
  @SerializedName("vehicle_id")
  private String vehicleId = null;

  @SerializedName("type_id")
  private String typeId = null;

  @SerializedName("start_address")
  private Address startAddress = null;

  @SerializedName("end_address")
  private Address endAddress = null;

  @SerializedName("break")
  private ModelBreak _break = null;

  @SerializedName("return_to_depot")
  private Boolean returnToDepot = null;

  @SerializedName("earliest_start")
  private Long earliestStart = null;

  @SerializedName("latest_end")
  private Long latestEnd = null;

  @SerializedName("skills")
  private List<String> skills = new ArrayList<String>();

  public Vehicle vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Unique identifier of vehicle
   * @return vehicleId
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier of vehicle")
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public Vehicle typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Unique identifier referring to the available vehicle types
   * @return typeId
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier referring to the available vehicle types")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public Vehicle startAddress(Address startAddress) {
    this.startAddress = startAddress;
    return this;
  }

   /**
   * Get startAddress
   * @return startAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public Address getStartAddress() {
    return startAddress;
  }

  public void setStartAddress(Address startAddress) {
    this.startAddress = startAddress;
  }

  public Vehicle endAddress(Address endAddress) {
    this.endAddress = endAddress;
    return this;
  }

   /**
   * Get endAddress
   * @return endAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public Address getEndAddress() {
    return endAddress;
  }

  public void setEndAddress(Address endAddress) {
    this.endAddress = endAddress;
  }

  public Vehicle _break(ModelBreak _break) {
    this._break = _break;
    return this;
  }

   /**
   * Get _break
   * @return _break
  **/
  @ApiModelProperty(example = "null", value = "")
  public ModelBreak getBreak() {
    return _break;
  }

  public void setBreak(ModelBreak _break) {
    this._break = _break;
  }

  public Vehicle returnToDepot(Boolean returnToDepot) {
    this.returnToDepot = returnToDepot;
    return this;
  }

   /**
   * Indicates whether vehicle should return to start address or not. If not, it can end at any service activity.
   * @return returnToDepot
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether vehicle should return to start address or not. If not, it can end at any service activity.")
  public Boolean getReturnToDepot() {
    return returnToDepot;
  }

  public void setReturnToDepot(Boolean returnToDepot) {
    this.returnToDepot = returnToDepot;
  }

  public Vehicle earliestStart(Long earliestStart) {
    this.earliestStart = earliestStart;
    return this;
  }

   /**
   * earliest start of vehicle at its start location
   * @return earliestStart
  **/
  @ApiModelProperty(example = "null", value = "earliest start of vehicle at its start location")
  public Long getEarliestStart() {
    return earliestStart;
  }

  public void setEarliestStart(Long earliestStart) {
    this.earliestStart = earliestStart;
  }

  public Vehicle latestEnd(Long latestEnd) {
    this.latestEnd = latestEnd;
    return this;
  }

   /**
   * latest end of vehicle at its end location
   * @return latestEnd
  **/
  @ApiModelProperty(example = "null", value = "latest end of vehicle at its end location")
  public Long getLatestEnd() {
    return latestEnd;
  }

  public void setLatestEnd(Long latestEnd) {
    this.latestEnd = latestEnd;
  }

  public Vehicle skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public Vehicle addSkillsItem(String skillsItem) {
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * array of skills
   * @return skills
  **/
  @ApiModelProperty(example = "null", value = "array of skills")
  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.vehicleId, vehicle.vehicleId) &&
        Objects.equals(this.typeId, vehicle.typeId) &&
        Objects.equals(this.startAddress, vehicle.startAddress) &&
        Objects.equals(this.endAddress, vehicle.endAddress) &&
        Objects.equals(this._break, vehicle._break) &&
        Objects.equals(this.returnToDepot, vehicle.returnToDepot) &&
        Objects.equals(this.earliestStart, vehicle.earliestStart) &&
        Objects.equals(this.latestEnd, vehicle.latestEnd) &&
        Objects.equals(this.skills, vehicle.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, typeId, startAddress, endAddress, _break, returnToDepot, earliestStart, latestEnd, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    startAddress: ").append(toIndentedString(startAddress)).append("\n");
    sb.append("    endAddress: ").append(toIndentedString(endAddress)).append("\n");
    sb.append("    _break: ").append(toIndentedString(_break)).append("\n");
    sb.append("    returnToDepot: ").append(toIndentedString(returnToDepot)).append("\n");
    sb.append("    earliestStart: ").append(toIndentedString(earliestStart)).append("\n");
    sb.append("    latestEnd: ").append(toIndentedString(latestEnd)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

