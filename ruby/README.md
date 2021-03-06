# graphhopper

GraphHopper - the Ruby gem for the Route Optimization API

Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints

This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0
- Package version: 0.1.0
- Build package: class io.swagger.codegen.languages.RubyClientCodegen

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build graphhopper.gemspec
```

Then either install the gem locally:

```shell
gem install ./graphhopper-0.1.0.gem
```
(for development, run `gem install --dev ./graphhopper-0.1.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'graphhopper', '~> 0.1.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'graphhopper', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:
```ruby
# Load the gem
require 'graphhopper'

# Setup authorization
GraphHopper.configure do |config|
  # Configure API key authorization: api_key
  config.api_key['key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['key'] = 'Bearer'
end

api_instance = GraphHopper::SolutionApi.new

key = "key_example" # String | your API key

job_id = "job_id_example" # String | Request solution with jobId


begin
  #Return the solution associated to the jobId
  result = api_instance.get_solution(key, job_id)
  p result
rescue GraphHopper::ApiError => e
  puts "Exception when calling SolutionApi->get_solution: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://graphhopper.com/api/1/vrp*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GraphHopper::SolutionApi* | [**get_solution**](docs/SolutionApi.md#get_solution) | **GET** /solution/{jobId} | Return the solution associated to the jobId
*GraphHopper::VrpApi* | [**post_vrp**](docs/VrpApi.md#post_vrp) | **POST** /optimize | Solves vehicle routing problems


## Documentation for Models

 - [GraphHopper::Activity](docs/Activity.md)
 - [GraphHopper::Address](docs/Address.md)
 - [GraphHopper::Algorithm](docs/Algorithm.md)
 - [GraphHopper::CostMatrix](docs/CostMatrix.md)
 - [GraphHopper::JobId](docs/JobId.md)
 - [GraphHopper::ModelBreak](docs/ModelBreak.md)
 - [GraphHopper::Objective](docs/Objective.md)
 - [GraphHopper::Relation](docs/Relation.md)
 - [GraphHopper::Request](docs/Request.md)
 - [GraphHopper::Response](docs/Response.md)
 - [GraphHopper::Route](docs/Route.md)
 - [GraphHopper::Service](docs/Service.md)
 - [GraphHopper::Shipment](docs/Shipment.md)
 - [GraphHopper::Solution](docs/Solution.md)
 - [GraphHopper::SolutionUnassigned](docs/SolutionUnassigned.md)
 - [GraphHopper::Stop](docs/Stop.md)
 - [GraphHopper::TimeWindow](docs/TimeWindow.md)
 - [GraphHopper::Vehicle](docs/Vehicle.md)
 - [GraphHopper::VehicleType](docs/VehicleType.md)


## Documentation for Authorization


### api_key

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string

