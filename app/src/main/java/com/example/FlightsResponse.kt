data class FlightsResponse(
    val itineraries: List<Itinerary>,
    val legs: List<Leg>
)

data class Itinerary(
    val id: Int,
    val price: Double
)

data class Leg(
    val id: Int,
    val duration: Int,
    val stops: Int,
    val airline: String
)