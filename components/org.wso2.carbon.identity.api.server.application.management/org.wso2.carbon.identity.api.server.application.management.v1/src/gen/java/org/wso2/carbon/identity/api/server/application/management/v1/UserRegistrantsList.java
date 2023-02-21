/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.application.management.v1.UserRegistrant;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class UserRegistrantsList  {
  
    private Integer totalResults;
    private List<UserRegistrant> userRegistrants = null;


    /**
    * Number of user registrants.
    **/
    public UserRegistrantsList totalResults(Integer totalResults) {

        this.totalResults = totalResults;
        return this;
    }
    
    @ApiModelProperty(example = "2", value = "Number of user registrants.")
    @JsonProperty("totalResults")
    @Valid
    public Integer getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
    **/
    public UserRegistrantsList userRegistrants(List<UserRegistrant> userRegistrants) {

        this.userRegistrants = userRegistrants;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("userRegistrants")
    @Valid
    public List<UserRegistrant> getUserRegistrants() {
        return userRegistrants;
    }
    public void setUserRegistrants(List<UserRegistrant> userRegistrants) {
        this.userRegistrants = userRegistrants;
    }

    public UserRegistrantsList addUserRegistrantsItem(UserRegistrant userRegistrantsItem) {
        if (this.userRegistrants == null) {
            this.userRegistrants = new ArrayList<>();
        }
        this.userRegistrants.add(userRegistrantsItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRegistrantsList userRegistrantsList = (UserRegistrantsList) o;
        return Objects.equals(this.totalResults, userRegistrantsList.totalResults) &&
            Objects.equals(this.userRegistrants, userRegistrantsList.userRegistrants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalResults, userRegistrants);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class UserRegistrantsList {\n");
        
        sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
        sb.append("    userRegistrants: ").append(toIndentedString(userRegistrants)).append("\n");
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
        return o.toString().replace("\n", "\n");
    }
}

