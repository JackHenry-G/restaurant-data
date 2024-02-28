
# Restaurant data API

This documentation provides an overview of the approach taken to build a small and simple Java Spring Boot application that reads data from an external API about restaurants in a user's local area based on a postcode. The application retrieves the restaurant data in JSON format, and displays the first 10 restaurants on a webpage using HTML, CSS and JS.

The purpose of this small project is to efficiently retrieve data, parse JSON data and clearly dislpay it to the user.

![image](https://github.com/JackHenry-G/restaurant-data/assets/78259929/dcbfd9f6-27e1-48e1-bf3c-ce7abd032342)

# Build, compile, run, usage

After retrieving the project, you should run the below comamnds. Ensure you have maven installed and are in the root directory of the project.

1. To build, execute on the command line:
```
mvn clean install
```

2. To run, execute on the command line:
```
mvn spring-boot:run
```

3. To use - go to http://localhost:8080/restaurants?postcode=EC4M7RF


# Assumptions

The API provided is stable, will not change (often) and provides not null and clean data. Under this assumption, there is little handling of potential changes to the data, handling of null objects or any filtering of results. (e.g. displaying "N/A" or a default value).

The 'first 10' restaurants means the first 10 retrieved from the API. It does not mean the first 10 by alphabetical order or by rating etc.

# Improvements

Provide a way for users to search and filter the data based on the points provided. E.g. filter by ratings above a 4 out of 5 stars, put a radius length option on the search area, search by name, filter by cuisines option. E.g. search for sushi restaurants 10km from EC4M7RF, with a rating above a 4 out of 5.

More robust error handling such as if data was null or empty, in order to display results more clearly to the user. Right now this is handled at a high level, e.g. 'no results found', but it should be handled more granularly like if a rating wasn't retrieved for a restaurant.






