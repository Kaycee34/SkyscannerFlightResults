import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiService = RetrofitInstance.getRetrofitInstance().create(ApiService::class.java)

        apiService.getFlights().enqueue(object : Callback<FlightsResponse> {
            override fun onResponse(call: Call<FlightsResponse>, response: Response<FlightsResponse>) {
                if (response.isSuccessful) {
                    val flightsResponse = response.body()
                    // Format the flight results and display them in the UI
                } else {
                    // Handle error response
                }
            }

            override fun onFailure(call: Call<FlightsResponse>, t: Throwable) {
                // Handle failure response
            }
        })
    }
}