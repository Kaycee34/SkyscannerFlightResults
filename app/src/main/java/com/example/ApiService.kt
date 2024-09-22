interface ApiService {
    @GET("flights.json")
    fun getFlights(): Call<FlightsResponse>
}