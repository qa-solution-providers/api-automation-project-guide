#Call current weather data for one location

Helps developer's fetch current weather for a particular location based on :
By city name
By city ID
By geographic coordinates
By ZIP code

##By city name
	
You can call by city name or city name, state code and country code. Please note that searching by states available only for the USA locations.

api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
api.openweathermap.org/data/2.5/weather?q={city name},{state code}&appid={API key}
api.openweathermap.org/data/2.5/weather?q={city name},{state code},{country code}&appid={API key}

##By city Id

api.openweathermap.org/data/2.5/weather?id={city id}&appid={API key}

##By geographic coordinates

api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}

##By ZIP Code

api.openweathermap.org/data/2.5/weather?zip={zip code},{country code}&appid={API key}